package extra1;

import java.util.Scanner;

public class Test3 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("数字を入力してください");
			int num = scan.nextInt();
			
			if(num <= 10) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}	
	}
	

