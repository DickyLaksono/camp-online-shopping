package Tutorial;

import java.util.Formatter;

public class U_Format_String {

	public static void main(String[] args) {
		String nama = "udin";
		int umur = 17;

		System.out.println("nama saya adalah " + nama + ", umur saya adalah" + umur);

		//cara  lainnya adalah menggunakan format string
		System.out.printf("nama saya adalah %s, umur saya adalah %d\n", nama, umur);

		//
		//conversion : f=floating, d=integer, c=character, s=string, b=boolean
		//
		//struktur format = %[argumen_index$][flags][width][.precision](conversion)

		//[argumen_index$] ***
		System.out.println("\n[argumen_index$]");
		//udin, wahai udin, kemana saja kamu udin
		// 1$ ini berarti ini argumen satu ********** 
		System.out.printf("%1$s,wahai %1$s, kemena saja kamu %1$s", nama);
		//
		System.out.printf("\numur %1$s berapa?, %1$s udin menjawab: %2$d \nwah masih muda ya umurnya %2$d", nama, umur);

		//[flags] (untuk menambahkan tanda +/- didepannya "%+d"(+)) ***
		System.out.println("\n [flags]");
		int int1 = 5;
		int int2 = 8;
		int hasil = int1 - int2;
		System.out.printf("%d - %d = %+d", int1, int2, hasil);

		//[width] ***
		System.out.println("\n[width]");
		int int3 = 1000;
		System.out.println("integer");
		System.out.printf("%d\n", int3);
		System.out.printf("%5d\n", int3);
		System.out.printf("%-5d\n", int3);//flags = "-", artinya rata kiri
		System.out.printf("%+5d\n", int3);//flags akan mengambil slot didalam format
		System.out.printf("%+-6d\n", int3);//flags bisa digabungkan 
		System.out.printf("% 10d\n", int3);//jika setelah persen di kosongkan berarti itu seperti nomal hanya geser saja
		System.out.printf("%010d\n", int3);//angka "0" setelah "%" ini berarti flags(leading)
		System.out.printf("%+010d\n", int3);
		int int4 = 1000000000;
		System.out.printf("%-,15d\n", int4);//flags = "," menandakan delimeter per seribu
		//
		System.out.println("\nfloating point");
		float float1 = 1.543f;
		System.out.printf("%f\n", float1);
		System.out.printf("%+9f\n", float1);//floating point akan mengambil width dengan 6 decimal

		//[.preciion](untuk nglihatin berapa angka di belakang koma) ***
		System.out.println("\n[width]");
		float float2 = 15.678f;
		System.out.printf("%f\n", float2);
		System.out.printf("%.1f\n", float2);
		System.out.printf("%.2f\n", float2);
		System.out.printf("%8.2f\n", float2);//gabungkan dengan width
		System.out.printf("%+08.2f\n", float2);//gabungkan dengan width dan flag

		//contoh

		String nama2 = "ucup";
		float ipk = 3.78545657334f;

		//struktur format = %[argumen_index$][flags][width][.precision](conversion)
		System.out.printf("ipk %1$s berapa?\n,\n%1$s: saya dapat %2$+5.2f", nama2, ipk);

		//
		// kesimpulan
		//
		//save format ini kedalam variabel string
		String info_biasa = "nama: " + nama + ", ipk = " + ipk;
		System.out.println("biasa" + info_biasa);

		String info_format = String.format("nama: %s, ipk = %2$+5.2f", nama2, ipk);
		System.out.println("string format" + info_format);

		//save format ini kedalam string builder
		StringBuilder builder_info = new StringBuilder();
		Formatter formatBuilder = new Formatter(builder_info);//ini di lakukan agar apapun yang dimasukkan kedalam formatBuilder akan masuk ke dalam builder_info

		formatBuilder.format("nama: %s, ipk = %2$+5.2f", nama2, ipk);
		System.out.println("string builder format -> " + builder_info);
	}

}
