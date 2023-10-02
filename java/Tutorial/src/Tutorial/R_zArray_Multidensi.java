package Tutorial;

import java.util.Arrays;

public class R_zArray_Multidensi {
	public static void main(String[] args) {
		int[][] array_2D = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
		};
		System.out.println(array_2D);
		System.out.println(Arrays.toString(array_2D));
		System.out.println(array_2D[0]);
		System.out.println(array_2D[1]);

		System.out.println(Arrays.deepToString(array_2D));
		System.out.println();

		//
		//ini harus sama ,jika array multidemensinya char maka semuanya harus menggunakan char
		//DAN PADA JAVA KOMPONEN PADA KOMPONEN PADA ARRAY NYA BISA BERBEDA JUMLAH NYA
		char[] array_char1 = { 'a', 'b', 'c' };
		char[] array_char2 = { 'd', 'e' };
		char[][] arraychar_2D = {
				array_char1,
				array_char2,
		};
		System.out.println(arraychar_2D);
		//System.identityHashCode ini untuk mengubah address nya dalam bentuk integer
		//Integer.toHexString ini untuk mengubah nya integer ke code nya 
		System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
		System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
		System.out.println(Arrays.toString(arraychar_2D));
		System.out.println(Arrays.deepToString(arraychar_2D));

	}
}
