package extra1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("年齢を入力してください");
		
		int age = scan.nextInt();
		//&& untuk dua syarat
		if (age >= 10 && age <= 19) {
			System.out.println("10代ですね");
		}else if(age >= 20 && age <= 29) {
			System.out.println("20");
		}
		
		else {
			System.out.println("それ以外ですね");
		}
		
		
		
		
		
		
		

	}

}
