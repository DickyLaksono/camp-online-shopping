package aiwa.util;

public class StringUtil {

	public static String toMoney(int num) {

		return String.format("%,d", num);
	}

	public static String toBreak(String str) {
		return str.replace("\r\n", "<br>");
	}

	public static String toRating(int num) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append(
					"<img src='img/star.png' height='20px'>");
		}

		return sb.toString();
	}

	public static String toRating(double num) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < (int) num; i++) {
			sb.append("<img src='img/star.png' height='20px'>");
		}

		if (num % 1 != 0) {
			sb.append("<img src='img/half-star.png' height='20px'>");
		}

		return sb.toString();
	}

}
