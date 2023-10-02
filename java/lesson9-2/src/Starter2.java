
public class Starter2 {

	public static void main(String[] args) {

		//		Dog d = new Dog();
		//		d.walk();
		//		d.ote();
		//
		//		Cat c = new Cat();
		//		c.walk();
		//		c.jump();
		//
		//		Shepherd s = new Shepherd();
		//		s.walk();
		//		s.ote();
		//		s.search();
		//
		//		Animal a = new Animal();
		//		a.walk();

		//		Animal a1 = new Dog();
		//		Animal a2 = new Cat();

		PetShop ps = new PetShop();
		Dog d = ps.buyDog();// pada bagian awal "Dog d " adalh 戻り値
		d.naku();

		Cat c = ps.buyCat();
		c.naku();

		Animal a = ps.buyAnimal();
		a.naku();

	}

}
