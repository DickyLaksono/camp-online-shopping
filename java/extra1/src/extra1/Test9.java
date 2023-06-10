package extra1;

public class Test9 {

	public static void main(String[] args) {

		int[] scores = new int[5];
		scores[0] = 60;
		scores[1] = 70;
		scores[2] = 100;
		scores[3] = 80;
		scores[4] = 40;

		for (int i = 0; i < 5; i++) {

			System.out.print(scores[i] + "点:");
			if (scores[i] >= 65) {
				System.out.println("合格");
			} else {
				System.out.println("不合格");
			}

		}

	}

}
