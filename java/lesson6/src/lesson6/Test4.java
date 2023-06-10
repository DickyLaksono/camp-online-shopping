package lesson6;

import java.util.Random;
import java.util.Scanner;

public class Test4 {

	public void doIt5() {

		boolean b1 = true;
		boolean b2 = true;

		if ((b1 || b2) && !b2) {
			System.out.println("hello");
		}
	}

	public void doIt6() {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			System.out.println();
			int num = r.nextInt();
			if (num == 0) {
				System.out.println("lucky");
			} else {
				System.out.println("unlucky");
			}
			System.out.println("try again");
			int retry = scan.nextInt();
			if (retry == 2) {
				break;
			}
		}

	}

}
