package lesson5;

import java.util.Scanner;

public class Test4 {

	public void checkBMI() {
		Scanner scan_str = new Scanner(System.in);
		Scanner scan_num = new Scanner(System.in);

		System.out.println("名前を入力してください = ");
		String name = scan_str.next();

		System.out.println("身長を入力してください = ");
		double height = scan_num.nextDouble();

		System.out.println("体重を入力してください = ");
		double weight = scan_num.nextDouble();

		height = height / 100;
		double bmi = weight / (height * height);

		System.out.println(name + "さんの判定結果" + bmi);
		System.out.println("身長は" + height + "cm");
		System.out.println("体重は" + weight + "kg");

		if (bmi >= 25) {
			System.out.println("太りすぎ");
		} else if (bmi >= 20) {
			System.out.println("普通");
		} else if (bmi >= 15) {
			System.out.println("痩せすぎ");
		}

	}
}
