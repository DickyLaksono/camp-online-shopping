package lesson6;

import java.util.Scanner;

public class Test6 {

	public void doIt1() {

		Scanner scan = new Scanner(System.in);

		System.out.println("何回 hello を表示しますか");

		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("hello");
		}

	}

	public void doIt2() {

		Scanner scan = new Scanner(System.in);

		System.out.println("何回 hello を表示しますか");

		int num = scan.nextInt();

		int i = 1;

		while (i <= num) {
			System.out.println("HELLO");
			i++;
		}

	}

	public void doIt3() {

		Scanner scan = new Scanner(System.in);

		System.out.println("何人入力しますか");
		int a = scan.nextInt();

		for (int i = 0; i < a; i++) {
			System.out.println();
			System.out.println((i + 1) + "人目の点数を入力してください");
			int num = scan.nextInt();
			System.out.println((i + 1) + "人目の点数は" + num + "点です");
		}

	}

	public void doIt4() {
		Scanner scan = new Scanner(System.in);

		System.out.println("何人入力しますか");
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println();
			System.out.println((i + 1) + "人目の点数を入力してください");
			int score = scan.nextInt();
			if (score < 60) {
				System.out.println((i + 1) + "人目は不合格");
			} else {
				System.out.println((i + 1) + "人目は合格");
			}
		}

	}

	public void doIt5() {
		Scanner scan = new Scanner(System.in);

		System.out.println("何人入力しますか");
		int num = scan.nextInt();

		int total = 0;
		for (int i = 0; i < num; i++) {
			System.out.println();
			System.out.println((i + 1) + "人目の点数を入力してください");
			int score = scan.nextInt();
			total += score;
		}
		System.out.println("合計" + total + "点です");
	}

	public void doIt6() {
		Scanner scan = new Scanner(System.in);

		System.out.println("好きなだけ点数を入力してくださ");

		int total = 0;
		while (true) {
			int num = scan.nextInt();
			if (num < 0) {
				System.out.println("終了");
				break;
			}
			total += num;

		}
		System.out.println("合計" + total + "点です");
	}

	public void doIt7() {
		Scanner scan = new Scanner(System.in);

		System.out.println("何人入力しますか");
		int num = scan.nextInt();

		int score = 0;
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "人目の点数を入力してくださ");
			score = scan.nextInt();

		}
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "人目の点数" + score + "点です");

		}

	}

}
