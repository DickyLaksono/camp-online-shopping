package extra1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("数字を２個入力してくだ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int num = num1 + num2 ;
		
		if (num1 == num2){
			System.out.println("eq");
		}else {
			System.out.println("合計" + (num1 + num2)  );
		}
		
	}

}
