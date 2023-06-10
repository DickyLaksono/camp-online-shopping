package extra1;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("なんで区切りますが");

		String d = sc.nextLine();
		System.out.println(d + "で入力してください");

		String line = sc.nextLine();

		String[] arr = line.split(d);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

}
