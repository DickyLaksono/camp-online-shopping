package Tutorial;

public class I_Break_Continue_Return {

	public static void main(String[] args) {

		int a = 0;

		while (true) {

			a++;
			if (a == 10) {
				break;
			} else if (a == 5) {
				continue;// ini akan loncat kedepan dan 5 nya akan di skip(ini untuk memaksa memulai aksi dari awal)
			} else if (a == 7) {
				return;
				//return ini akan mengakhiri program dari main(String[] args) ini /akan langsung keluar,
				//di taruh dimanapun
			}
			System.out.println("looping ke - " + a);
		}
		System.out.println("akhir program");

	}

}
