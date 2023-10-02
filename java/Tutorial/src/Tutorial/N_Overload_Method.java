package Tutorial;

public class N_Overload_Method {

	public static void main(String[] args) {
		// jika kita ingin membuat fungsi yang memanggil argumen yg tidak tetap/berubah ubah
		// overload itu akan mencari pola yang sesuai dengan yang dipanggil nya

		int hasilinteger;
		hasilinteger = tambah(4, 5);
		printangka(hasilinteger);

		float hasilfloat;
		hasilfloat = tambah(4.5f, 4);
		printangka(hasilfloat);

		hasilfloat = tambah(4, 4.5f);
		printangka(hasilfloat);

		hasilinteger = tambah(11, 12, 13);
		printangka(hasilinteger);

		printangka(10);
		printangka(10.5f);
		printangka(16.7d);
		printangka(16);

	}

	private static int tambah(int angkaint1, int angkaint2, int angkaint3) {
		return angkaint1 + angkaint2 + angkaint3;
	}

	private static float tambah(int angkaint1, float angkafloat2) {
		return angkaint1 + angkafloat2;
	}

	private static float tambah(float angkafloat1, int angkaint2) {
		return angkafloat1 + angkaint2;
	}

	private static int tambah(int angkaint1, int angkaint2) {
		return angkaint1 + angkaint2;
	}

	private static void printangka(double angkadouble) {
		System.out.println("angka ini adalah double dengan nilai = " + angkadouble);
	}

	private static void printangka(float angkafloat) {
		System.out.println("angka ini adalah float dengan nilai = " + angkafloat);
	}

	private static void printangka(int angkainteger) {
		System.out.println("angka ini adalah integer dengan nilai = " + angkainteger);
	}

}
