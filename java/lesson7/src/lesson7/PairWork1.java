package lesson7;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author DICKY LAKSONO
 * @author HANG
 *
 */
public class PairWork1 {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		String playerName1;
		String playerName2;
		int playerHealth1 = 50;
		int playerHealth2 = 50;
		int playerAttack = 15;
		int playerDefense = 10;
		int enemyHealth = 100;
		int enemyAttack = 15;
		int enemyDefense = 10;

		System.out.println("* * * * * * * * * * * * * * * * * * *");
		System.out.println();
		System.out.println("キャラクターの名前を入力してください:");
		Thread.sleep(2000);

		System.out.print("キャラクター 1 : ");
		playerName1 = scan.nextLine();
		System.out.print("キャラクター 2 : ");
		playerName2 = scan.nextLine();
		for (int i = 0; i < 19; i++) {
			System.out.print("= ");
			Thread.sleep(500);
		}
		Thread.sleep(500);
		System.out.println();
		System.out.println();
		System.out.println("--- ようこそ " + playerName1 + " & " + playerName2 + "! ---");
		System.out.println();
		Thread.sleep(500);
		for (int i = 0; i < 19; i++) {
			System.out.print("= ");
			Thread.sleep(500);
		}
		while (playerHealth1 > 0 && enemyHealth > 0 || playerHealth2 > 0 && enemyHealth > 0) {

			System.out.println("\t");
			System.out.println("------------------------------------");
			Thread.sleep(500);
			System.out.println(playerName1 + " のHP: " + playerHealth1 + "点");
			Thread.sleep(500);
			System.out.println(playerName2 + " のHP: " + playerHealth2 + "点");
			Thread.sleep(500);
			System.out.println("🐉 敵の HP : " + enemyHealth + "点");
			System.out.println();
			System.out.println("------------------------------------");
			System.out.println();
			Thread.sleep(500);
			System.out.println("選択:");
			System.out.println("1. 攻撃 ⚔");
			System.out.println("2. 防衛 🛡");
			System.out.println("====================================");

			System.out.println("1番目ののプレイヤーのターン : ");
			int choice = scan.nextInt();

			if (choice == 1) {
				int damageDealt = playerAttack;
				int damageReceived = enemyAttack - playerDefense;

				if (damageDealt > 0) {
					enemyHealth -= damageDealt;
					System.out.println("敵のHPに " + damageDealt + " ダメージを与える");
				} else {
					System.out.println("攻撃無効");
				}

			} else if (choice == 2) {
				System.out.println("防衛力アップ +⇑🛡");
				System.out.println(enemyAttack - playerDefense + "点 ダメージを受ける");
				System.out.println(playerAttack - enemyDefense + "点 ダメージを与える");
				enemyHealth -= playerAttack - enemyDefense;
			} else {
				System.out.println("攻撃するために' 1 'を入力してください");
				continue;

			}

			Thread.sleep(500);

			while (true) {
				System.out.println("====================================");
				System.out.println("2番目ののプレイヤーのターン : ");
				int choice2 = scan.nextInt();

				int damageDealt = playerAttack;
				int damageReceived = enemyAttack - playerDefense;
				if (choice2 == 1) {

					if (damageDealt > 0) {
						enemyHealth -= damageDealt;
						System.out.println("敵のHPに " + damageDealt + " ダメージを与える");
					} else {
						System.out.println("攻撃無効");
					}
					if (damageReceived > 0) {
						int R = r.nextInt(3);
						if (R == 1) {
							playerHealth1 -= enemyAttack;
							System.out.println();
							System.out.println(playerName1 + " 敵の攻撃を " + enemyAttack + " 点ダメージを受ける.");
						} else if (R == 2) {
							playerHealth2 -= enemyAttack;
							System.out.println();
							System.out.println(playerName2 + " 敵の攻撃を " + enemyAttack + " 点ダメージを受ける.");
						} else {
							Thread.sleep(1000);
							System.out.println();
							System.out.println("敵の攻撃がミスしました");
						}

					}
					break;
				} else if (choice2 == 2 && damageReceived > 0) {
					System.out.println("防衛力アップ +⇑🛡");
					enemyHealth -= playerAttack - enemyDefense;
					System.out.println(enemyAttack - playerDefense + "点 ダメージを受る");
					System.out.println(playerAttack - enemyDefense + "点 ダメージを与える");
					int R = r.nextInt(3);
					if (R == 1) {
						playerHealth1 -= enemyAttack;

						System.out.println();
						System.out.println(playerName1 + " 敵の攻撃を " + enemyAttack + "点 ダメージを受ける.");
					} else if (R == 2) {
						playerHealth2 -= damageReceived;

						System.out.println();
						System.out.println(playerName2 + " 敵の攻撃を " + damageReceived + "点 ダメージを受ける.");
					} else {
						Thread.sleep(1000);
						System.out.println();
						System.out.println("敵の攻撃がミスしました");
					}
					break;

				} else {
					System.out.println("攻撃するために' 1 'を入力してください");
					continue;
				}
			}

			System.out.println("");
			if (playerHealth1 <= 0 || playerHealth2 <= 0 && enemyHealth > 0) {
				System.out.println();
				System.out.println("====================================");
				System.out.println("😢😢😢 残念!!あなたは負けた 😢😢😢");
				break;

			} else if (enemyHealth <= 0) {
				System.out.println();
				System.out.println("====================================");
				System.out.println("🎺🎺🎺 おめでとう!!敵を倒しました 🎺🎺🎺");
				break;
			}

			System.out.println("====================================");

		}
	}
}
