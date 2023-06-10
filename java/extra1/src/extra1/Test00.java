package extra1;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("何人入力しますか");

		int count = scan.nextInt();

		int[] a = new int[count];

		for (int i = 0; i < count; i++) {

			System.out.println((i + 1) + "人目の入力してください");
			a[i] = scan.nextInt();
		}

		int total = 0;
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "人目の点数は" + a[i] + "点");
			total += a[i];

			if (a[i] < min) {
				min = a[i];
			}

			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("合計は" + total + "点です");
		System.out.println("平均は" + (double) total / count + "点です");
		System.out.println("最大は" + max + "点です");
		System.out.println("最小は" + min + "点です");
	}

}
