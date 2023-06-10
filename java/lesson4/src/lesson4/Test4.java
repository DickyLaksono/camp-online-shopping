package lesson4;

import java.util.Scanner;

public class Test4 {
	public void doIt1() {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("数字を二個入力してください");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		//int num3 =num1 + num2;
		
		System.out.println(num1 +"+"+ num2 + "=" + (num1+num2) );
		System.out.println(num1 +"-"+ num2 + "=" + (num1-num2) );
		System.out.println(num1 +"*"+ num2 + "=" + (num1*num2) );
		System.out.println(num1 +"/"+ num2 + "=" + ((double)num1/num2) );
		System.out.printf("%d + %d + %d",num1,num2,(num1+num2));
	}
}
