package extra1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("名前を入力してください");
		
		String name1 = scan.next();
		String name2 = scan.next();
		
		System.out.println("こんばんは" + name1 + "さん");
		System.out.println("こんばんは" + name2 + "さん");

	}

}
