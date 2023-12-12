package aiwa3;

public class A {
	public static void main(String[] args) {

		Dog d1 = new Dog();
		d1.setName("AA");

		Dog d2 = new Dog();
		d2.setName("AA");

		d1.show();
		d2.show();
	}

}

class Dog {
	private String name;

	public void setName(String name) {
		this.name = name;

	}

	public void show() {
		System.out.println("my name is" + name);
	}
}
