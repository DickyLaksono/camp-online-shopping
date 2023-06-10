package lesson5;

public class Test9 {

	public void doIt1() {
		int num = 10;

		if (num == 10) {
			System.out.println("A");
		} else if (num == 20) {
			System.out.println("B");
		} else if (num == 30) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

		switch (num) {
		case 10:
			System.out.println("A");
			break;
		case 20:
			System.out.println("B");
			break;
		case 30:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}

		System.out.println(num == 10 ? "OK" : "NG");
	}

	public void doIt2() {
		int num = 10;

		if (num == 10) {
			System.out.println("OK1");
			System.out.println("OK2");
		}
	}

}
