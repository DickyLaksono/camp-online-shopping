package extra1;

public class Test12 {

	public static void main(String[] args) {
		double[] weight = new double[5];

		weight[0] = 50.5;
		weight[1] = 41.5;
		weight[2] = 62.5;
		weight[3] = 83.5;
		weight[4] = 44.5;

		for (int i = 0; i < 5; i++) {

			if (weight[i] >= 70) {
				System.out.println("重い");
			} else if (weight[i] >= 50) {
				System.out.println("普通");
			} else if (weight[i] <= 49) {
				System.out.println("軽い");
			}
		}
	}

}
