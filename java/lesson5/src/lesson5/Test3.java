package lesson5;

import java.util.Scanner;

public class Test3 {
	public void doIt1() {
		String s = "a";

		if (s.equals("三浦")) {
			System.out.println("先生ですね");
		} else {
			System.out.println("それ以外ですね");
		}
	}

	public void doIt2() {
		Scanner scan = new Scanner(System.in);

		String j = "日本";
		String i = "Indonesia";
		String v = "vietnam";
		String m = "myanmar";
		String n = "norwegia";
		String e = "egypt";

		System.out.println("国籍入力してください");
		String country = scan.nextLine();

		if (country.equals(j)) {
			System.out.println("おはようございます");
		} else if (country.equals(i)) {
			System.out.println("スラマットパギ");
		} else if (country.equals(v)) {
			System.out.println("ミンガラーバ");
		} else if (country.equals(m)) {
			System.out.println("シンチャオ");
		} else if (country.equals(n)) {
			System.out.println("ハイ");
		} else {
			System.out.println("それ以外");
		}

	}

	public void doIt3() {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		System.out.println("年齢を入力してください");
		int age = scan1.nextInt();
		System.out.println("名前を入力してください");
		String name = scan2.nextLine();

		System.out.println("名前は" + name + "さんです");
		System.out.println("年齢" + age + "才です");

	}
}
