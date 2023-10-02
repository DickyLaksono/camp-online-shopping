package lesson8;

public class Cat {

	String name;
	String color;
	double weight;

	public void introduce() {
		System.out.println("名前は " + name + " ニャー");
		System.out.println("色は " + color + " ニャー");
		System.out.println("体重は " + weight + " ニャー");
	}

	public void sleep() {
		System.out.println("おやすみ 🛏");
	}

	public void eat() {
		System.out.println("おいしいにゃー 🐠");
	}

	public void meow() {
		System.out.println("にゃー 😼");
	}

}
