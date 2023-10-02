package lesson14;

public class Teacher {

	public static void main(String[] args) {
		Student s = new Student();

		try {
			Coffee c = s.buyCoffee(190);
			System.out.println(c.getType() + "を飲みます");
		} catch (NotEnoughMoneyException e) {
			System.out.println("お金を追加しましょう");
		} catch (OutOfStockException e) {
			System.out.println("あきらめよう");
		}

	}

}
