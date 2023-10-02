package Tutorial;

public class T_Srting_Buid {

	public static void main(String[] args) {

		//saat menuliskan string yang panjang lebih baik menggunakan builder 
		//Srting builder memiliki capacity
		//kapasitas default dari stringbuilder adalah 16
		StringBuilder builder = new StringBuilder("halo");
		printData(builder);

		//append(menambahkan)
		builder.append(" semuanya");
		printData(builder);

		builder.append(" warga-surabaya");
		printData(builder);

		//insert (untuk menambahkan di tengah tengah)
		builder.insert(19, "kota");
		printData(builder);

		//delete
		builder.delete(19, 23);
		printData(builder);

		//rubah character pada index tertentu
		builder.setCharAt(14, 'W');
		printData(builder);

		//replace
		builder.replace(20, 28, "bandung");
		printData(builder);

		//casting menjadi string
		String kalimat = builder.toString();
		System.out.println(kalimat);
		int addressingString = System.identityHashCode(kalimat);
		System.out.println("address = " + Integer.toHexString(addressingString));

	}

	private static void printData(StringBuilder dataBuilder) {

		System.out.println("data = " + dataBuilder);
		System.out.println("panjang = " + dataBuilder.length());
		System.out.println("kapasitas = " + dataBuilder.capacity());

		int addressBuilder = System.identityHashCode(dataBuilder);
		System.out.println("address = " + Integer.toHexString(addressBuilder));
	}

}
