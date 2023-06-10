package extra1;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] point = new int[5];

		System.out.println("点数を5個入力してください");

		for (int i = 0; i < 5; i++) {
			point[i] = scan.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "人目の点数は" + point[i] + "点");
		}

	}

}
