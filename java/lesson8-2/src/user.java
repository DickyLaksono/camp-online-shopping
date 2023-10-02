
public class user {

	public static void main(String[] args) {
		Shop shop = new Shop();

		SmartPhone s = shop.buyPhone();
		s.call();
		s.show();

		PC pc = shop.buyPC();
		pc.show();

		PetShop ps = new PetShop();
		Dog d = ps.buyDog();
		d.bark();
	}

}
