package lesson4;

import java.util.Scanner;

public class Test5 {
	public void doIt() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("名前を入力してください");
		
		String name = scan.next();
		String name1 = scan.next();
		
		System.out.println(name + name1 +  "さん, こんにちは");
	}
	
	
	
	public void doIt2() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("名前を入力してください");
		
		String name = scan.nextLine();
		
		
		System.out.println(name +  "さん, こんにちは");
	}
}
/*
bisa juga dengan pertama menulis "int = <nama tag>+<nama tag >+ .....n"
	dan setelahnya tanpa harus menulis class nya satu satu ,contoh: name = scan.next();
																	name2 = scan.next();....n
*/	
