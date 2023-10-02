package Tutorial;

import java.util.Arrays;

public class Q_Latihan_Array {

	public static void main(String[] args) {

		int[] arrayangka1 = { 2, 3, 5, 1, 12, 7, 60, 6, 8, 9 };
		int[] arrayangka2 = { 0, 4, 3, 2, 1, 5, 9, 8, 7, 4 };

		//
		//
		//penjumlahan antara dua buah aray
		int[] arrayhasil1 = tambaharray(arrayangka1, arrayangka2);

		System.out.println();
		printarray(arrayangka1, "array 1");
		printarray(arrayangka2, "array 2");
		printarray(arrayhasil1, "hasil1");

		//
		//
		//menggabungkan dua buah array 
		int[] arrayhasil2 = new int[arrayangka1.length + arrayangka2.length];

		for (int i = 0; i < arrayangka1.length; i++) {
			arrayhasil2[i] = arrayangka1[i];

		}

		for (int i = 0; i < arrayangka2.length; i++) {
			//pada arrayhasil2[i] agar tidak menimpa arrayangka1 maka harus ditambah dengan arrayangka1.lenght 
			arrayhasil2[i + arrayangka1.length] = arrayangka2[i];

		}
		System.out.println();
		printarray(arrayangka1, "array 1");
		printarray(arrayangka2, "array 2");
		printarray(arrayhasil2, "hasil2");

		//
		//
		//sort reverse , mengurutkan tapi kebalik
		//caranya dengan men sort nya terlebih dahulu
		System.out.println();
		printarray(arrayangka1, "array 1");
		reverse(arrayangka1);
		printarray(arrayangka1, "reversed");

		System.out.println();
		printarray(arrayangka2, "array 2");
		reverse2(arrayangka2);
		printarray(arrayangka2, "reversed 2");

	}

	//method pada reverse2
	private static void reverse2(int[] dataarray) {
		Arrays.sort(dataarray);
		int buffer;

		//ini adalah salah satu cara untuk mereverse
		//cara ini lebih cepat dilakukan apabila angka nya ada banyak ,,
		//tapi kekuraangnnya tidak memiliki array baru, dan loopingannya hanya setengah
		//
		//cara kerjany pertama dengan membaginya 2 ,
		//lalu hanya tinggal memutar setengah dari angka awal ke belakang ,dan begitupun dengan sebaliknya
		for (int i = 0; i < dataarray.length / 2; i++) {
			buffer = dataarray[i];

			//ini untuk membalika angka
			dataarray[i] = dataarray[(dataarray.length - 1) - i];
			dataarray[(dataarray.length - 1) - i] = buffer;
		}
	}

	//method pada reverse
	//karena yang mau kita ubah adalah arrayangka1, berarti kita tidak membutuhkan return
	private static void reverse(int[] dataarray) {
		Arrays.sort(dataarray);

		int[] arraybuffer = Arrays.copyOf(dataarray, dataarray.length);
		for (int i = 0; i < dataarray.length; i++) {
			dataarray[i] = arraybuffer[(arraybuffer.length - 1) - i];//ini untuk membalik angka dari arrayangka1
		}

	}

	//method pada penjumlahan antara dua buah array
	private static int[] tambaharray(int[] arrayint1, int[] arrayint2) {
		//ini agar tidak mengubah arrayangka1
		int[] arrayhasil = new int[arrayint1.length];

		for (int i = 0; i < arrayint1.length; i++) {
			arrayhasil[i] = arrayint1[i] + arrayint2[i];
		}
		return arrayhasil;

	}

	private static void printarray(int[] dataarray, String message) {
		System.out.println(message + " = " + Arrays.toString(dataarray));
	}

}
