package Tutorial;

public class K_Fungsi_Atau_Method {

	public static void main(String[] args) {
		// void artinya hampa

		System.out.println(simpel());

		fungsivoid("apa pun");
		selamatpagi(" abah");
		selamatpagi(" emak");

	}

	private static void selamatpagi(String nama) {
		System.out.println("selamat pagi" + nama);
	}

	// fungsi atau method tanpa kembalian
	private static void fungsivoid(String input) {
		System.out.println(input);
	}

	/*fungsi atau method dengan kembalian sehingga menggunakan return
	 * untuk mengembalikan nilainya (10.0)
	*/
	private static float simpel() {
		return 10.0f;
	}
}
