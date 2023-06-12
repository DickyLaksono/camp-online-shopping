package Tutorial;

import java.util.Scanner;

public class F_Kalkulator_Switch_Case {

	public static void main(String[] args) {

		Scanner inputuser;
		float a, b, hasil;
		String operator;

		inputuser = new Scanner(System.in);

		System.out.print("nilai a = ");
		a = inputuser.nextFloat();
		System.out.print("operator = ");
		operator = inputuser.next();
		System.out.print("nilai b = ");
		b = inputuser.nextFloat();

		switch (operator) {
		case "+":
			// penjumlahan
			hasil = a + b;
			System.out.println("hasil = " + hasil);
			break;
		case "-":
			// penjumlahan
			hasil = a - b;
			System.out.println("hasil = " + hasil);
			break;
		case "*":
			// penjumlahan
			hasil = a * b;
			System.out.println("hasil = " + hasil);
			break;
		case "/":
			// penjumlahan
			hasil = a / b;
			System.out.println("hasil = " + hasil);
			break;
		default:
			System.out.println("operator" + operator + "tidak ditemukan");
		}
	}

}
