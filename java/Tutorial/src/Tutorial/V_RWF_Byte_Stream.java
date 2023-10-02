package Tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class V_RWF_Byte_Stream {

	public static void main(String[] args) throws IOException {

		FileInputStream fileinput = null;
		FileOutputStream fileoutput = null;

		//membuka file
		fileinput = new FileInputStream("input.txt");

		//membaca file
		int data = fileinput.read();

		while (data != -1) {
			System.out.println((char) data);
			data = fileinput.read();
		}

		//menutup file
		fileinput.close();

		//salah satu contoh skenario program pembukaan file
		try {
			//membuka file
			fileinput = new FileInputStream("input2.txt");
			fileoutput = new FileOutputStream("output2.txt");

			int buffer = fileinput.read();

			while (buffer != -1) {
				fileoutput.write(buffer);
				buffer = fileinput.read();
			}

		} finally {
			if (fileinput != null) {
				fileinput.close();
			}
			if (fileoutput != null) {
				fileinput.close();
			}

		}

		// yang terakhir(try with resources)
		try (FileInputStream in = new FileInputStream("input2.txt");
				FileOutputStream out = new FileOutputStream("output2.txt")) {

			// membaca file
			int data2 = in.read();

			while (data2 != -1) {
				out.write((char) data2);
				data2 = in.read();
			}
		}

	}

}
