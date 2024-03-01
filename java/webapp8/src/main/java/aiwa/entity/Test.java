package aiwa.entity;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Item> items = new ArrayList<>();

		Item item1 = new Item();
		item1.setItemName("A");
		items.add(item1);
		Item item2 = new Item();
		item2.setItemName("B");
		items.add(item2);
		Item item3 = new Item();
		item3.setItemName("C");
		items.add(item3);

		show(items);
	}

	private static void change(List<Item> items) {

	}

	private static void show(List<Item> items) {
		for (Item item : items) {
			System.out.println(item.getItemName());
		}
	}

}
