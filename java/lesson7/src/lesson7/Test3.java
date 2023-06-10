package lesson7;

import java.util.ArrayList;

public class Test3 {

	public void doIt1() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		for (int i = 0; i < list.size(); i++) {
			int n = list.get(i);
			System.out.println(n);
		}

		ArrayList<String> names = new ArrayList<String>();
		names.add("タイ");
		names.add("ウー");
		names.add("やリン");
		for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			System.out.println(s);
		}

	}
}
