package Tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class X_Scanner_Dan_Tokenizer {

	public static void main(String[] args) throws IOException {

		FileReader fileinput = new FileReader("input5.txt");
		BufferedReader bufferReader = new BufferedReader(fileinput);

		Scanner scanner = new Scanner(bufferReader);

		//ini untuk cek ada kata selanjutnya atau tidak
		System.out.println(scanner.hasNext());//true

		//untuk membaca kata, dengan pemisah/delimeter spasi
		System.out.println(scanner.next());
		System.out.println(scanner.next());
		System.out.println(scanner.next());
		System.out.println(scanner.next());
		System.out.println(scanner.next());

		System.out.println(scanner.hasNext());//false

		//
		//menggunakan delimeter terterntu
		FileReader fileinput2 = new FileReader("input6.txt");
		bufferReader = new BufferedReader(fileinput2);
		bufferReader.mark(200); //ini agar bisa diriset

		scanner = new Scanner(bufferReader);
		scanner.useDelimiter(",");

		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}

		//mengguakan string tokenizer
		//ini digunakan jika file nya ada dua baris, tapi hanya ingin membacanya perbaris
		bufferReader.reset();
		String data = bufferReader.readLine();
		System.out.println(data);

		StringTokenizer stringToken = new StringTokenizer(data, ",");

		while (stringToken.hasMoreTokens()) {
			System.out.println(stringToken.nextToken());
		}

		// baris kedua
		data = bufferReader.readLine();
		System.out.println(data);

		stringToken = new StringTokenizer(data, ",");

		while (stringToken.hasMoreTokens()) {
			System.out.println(stringToken.nextToken());
		}

	}

}
