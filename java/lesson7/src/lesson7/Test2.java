package lesson7;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public void doIt1() {
		double[] nums = new double[3];

		nums[0] = 60.5;
		nums[1] = 82.3;
		nums[2] = 91.6;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " " + "kg");
		}
	}

	public void doIt2() {
		String[] names = new String[3];

		names[0] = "タイ";
		names[1] = "ウー";
		names[2] = "ユッセフ";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "様");
		}
	}

	public void doIt3() {
		int[] ages = { 10, 11, 12, 13, 14 };
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i] + "才");
		}
	}

	public void doIt4() {
		String[] countries = { "indonesia", "myanmar", "vietnam" };

		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}

	}

	public void uranau() throws Exception {
		try {
			Scanner scan = new Scanner(System.in);

			String[] countries = {
					"インドネシア",
					"エジプト",
					"ミャンマー",
					"ベトナム",
					"シンガポール",
					"ノルウェー",
					"トルコ",
					"ロシア",
					"ウクライナ",
					"中国",
			};

			int[] ages = { 10, 20, 30, 40, 50, 60, };

			String[] genders = { "女性", "男性" };

			System.out.println("***** 占い *****");
			System.out.println("名前を入力してくださ");
			String name = scan.next();

			System.out.print(name + "様の結婚を探しています");
			for (int i = 0; i < 5; i++) {
				System.out.print(".");
				try {
					new Thread().sleep(1000);
				} catch (Exception e) {

				}
			}

			Random r = new Random();

			System.out.println();
			System.out.println(name + "様の結婚相手は");
			Thread.sleep(1000);
			System.out.println(countries[r.nextInt(countries.length)] + "人で");
			Thread.sleep(1000);
			System.out.println(ages[r.nextInt(ages.length)] + "代の");
			Thread.sleep(1000);
			System.out.println(genders[r.nextInt(genders.length)] + "です");

		} catch (Exception e) {

		}
	}

	public void slot() throws Exception {
		String[] icons = { "🐶", "🐱", "🐰", "🐭", "🐮", "🐵" };
		Random r = new Random();
		Scanner scan = new Scanner(System.in);

		int money = 10000;
		System.out.println("所持金" + money + "円");
		while (true) {
			System.out.println("いくらかけますか");
			int bet = scan.nextInt();

			int num1 = r.nextInt(icons.length);
			int num2 = r.nextInt(icons.length);
			int num3 = r.nextInt(icons.length);

			System.out.print(icons[num1]);
			Thread.sleep(1000);
			System.out.print(icons[num2]);
			Thread.sleep(1000);
			System.out.println(icons[num3]);
			Thread.sleep(1000);
			System.out.println();

			if (num1 == num2 && num1 == num3) {
				System.out.println("当たり");
				money += (bet * 100);
			} else {
				System.out.println("外れ");
				money -= bet;
			}
			System.out.println("所持金" + money + "円");
			System.out.println("1:Continue 2:finish");
			int menu = scan.nextInt();
			if (menu == 2) {
				System.out.println("終了します");
				break;
			}

		}

	}

}
