package lesson8;

public class CatOwner {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.name = "トラ";
		c.color = "黒";
		c.weight = 5.5;
		c.introduce();
		c.eat();
		c.sleep();
		c.meow();

		System.out.println();
		Cat c2 = new Cat();
		c2.name = "ミミ";
		c2.color = "白";
		c2.weight = 3.2;
		c2.introduce();
		c2.eat();
		c2.sleep();
		c2.meow();

	}

}
