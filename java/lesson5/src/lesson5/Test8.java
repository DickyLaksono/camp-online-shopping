package lesson5;

import java.util.Scanner;

public class Test8 {

	public void doIt1() {
		Scanner scan = new Scanner(System.in);
		Scanner scan_str = new Scanner(System.in);

		System.out.println("日本人ですか?留学生ですか?");
		String type = scan_str.next();

		System.out.println("JLPTのレベルは");
		int jlpt = scan.nextInt();

		if (type.equals("留学生") && (jlpt == 1 || jlpt == 2 || jlpt == 3)) {
			System.out.println("入学できます");
		} else {
			System.out.println("入学できます");
		} /*else if (type.equals("日本人") && jlpt == 0) {
			System.out.println("入学できません");
			}*/
	}
}
