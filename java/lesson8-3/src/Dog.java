
public class Dog {

	public void eat(Food food) {
		String type = food.getType();

		if (type.equals("肉") || type.equals("骨")) {
			System.out.println(type + "を食べます。パクパク🐶");

		} else {
			System.out.println(type + "それ以外は食べません");
		}
	}

}
