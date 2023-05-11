package extra1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("数字を2個入力してください");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
	

		System.out.println(num2 + "+" + num2 + "=" + (num1 + num2));

	}

}
