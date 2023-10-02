package Tutorial;

import java.util.Scanner;

public class M_Fungsi_Rekursif {

	public static void main(String[] args) {
		// pada fungsi rekursif : 
		// return pada fungsi rekursif dia akan mereturn sifungsinya itu sendiri 

		Scanner userinput = new Scanner(System.in);
		System.out.print("memasukkan nilai = ");
		int nilai = userinput.nextInt();
		System.out.println("anda memasukkan nilai = " + nilai);

		printnilai(nilai);

		int jumlah = jumlahnilai(nilai);
		System.out.println("jumlah = " + jumlah);

		int faktorial = hitungfaktorial(nilai);
		System.out.println("hasik faktorial = " + faktorial);

	}
	//fungsi rekursif sederhana

	private static int hitungfaktorial(int parameter) {
		System.out.println("parameter = " + parameter);
		if (parameter == 1) {
			return parameter;// saat ini di return maka akan ke" return parameter + jumlahnilai(parameter - 1); "
		}
		return parameter * hitungfaktorial(parameter - 1);
	}

	private static int jumlahnilai(int parameter) {
		System.out.println("parameter = " + parameter);
		if (parameter == 0) {
			return parameter;// saat ini di return maka akan ke" return parameter + jumlahnilai(parameter - 1); "
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
		// parameter nya akn di generate terus ,karena si memomrynya trus hidup disini(harus di batasi(bisa dg if dll))
	}

}
