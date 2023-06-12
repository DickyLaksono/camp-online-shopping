package Tutorial;

public class G_While_Loop {

	public static void main(String[] args) {

		int a = 0;
		boolean kondisi = true;

		System.out.println("awal program");

		while (kondisi) {
			System.out.println("while loop ke - " + a);
			//a++;

			if (a == 10) {
				kondisi = false;
			}
			a++;
		}

		System.out.println("akhir program");
	}

}
