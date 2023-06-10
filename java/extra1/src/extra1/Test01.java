package extra1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("科目の数");
		int a = sc.nextInt();

		System.out.println("学生の数");
		int b = sc.nextInt();

		int[][] arr = new int[a][b];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print((i + 1) + "科目目の" + (j + 1) + "人目の点数は = ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println((i + 1) + "科目目の" + (j + 1) + "人目の点数 = " + arr[i][j]);
			}
		}
	}
}
