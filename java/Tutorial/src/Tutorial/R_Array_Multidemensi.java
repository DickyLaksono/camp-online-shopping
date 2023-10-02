package Tutorial;

public class R_Array_Multidemensi {

	public static void main(String[] args) {
		//jadi kita dapat membuat variabel array, yang isinya banyak array
		System.out.println("belajar array miltidemensi");

		//
		//cara membuat array 2 dimensi dengan assignment
		int[][] array_2D = {
				{ 1, 2 },
				{ 3, 4 }
		};
		printArray2D(array_2D);

		//
		//cara membuat array 2 dimensi dengan deklarasi
		int[][] arrayAngka = new int[5][4];// ini artinya int[baris][kolom]
		printArray2D(arrayAngka);

		//
		//looping lengkap secara manual
		//		for (int i = 0; i < arrayAngka.length; i++) {
		//			System.out.print("[");
		//			for (int j = 0; j < arrayAngka[i].length; j++) { *arrayAngka[i].length artiny setiap dari baris [i]
		//				System.out.print(arrayAngka[i][j] + ",");
		//			}
		//			System.out.print("]\n");
		//		}

		//
		//looping menggunakan foreach
		//		System.out.println();
		//		for (int[] baris : arrayAngka) {
		//			System.out.print("[");
		//			for (int angka : baris) {
		//				System.out.print(angka + ",");
		//			}
		//			System.out.print("]\n");
		//		}

		//
		//array secara manual, untuk pembuktian
		int[][] array_2D_2 = {
				{ 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 },
		};
		printArray2D(array_2D_2);

		//
		//
		int[][] array_ragged = {
				{ 1, 2, 3 },
				{ 4, 5, 6, 7 },
				{ 8 },
		};
		printArray2D(array_ragged);

	}

	private static void printArray2D(int[][] dataArray) {
		//System.out.println(Arrays.deepToString(dataArray));//ini artinya masuk ke dalam string nya

		//		for (int i = 0; i < dataArray.length; i++) {
		//			System.out.println(Arrays.toString(dataArray[i]));
		//		}

		System.out.println();
		for (int[] baris : dataArray) {
			System.out.print("[");
			for (int angka : baris) {
				System.out.print(angka + ",");
			}
			System.out.print("]\n");
		}

	}

}
