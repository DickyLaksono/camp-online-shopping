package lesson14;

public class Shop {

	private int stock = 10;

	public Coffee buyCoffee(int money) throws NotEnoughMoneyException, OutOfStockException {

		if (money < 120) {
			throw new NotEnoughMoneyException();
		}
		if (stock < 120) {
			throw new OutOfStockException();
		}

		Coffee c = new Coffee();
		c.setType("ホットコーヒー");
		return c;
	}
}
