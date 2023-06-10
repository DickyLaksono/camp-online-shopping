package extra1;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("AとBとCを連続入力してください");

		String line = sc.nextLine();

		String[] arr = line.split("");

		int b = 0;
		int c = 0;
		int d = 0;//harus memasukkan 0 untuk menghitung
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("S")) {
				b++;
			} else if (arr[i].equals("W")) {
				c++;
			} else if (arr[i].equals("C")) {
				d++;
			}

		}

		System.out.println("A=" + b);
		System.out.println("B=" + c);
		System.out.println("C=" + d);
		/*
				String str1 = "A";
				String str2 = "B";
				String str3 = "C";
		
				if (str1.equals("A")) {
					System.out.println(str1.length());
		
				} else if (str2.equals("B")) {
					System.out.println(str2.length());
				} else if (str3.equals("C")) {
					System.out.println(str3.length());
				}*/

		/*String str = "miuratatsuya";
		
		String[] arr = str.split("");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
	}

}
