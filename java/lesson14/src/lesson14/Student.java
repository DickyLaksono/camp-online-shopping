package lesson14;

public class Student {

	public Coffee buyCoffee(int money) throws NotEnoughMoneyException, OutOfStockException {
		Shop s = new Shop();
		Coffee c = s.buyCoffee(money);
		return c;

	}
}
