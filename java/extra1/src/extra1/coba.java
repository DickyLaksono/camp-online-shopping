package extra1;

enum Country {
	JAPAN, VIETNAM, MYANMAR, AMERIKA
}

public class coba {

	public static void main(String[] args) {

		//		String str = "miura tatsuya";
		//
		//		System.out.println(str.length());
		//		System.out.println(str.indexOf("a", 5));
		//		System.out.println(str.substring(8));
		//		System.out.println(str.substring(4, 7));
		//
		//		char[] arr = str.toCharArray();
		//		int b = 0;
		//		for (char a : arr) {
		//			if (a == 'a') {
		//				b++;
		//			}
		//		}
		//		System.out.println(b);

		//		Scanner scanner = new Scanner(System.in);
		//		int[] num = new int[5];
		//
		//		int t = 0;
		//		for (int i = 0; i < 5; i++) {
		//			num[i] = scanner.nextInt();
		//
		//			t = t + num[i];
		//		}
		//		System.out.println(t);
		//
		//		int min = num[0];
		//		int max = num[0];
		//
		//		for (int i = 1; i < 5; i++) {
		//			if (num[i] < min) {
		//				min = num[i];
		//			}
		//
		//			if (num[i] > max) {
		//				max = num[i];
		//			}
		//		}
		//		System.out.println(max);
		//		System.out.println(min);

		greet(Country.AMERIKA);

	}

	private static void greet(Country country) {

		if (country == Country.JAPAN) {
			System.out.println("こんにちは");
		} else if (country == Country.VIETNAM) {
			System.out.println("シンチャう");
		} else if (country == Country.MYANMAR) {
			System.out.println("ミンガらーば");
		} else if (country == Country.AMERIKA) {
			System.out.println("ハロー");
		}

		switch (country) {
		case JAPAN:
			System.out.println("こんいちは");
			break;
		}
	}

	private static Country getCountry() {
		return Country.AMERIKA;
	}

}
