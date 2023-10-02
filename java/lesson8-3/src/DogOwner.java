
public class DogOwner {

	public static void main(String[] args) {

		Dog d = new Dog();
		Food f = new Food();

		f.setType("肉");

		d.eat(f);
	}

}
