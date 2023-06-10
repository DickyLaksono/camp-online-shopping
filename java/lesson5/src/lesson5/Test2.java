package lesson5;

import java.util.Scanner;

public class Test2 {
	public void doIt() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		if (a > 100) {
			System.out.println("数字がまちがっています");
		} else if (a == 100) {
			System.out.println("レインコートが必要です");
		} else if (a > 80) {
			System.out.println("傘は必要です");
		} else if (a > 50) {
			System.out.println("折り畳み傘が持っていましょう");
		} else if (a > 0) {
			System.out.println("傘は必要ありません");
		} else {
			System.out.println("数字がまちがっています");
		}
	}

	public void doIt2() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		if (a >= 100 && a <= 100) {
			System.out.println("大金持ちですね");
		} else if (a >= 60 && a < 100) {
			System.out.println("小金持ちですね");
		} else if (a >= 30 && a < 60) {
			System.out.println("普通ですね");
		} else if (a >= 0 && a < 30) {
			System.out.println("貧乏ですね");
		} else {
			System.out.println("数字が間違っています");
		}
	}
}
