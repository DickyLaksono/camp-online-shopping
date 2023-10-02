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
		System.out.println(str.lastIndexOf("y"));
		System.out.println(str.startsWith("m"));
		System.out.println(str.endsWith("a"));
		System.out.println(str.isEmpty());
		System.out.println(str.substring(str.length() - 1));
		char c2 = str.charAt(str.length() - 1);
		System.out.println(c2);

		System.out.println();
		char[] arr2 = str.toCharArray();
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println();
		String[] arr1 = str.split("a");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
