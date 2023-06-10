package extra1;

public class Test14 {

	public static void main(String[] args) {

		String str = "miura@sonezaki@maruyama@ichimiya@arita@";

		String[] names = str.split("@");

		;
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
