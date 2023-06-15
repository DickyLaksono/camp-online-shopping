package Tutorial;

import java.util.Scanner;

public class M_Fungsi_Rekursif {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);
		System.out.print("memasukkan nilai = ");
		int nilai = userinput.nextInt();
		System.out.println("anda memasukkan nilai = " + nilai);

		printnilai(nilai);
		jumlahnilai(nilai);

	}
	//funsi rekursif sederhana

	private static int jumlahnilai(int parameter) {
		System.out.println("parameter = " + parameter);
		if (parameter == 0) {

		}
		return parameter + jumlahnilai(parameter - 1);
	}

	private static void printnilai(int parameter) {
		System.out.println("nilai = " + parameter);

		if (parameter == 0) {
			return; // saat return akan keluar dari fungsi yang terakhir( ini )
		}

		parameter--;

		printnilai(parameter);
	}

}
