package lesson7;

import java.util.Random;
import java.util.Scanner;

public class PairWork1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		String playerName;
		int playerHealth = 50;
		int playerAttack = 15;
		int playerDefense = 7;
		int enemyHealth = 50;
		int enemyAttack = 17;
		int enemyDefense = 10;

		System.out.println("ようこそ RPG Game へ");
		System.out.println();
		System.out.println("名前を入力してください");

		playerName = scan.nextLine();
		System.out.println("ようこそ " + playerName + "!");
		while (playerHealth > 0 && enemyHealth > 0) {
			System.out.println("\n====================================");
			System.out.println("Health " + playerName + ": " + playerHealth + "点");
			System.out.println("EnemyHealth 🐉 : " + enemyHealth + "点");
			System.out.println("------------------------------------");
			System.out.println("選択:");
			System.out.println("1. 攻撃");
			System.out.println("2. defens");
			System.out.println("====================================");

			System.out.println();
			int choice = scan.nextInt();

			if (choice == 1) {
				int damageDealt = playerAttack - enemyDefense;
				int damageReceived = enemyAttack - playerDefense;

				if (damageDealt > 0) {
					enemyHealth -= damageDealt;
					System.out.println("敵のHPを " + damageDealt + " 点減らしました");
				} else {
					System.out.println("攻撃無効");
				}

				if (damageReceived > 0) {
					playerHealth -= damageReceived;
					System.out.println("敵の攻撃を" + damageReceived + "点受けた.");
				} else {
					System.out.println("敵の攻撃無効.");
				}

			} else if (choice == 2) {
				int damageReceived = (enemyAttack - 10) - playerDefense;

				if (damageReceived > 0) {
					playerHealth -= damageReceived;
					System.out.println("ダメージを " + damageReceived + " 点受けた");
				} else {
					System.out.println("敵の攻撃無効");
				}
			} else {
				System.out.println("1 か 2を入力してください");
			}

			System.out.println("\n====================================");
			if (playerHealth <= 0) {
				System.out.println("残念!!あなたは負けた");

			} else if (enemyHealth <= 0) {
				System.out.println("おめでとう!!敵を倒しました");
			}

			System.out.println("====================================");
		}
	}
}
