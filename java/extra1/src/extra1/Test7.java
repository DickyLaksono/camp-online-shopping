package extra1;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("数字を入力してください");

		int input = scan.nextInt();

		int total = 0;
		for (int i = 1; i <= input; i++) {
			//total= total + i; seperti ini atau seperti yang dibawah
			total += i;
			System.out.println(i);
		}

		System.out.println("合計" + total);
		//for(int i = 1; i <=input; i++) {
		//System.out.println("合計は"+ i + input);
		//}
	}

}
