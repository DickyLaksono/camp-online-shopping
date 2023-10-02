package Tutorial;

import java.util.Scanner;

public class S_Operasi_String {

	public static void main(String[] args) {
		//setiap kita merubah string maka akan masuk ke memory baru
		//bukan di string pool
		String kalimat = "saya suka makan pisang";

		//mengamnil komponen dari string
		System.out.println(kalimat.charAt(5));

		//substring(ini di memory biasa / heep)
		String kata = kalimat.substring(10, 15);
		System.out.println(kata);

		//concatenation (concat) /menyambungkan
		//cara ini yaitu membuat string baru
		String kalimat2 = kata + "bakwan";
		System.out.println(kalimat2);

		// ini berada di string pool
		//string pool bisa habis jika terus di gunakan
		kata = kata + "cireng";
		System.out.println(kata);

		//concat dengan non string
		int jumlah = 20;
		String kalimat3 = kata + "" + jumlah;//ini disebutnya casting
		System.out.println(kalimat3);
		System.out.println(kata + "" + jumlah);

		//lowercase dan uppercase
		System.out.println(kalimat.toUpperCase());
		System.out.println(kalimat.toLowerCase());

		//replace
		String kalimat4 = kalimat.replace("pisang", "combro");
		System.out.println(kalimat);
		System.out.println(kalimat4);

		//Compare
		String motor1 = "royal enfield himalayan";
		String motor2 = "kawasaki w175";
		System.out.println(motor1.compareTo(motor2));//klmnopqr
		System.out.println(motor2.compareTo(motor1));

		String gorengan1 = "bakwan";
		String gorengan2 = "bala-bala";
		System.out.println(gorengan1.compareTo(gorengan2));//kl
		System.out.println(gorengan2.compareTo(gorengan1));

		//equality / persamaan
		//String kataInput = "test"; //ini ada di string pool
		String kataInput = new String("test"); //ini bukan string literal,dan tidak berada di string pool
		String kataTest = "test"; //ini juga ada di string pool
		//string yg di cek adalah address nya
		System.out.println("\npersamaan pada lokasi string pool");
		if (kataInput == kataTest) {
			System.out.println("sama");
		} else {
			System.out.println("tidak sama");
		}

		//kalau mengambil input dari user bukan string literal dan bukan yang ada di string pool
		Scanner userInput = new Scanner(System.in);
		System.out.print("\nmengambil input string dari user: ");
		kataInput = userInput.next();
		System.out.println("ini adalah input user: " + kataInput);

		if (kataInput.equals(kataTest)) {
			System.out.println("sama");
		} else {
			System.out.println("tidak sama");
		}

	}

}
