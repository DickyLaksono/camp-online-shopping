package lesson6;

import java.util.Scanner;

public class Test3 {

	public void doIt1(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("ワン");
		}

	}

	public void doIt2() {
		for (int i = 1; i <= 10; i++) {
			if (i == 2) {
				continue;
			}
			if (i == 3) {
				break;
			}
			System.out.println(i);

		}
		System.out.println("END");
	}

	public void doIt3() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			if (i == num2) {
				continue;
			}
			System.out.println(i);
		}
	}

	public void doIt4() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("i = " + i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("j = " + j);
			}
			System.out.println();
		}
	}

	public void doIt5() {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				int t = i * j;
				System.out.print(t + "\t");
			}
			System.out.println();
		}
	}
}
