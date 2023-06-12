package Tutorial;

import java.util.Scanner;

public class E_Kalkulator_if_else {

	public static void main(String[] args) {

		Scanner inputuser;
		float a, b, hasil;
		char operator;

		inputuser = new Scanner(System.in);

		System.out.print("nilai a = ");
		a = inputuser.nextFloat();
		System.out.print("operator = ");
		operator = inputuser.next().charAt(0);// karena next adalah string, maka mengambil nilai paling depan " 0 ".
		System.out.print("nilai b = ");
		b = inputuser.nextFloat();

		System.out.println("input user:" + a + " " + operator + " " + b);

		if (operator == '+') {

			// penjumlahan
			hasil = a + b;
			System.out.println("hasil = " + hasil);
		} else if (operator == '-') {

			// pengurangan
			hasil = a - b;
			System.out.println("hasil = " + hasil);
		} else if (operator == '*') {

			// perkalian
			hasil = a * b;
			System.out.println("hasil = " + hasil);
		} else if (operator == '/') {

			// pembagian
			if (b == 0) {
				System.out.println("pembagi nol menghasilkan tak hingga");
			} else {
				hasil = a / b;
				System.out.println("hasil = " + hasil);
			}
		} else {
			System.out.println("operasi tidak ditemukan");
		}
	}

}
