package lesson6;

import java.util.Scanner;

public class Test1 {

	public void doIt1() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("こんにちは");
		}

	}

	public void doIt2() {

		for (int i = 1; i <= 50; i++)

			System.out.println(i);

	}

	public void doIt3() {
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
	}

	public void doIt4() {
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	public void doIt5() {

		Scanner scan = new Scanner(System.in);
		Scanner scanstr = new Scanner(System.in);

		System.out.println("何回繰り返しますか");
		int a = scan.nextInt();
		System.out.println("偶数ですか?奇数ですか?");
		String b = scanstr.next();

		for (int i = 1; i <= a; i++) {
			if (b.equals("偶数") && i % 2 == 0) {
				System.out.println(i + "偶数");
			} else if (b.equals("奇数") && i % 2 == 1) {
				System.out.println(i + "奇数");
			}

		}
	}

	public void doIt6() {

		Scanner scan = new Scanner(System.in);
		Scanner scanstr = new Scanner(System.in);

		System.out.println("何を表示しますか?");
		String a = scanstr.next();

		System.out.println("何個表示しますか");
		int b = scan.nextInt();

		for (int i = 1; i <= b; i++) {
			if (a.equals(a)) {
				System.out.print(a + " ");
			}

		}

	}

	public void doIt7() {

		int total = 0;
		for (int i = 1; i < 10; i++) {
			total += i;
			System.out.println(i);
		}

		System.out.println(total);
	}

	public void doIt8() {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		int total = 0;
		for (int i = 1; i < a; i++) {
			total += i;
			System.out.println(i);
		}

		System.out.println(total);
	}

	public void doIt9() {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a >= b) {
			System.out.println("計算できません");
		} else {
			int total = a;
			for (int i = a; i <= b; i++) {
				total += i;
				System.out.println(i);
			}
			System.out.println(total);
		}

	}

}
