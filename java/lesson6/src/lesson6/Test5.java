package lesson6;

import java.util.Scanner;

public class Test5 {

	public void calculate() {
		System.out.println("");

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println();

			int num1 = scan.nextInt();
			if (num1 == 5) {
				System.out.println("end");
				break;
			}

			System.out.println("");
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			if (num1 == 1) {
				System.out.println(num2 + "+" + num3 + "=" + (num2 + num3));
			} else if (num1 == 2) {
				System.out.println(num2 + "-" + num3 + "=" + (num2 - num3));
			} else if (num1 == 3) {
				System.out.println(num2 + "*" + num3 + "=" + (num2 * num3));
			} else if (num1 == 4) {

				if (num3 == 0) {
					System.out.println();
				} else {
					System.out.println(num2 + "/" + num3 + "=" + ((double) num2 / num3));
				}
			}
		}
	}
}
