package lesson8;

public class DogOwner {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.name = "リン";
		d.type = "チワワ";
		d.age = 11;

		d.introduce();
		d.bark(5);
		d.jump();

		System.out.println();
		Dog d2 = new Dog();
		d2.name = "リン";
		d2.type = "ハスキー";
		d2.age = 2;

		d2.introduce();
		d2.bark(2);
		d2.jump();
	}

}
