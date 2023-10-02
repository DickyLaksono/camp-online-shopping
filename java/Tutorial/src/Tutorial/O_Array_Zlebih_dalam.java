package Tutorial;

import java.util.Arrays;

public class O_Array_Zlebih_dalam {

	public static void main(String[] args) {

		int[] arrayangka1 = { 1, 2, 3, 4, 5 };
		int[] arrayangka2 = new int[5];

		//ini adalah memory, arrayangka1 dan arrayangka2 memorinya berbeda disini
		System.out.println(arrayangka1);
		System.out.println(arrayangka2);

		//saat sudah disamakan maka memorinay menjadi sama
		//ini berbeda dengan data primitive yang hanya mengkopi,
		//kelakuan dari array itu jika disamakan itu memindahkan bukan mengcopy
		//pada array jika array nya disamakan maka memorinya akan menjadi sama ,
		//seperti contoh dibawah ,, 
		arrayangka2 = arrayangka1;

		System.out.println(arrayangka1);
		System.out.println(arrayangka2);

		System.out.println("ini adalah array 1 " + Arrays.toString(arrayangka1));
		System.out.println("ini adalah array 1 " + Arrays.toString(arrayangka2));

		arrayangka1[0] = 100;
		arrayangka2[4] = 400;
		System.out.println("ini adalah array 1 " + Arrays.toString(arrayangka1));
		System.out.println("ini adalah array 1 " + Arrays.toString(arrayangka2));

		ubaharray(arrayangka1);
		System.out.println("ini adalah array 1 " + Arrays.toString(arrayangka1));
		System.out.println("ini adalah array 1 " + Arrays.toString(arrayangka2));

	}

	//ini addalah method yang argumennya adalah reference(pass by reference), kita tidak menambah alokasi memory baru
	//bukan pass by value
	private static void ubaharray(int[] dataarray) {

		for (int data : dataarray) {
			System.out.println(data);
		}

		dataarray[0] = 125;

		for (int data : dataarray) {
			System.out.println(data);
		}
	}

}
