package lesson8;

public class Car {

	String numberplate;
	String maker;
	int price;
	String color;
	double engineSize;

	public void introduce() {
		System.out.println("ナンバーは 【" + numberplate + "】です");
		System.out.println("私のメーカーは " + maker + "です");
		System.out.println("値段は " + price + "です");
		System.out.println("色は " + color + "です");
		System.out.println("エンジンサイズは " + engineSize + "リットルです");
	}

	public void go() {
		System.out.println("ブーン🚙");
	}

	public void brake() {
		System.out.println("キキー!");
	}

	public void turnRight() {
		System.out.println("右へ曲がります ☞");
	}

	public void turnLeft() {
		System.out.println("左へ曲がります ☜");
	}
}
