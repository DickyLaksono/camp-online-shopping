package Tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class V_RWF_Char_Stream {

	public static void main(String[] args) throws IOException {
		// membuka file 

		// byte stream -> fileinputstream
		//character stream
		FileInputStream bytefileinput = new FileInputStream("");
		FileReader charfileinput = new FileReader("");

		FileOutputStream bytefileoutput = new FileOutputStream("");
		FileReader charfileoutput = new FileReader("");

		//membaca file

		// byte file
		int buffer = bytefileinput.read();

		while (buffer != -1) {
			System.out.println((char) buffer);
			bytefileoutput.write(buffer);
			buffer = bytefileinput.read();
		}

		System.out.println("\n");

		//char file
		buffer = charfileinput.read();

		while (buffer != -1) {
			System.out.print((char) buffer);
			//charfileoutput.write(buffer);
			buffer = charfileinput.read();
		}

		//menutup file
		bytefileinput.close();
		charfileinput.close();
		bytefileoutput.close();
		charfileoutput.close();

	}

}
