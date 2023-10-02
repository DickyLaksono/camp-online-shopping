import java.util.Random;

public class PetShop {

	public Dog buyDog() {
		Dog d = new Dog();
		return d;
	}

	public Cat buyCat() {
		Cat c = new Cat();
		return c;
	}

	public Animal buyAnimal() {
		Random r = new Random();
		int n = r.nextInt(2);
		if (n == 0) {
			return new Dog();
		} else {
			return new Cat();
		}
	}
}
