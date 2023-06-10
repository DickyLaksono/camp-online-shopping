package extra1;

import java.util.Scanner;

public class TestXX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("アルファベットの数字を何個か入力してくださ");

		String s = sc.nextLine();
		String[] arr = s.split("");

		int a = 0;

		String x = sc.next();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(x)) {
				a++;
			}
		}
		System.out.println(a);
		System.out.println(s.toUpperCase());

	}

}
