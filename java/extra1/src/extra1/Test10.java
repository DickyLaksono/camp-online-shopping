package extra1;

public class Test10 {

	public static void main(String[] args) {

		int[] ages = new int[5];

		ages[0] = 5;
		ages[1] = 7;
		ages[2] = 20;
		ages[3] = 30;
		ages[4] = 50;

		for (int i = 0; i < 5; i++) {
			System.out.print(ages[i] + ": 才です." + " ");

			if (ages[i] >= 50) {
				System.out.println("おじいさん");
			} else if (ages[i] >= 30) {
				System.out.println("おじさん");
			} else if (ages[i] >= 20) {
				System.out.println("大人");
			} else if (ages[i] >= 10) {
				System.out.println("子供");
			} else {
				System.out.println("赤ちゃん");
			}
		}
	}

}
