package lesson7;

import java.util.Scanner;

public class Test1 {

	public void doIt1() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;

		for (int i = 0; i < 5; i++) {
			System.out.println(num1);
		}
	}

	public void doIt2() {

		int[] nums = new int[5];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;

		for (int i = 0; i < 5; i++) {

			System.out.println(nums[i]);
		}

	}

	public void doIt3() {

		int[] nums = new int[3];

		nums[0] = 22;
		nums[1] = 18;
		nums[2] = 26;
		for (int i = 0; i < 3; i++) {
			System.out.println(nums[i]);
		}
	}

	public void doIt4() {
		Scanner scan = new Scanner(System.in);

		System.out.println("何人入力しますか");
		int num = scan.nextInt();
		int[] nums = new int[num];

		for (int i = 0; i < nums.length; i++) {
			System.out.println();
			System.out.println((i + 1) + "人目の点数を入力してくださ");
			nums[i] = scan.nextInt();
		}

		for (int i = 0; i < nums.length; i++) {

			System.out.println(nums[i]);
		}

	}

}
