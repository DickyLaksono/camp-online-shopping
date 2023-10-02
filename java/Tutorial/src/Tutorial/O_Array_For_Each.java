package Tutorial;

public class O_Array_For_Each {

	public static void main(String[] args) {

		int[] arrayangka = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		// looping standard
		System.out.println("looping standard");
		for (int i = 0; i < 10; i++) {
			System.out.println("index ke- " + i + " adalah = " + arrayangka[i]);
		}

		// looping dengan property array
		System.out.println("looping dengan property lenght");
		for (int i = 0; i < arrayangka.length; i++) {
			System.out.println("index ke- " + i + " adalah = " + arrayangka[i]);
		}

		// looping untuk collection <- array (foreach)
		System.out.println("looping for each");
		for (int angka : arrayangka) {
			System.out.println("angka pada looping ini = " + angka);
		}
	}

}
