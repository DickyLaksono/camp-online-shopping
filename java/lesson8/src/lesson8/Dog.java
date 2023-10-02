package lesson8;

public class Dog {

	String name;
	String type;
	int age;

	public void introduce() {
		System.out.println("名前は " + name + " ワン");
		System.out.println("種類 " + type + " ワン");
		System.out.println("年齢 " + age + " ワン");
	}

	public void bark(int count) {
		for (int i = 0; i < count; i++) {

			System.out.println("ワン");
		}
	}

	public void jump() {
		if (age > 6) {
			System.out.println("ぴょうー👣");

		} else {
			System.out.println("… … 🐶");
		}

	}
}
