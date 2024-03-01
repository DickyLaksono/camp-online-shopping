package aiwa.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

	public static String toDate(String d) {

		try {
			//String → Date
			//String s = "2023-02-02";
			SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");

			//Date → String
			SimpleDateFormat out = new SimpleDateFormat("yyyy年MM月dd日");

			Date dt = in.parse(d);
			String s = out.format(dt);
			return s;

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return "";

	}

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
