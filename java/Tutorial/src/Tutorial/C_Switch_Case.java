package Tutorial;

import java.util.Scanner;

public class C_Switch_Case {

	public static void main(String[] args) {
		//switch biasa digunakan untuk pemilihan menu (yang nilai nya satu dan bisa bercabang)
		//switch case eksppresinya berupa satuan (int, long, byte, short), String atau enum
		String input;

		Scanner inputuser = new Scanner(System.in);
		System.out.println("panggil nama; ");

		input = inputuser.next();
		;

		switch (input) {
		case "otong": //gunakan " : "
			System.out.println("saya otong dan hadir bos");
			break;
		case "ucup":
			System.out.println("saya ucup dan hadir bos");
			break;
		case "mario":
			System.out.println("saya mario dan hadir bos");
			break;
		default: //ini sama seperti else
			System.out.println(input + "tidak hadir bos");
		}
		System.out.println("selesai program");

	}

}
