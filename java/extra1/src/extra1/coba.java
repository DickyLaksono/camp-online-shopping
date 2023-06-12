package extra1;

import java.util.Random;
import java.util.Scanner;

public class coba {

	public static void main(String[] args) {

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

		System.out.println("ようこそ RPG Game へ");
		System.out.println();
		System.out.println("名前を入力してください : ");

		System.out.print("キャラクター 1 : ");
		playerName1 = scan.nextLine();
		System.out.print("キャラクター 2 : ");
		playerName2 = scan.nextLine();
		System.out.println("ようこそ " + playerName1 + " & " + playerName2 + "!");
		while (playerHealth1 > 0 && enemyHealth > 0 || playerHealth2 > 0 && enemyHealth > 0) {
			System.out.println("====================================");
			System.out.println(playerName1 + " のHP: " + playerHealth1 + "点");
			System.out.println(playerName2 + " のHP: " + playerHealth2 + "点");
			System.out.println("🐉 敵の HP : " + enemyHealth + "点");
			System.out.println("------------------------------------");
			System.out.println("選択:");
			System.out.println("1. 攻撃");
			System.out.println("2. 防衛");
			System.out.println("====================================");

			System.out.println("1番目ののプレイヤーのターン : ");
			int choice = scan.nextInt();

			if (choice == 1) {
				int damageDealt = playerAttack;
				int damageReceived = enemyAttack - playerDefense;

				if (damageDealt > 0) {
					enemyHealth -= damageDealt;
					System.out.println("敵のHPを " + damageDealt + " 点減らしました");
				} else {
					System.out.println("攻撃無効");
				}

			} else if (choice == 2) {
				System.out.println("防衛力アップ +⇑");
			} else {
				System.out.println("攻撃するために' 1 'を入力してください");
				continue;

			}

			System.out.println("====================================");
			System.out.println("2番目ののプレイヤーのターン : ");
			int choice2 = scan.nextInt();

			int damageDealt = playerAttack;
			int damageReceived = enemyAttack - playerDefense;
			if (choice2 == 1) {

				if (damageDealt > 0) {
					enemyHealth -= damageDealt;
					System.out.println("敵のHPを " + damageDealt + " 点減らしました");
				} else {
					System.out.println("攻撃無効");
				}
				if (damageReceived > 0) {
					int R = r.nextInt(3);
					if (R == 1) {
						playerHealth1 -= enemyAttack;
						System.out.println();
						System.out.println(playerName1 + " 敵の攻撃を " + enemyAttack + " 点ダメージを受けた.");
					} else if (R == 2) {
						playerHealth2 -= enemyAttack;
						System.out.println();
						System.out.println(playerName2 + " 敵の攻撃を " + enemyAttack + " 点ダメージを受けた.");
					} else {
						System.out.println("敵の攻撃無効.");
					}

				}
			} else if (choice2 == 2 && damageReceived > 0) {
				System.out.println("防衛力アップ +⇑");
				int R = r.nextInt(3);
				if (R == 1) {
					playerHealth1 -= damageReceived;
					System.out.println();
					System.out.println(playerName1 + " 敵の攻撃を " + damageReceived + " 点ダメージを受けた.");
				} else if (R == 2) {
					playerHealth2 -= damageReceived;
					System.out.println();
					System.out.println(playerName2 + " 敵の攻撃を " + damageReceived + " 点ダメージを受けた.");
				} else {
					System.out.println("敵の攻撃無効.");
				}

			} else {
				System.out.println("攻撃するために' 1 'を入力してください");
				continue;
			}

			System.out.println("");
			if (playerHealth1 <= 0 || playerHealth2 <= 0) {
				System.out.println("====================================");
				System.out.println("😢😢😢 残念!!あなたは負けた 😢😢😢");
				break;

			} else if (enemyHealth <= 0) {
				System.out.println("====================================");
				System.out.println("🎺🎺🎺 おめでとう!!敵を倒しました 🎺🎺🎺");
				break;
			}

			System.out.println("====================================");

		}

	}
}
