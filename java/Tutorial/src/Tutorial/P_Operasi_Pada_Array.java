package Tutorial;

import java.util.Arrays;

public class P_Operasi_Pada_Array {

	public static void main(String[] args) {

		int[] arrayangka1 = { 1, 2, 3, 4, 5 };

		//merubah array menjadi string
		System.out.println("merubah array menjsdi string \n=============================");
		printarray(arrayangka1);

		//mengkopi array
		System.out.println("\n mengkopi array \n=============================");
		int[] arrayangka2 = new int[5];
		printarray(arrayangka1);
		printarray(arrayangka2);

		System.out.println("\n mengkopi dengan loop");
		//mengunakan ini, berarti mengkopi elemennya bukan array nya
		for (int i = 0; i < arrayangka1.length; i++) {
			arrayangka2[i] = arrayangka1[i];
		}
		//maka ini address nya akan berbeda
		printarray(arrayangka1);
		System.out.println(arrayangka1);
		printarray(arrayangka2);
		System.out.println(arrayangka2);

		//
		//ini hanya mengkopi angka nya saja ,tidak dengan address nya
		System.out.println("\n mengkopi dengan copyOf");
		int[] arrayangka3 = Arrays.copyOf(arrayangka1, 3);//angka 5 adalah seberapa panjang mengkopi nya
		printarray(arrayangka1);
		System.out.println(arrayangka1);
		printarray(arrayangka3);
		System.out.println(arrayangka3);

		//
		//copyOf range dia ngasih tahu range nya dari berapa sampai berapa
		System.out.println("\n mengkopi dengan copyOfRange");
		int[] arrayangka4 = Arrays.copyOfRange(arrayangka1, 2, 5);//angka yg kedua itu adalah batas akhir
		printarray(arrayangka1);
		System.out.println(arrayangka1);
		printarray(arrayangka4);
		System.out.println(arrayangka4);

		//
		//
		//fill array (untuk membuat array yang sama nilainya ,jumlahnya berapapun ok)
		System.out.println("\n fill array \n=================================");
		int[] arrayangka5 = new int[10];
		printarray(arrayangka5);
		Arrays.fill(arrayangka5, 5);
		printarray(arrayangka5);

		//
		//
		//komparasi array (biasnya buat di percabangan)
		System.out.println("\n komparasi array \n=================================");
		int[] arrayangka6 = { 1, 2, 3, 4, 5 };
		int[] arrayangka7 = { 1, 2, 3, 4, 5 };

		//ini untuk membandingkan, jadi sama nggak dua buah array ini
		System.out.println("\n membandingkan antara dua buah array");
		System.out.println(Arrays.equals(arrayangka6, arrayangka7));

		if (Arrays.equals(arrayangka6, arrayangka7)) {
			System.out.println("array ini sama");
		} else {
			System.out.println("array ini beda");
		}

		//
		//
		System.out.println("\n mengecek mana array yang lebih besar");
		//jika angka array yg pertama lebih besar maka angka nya 1
		//jika angka array yg kedua lebih besar maka angka nya -1
		//dan jika kedua array angka nya sama maka angkanya menjadi 0
		System.out.println(Arrays.compare(arrayangka6, arrayangka7));

		//
		//
		System.out.println("\n ngecek mana index yang berbeda");
		System.out.println(Arrays.mismatch(arrayangka6, arrayangka7));

		//
		//
		//sort array
		System.out.println("\n sort array \n=================================");
		int[] arrayangka8 = { 1, 6, 4, 5, 3, 5, 2, 6 };
		printarray(arrayangka8);
		Arrays.sort(arrayangka8);
		printarray(arrayangka8);

		//
		// SEBELUM MENGGUNAKAN BINARYSEARCH, ARRAY NYA HARUS DI SORT TERLEBIH DAHULU
		//search array (mencari sebuah nilai pada di array itu ada di index berapa)
		System.out.println("\n search array \n=================================");
		int angka = 5;
		//nilai yg kedua adalah key nya / input yang diambil dari binarysearch
		int posisi = Arrays.binarySearch(arrayangka8, angka);
		System.out.println("angka " + angka + " ada di index " + posisi);

	}

	//fungsi ini yang kerjaannya hanya nge print saja
	private static void printarray(int[] dataarray) {
		System.out.println("array = " + Arrays.toString(dataarray));
	}

}
