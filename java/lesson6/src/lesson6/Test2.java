package lesson6;

import java.util.Random;

public class Test2 {

	public void doIt1() {

		Random r = new Random();

		int num = r.nextInt(10);
		System.out.println(num);

	}

	public void doIt2() {
		Random r = new Random();

		int num = r.nextInt(11);

		System.out.println("おみくじ");
		for (int i = 0; i < 5; i++) {
			System.out.print("● ");
			try {
				new Thread().sleep(1000);
			} catch (InterruptedException e) {
			}
		}

		System.out.println();
		if (num >= 9) {
			System.out.println("大吉");
		} else if (num >= 8) {
			System.out.println("吉");
		} else if (num >= 7) {
			System.out.println("中吉");
		} else if (num >= 6) {
			System.out.println("小吉");
		} else if (num >= 5) {
			System.out.println("末吉");
		} else if (num >= 3) {
			System.out.println("吉");
		} else if (num >= 1) {
			System.out.println("凶");
		} else {
			System.out.println("大凶");
		}

	}
}
