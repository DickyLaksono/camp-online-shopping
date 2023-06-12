package Tutorial;

import java.util.Scanner;

public class D_Ternary_Operator {

	public static void main(String[] args) {
		//Ternary Operator

		int input, x;

		Scanner inputuser = new Scanner(System.in);

		System.out.println("masukkan nilai: ");
		input = inputuser.nextInt();

		//variabel x = ekspresi ? statement_true : statement_false
		x = (input == 10) ? (input * input) : (input / 2);
		System.out.println("hasilnya: " + x);

	}

}
