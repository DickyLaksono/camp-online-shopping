package lesson5;

import java.util.Scanner;

public class Test6 {

	public void doIt() {

		Scanner scan = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);

		System.out.println("国籍を入力してください : ");
		String nationality = scanStr.next();

		System.out.print("年齢を入力してください : ");
		int age = scan.nextInt();

		if (nationality.equals("日本") && age >= 20) {

			System.out.println("お酒が飲めます");
		} else if (nationality.equals("インドネシア") && age >= 20) {
			System.out.println("お酒が飲めます");
		} else {
			System.out.println("お酒が飲めません");
		}

		if (nationality.equals("日本") && age >= 20) {

			System.out.println("タバコが吸えます");
		} else if (nationality.equals("インドネシア") && age >= 18) {
			System.out.println("タバコが吸えます");
		} else {
			System.out.println("タバコが吸えません");
		}

	}

}
