package Tutorial;

import java.util.Scanner;

public class L_Latihan_Fungsi {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);

		System.out.print("panjang = ");
		int inputpanjang = userinput.nextInt();
		System.out.print("lebar = ");
		int inputlebar = userinput.nextInt();

		gambar(inputpanjang, inputlebar);

		System.out.println("luas = " + luas(inputpanjang, inputlebar));
		System.out.println("keliling = " + keliling(inputpanjang, inputlebar));

		tampilkelilingdanluas(inputpanjang, inputlebar);
	}

	private static void tampilkelilingdanluas(int panjang, int lebar) {
		System.out.println("luas = " + luas(panjang, lebar));
		System.out.println("keliling = " + keliling(panjang, lebar));
	}

	private static int keliling(int panjang, int lebar) {
		int hasil = (panjang + lebar) * 2;
		return hasil;
	}

	private static int luas(int panjang, int lebar) {
		int hasil = panjang * lebar;
		return hasil;
	}

	private static void gambar(int panjang, int lebar) {
		for (int i = 0; i < lebar; i++) {
			for (int j = 0; j < panjang; j++) {
				System.out.print("* ");
			}
			System.out.println("\t");
		}
	}

}
