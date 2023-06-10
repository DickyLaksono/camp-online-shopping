package extra1;

public class Test17 {

	public static void main(String[] args) {

		String str = "miura tatsuya";

		System.out.println(str.charAt(1));
		System.out.println(str.indexOf("m"));
		System.out.println(str.contains("m"));
		System.out.println(str.length());
		System.out.println(str.equals("miura tatsuya"));
		System.out.println(str.replace("miura", "youssef"));
		System.out.println(str.substring(9));
		System.out.println(str.substring(3, 8));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		String[] arr1 = str.split("");
		char[] arr2 = str.toCharArray();

		for (int i = 0; i < arr2.length; i++) {
			char c = arr2[i];
			System.out.println(c);
		}

	}

}
