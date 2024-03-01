package aiwa.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {

		//String → Date
		String s = "2023-02-02 10:10:10";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d2 = sdf2.parse(s);

		//Date → String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh時mm分");
		String d = sdf.format(d2);
		System.out.println(d);

	}

}
