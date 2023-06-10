package lesson5;

import java.util.Scanner;

public class Test1 {
	public void doIt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("数字を入力してください");

		int num = scan.nextInt();

		if (num <= 17) {
			System.out.println("子供です");
		}

	}

	public void doIt1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("数字を入力してください");

		int num = scan.nextInt();

		if (num < 18) {
			System.out.println("子供");
		} else {
			System.out.println("大人");
		}
	}

	public void doIt2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("年齢を入力してください");

		int age = scan.nextInt();

		if (age < 5) {
			System.out.println("赤ちゃん");
		} else if (age > 5 && age < 10) {
			System.out.println("子供");
		} else if (age > 10 && age < 18) {
			System.out.println("お兄さん");
		} else if (age > 18 && age < 25) {
			System.out.println("大人");
		} else if (age > 25 && age < 40) {
			System.out.println("おじさんですね");
		} else {
			System.out.println("おじいさんですね");
		}

	}

}
