package lesson8;

public class Student {

	//メンバー変数
	String name;
	String country;
	int age;

	//method
	public void introduce() {
		System.out.println("私の名前は" + name + "です. " + country + "です. " + age + "才です");
	}

	public void study() {
		System.out.println("📖✍");
	}

	public void clean(int floor) {
		System.out.println(floor + "階を掃除します");
	}

	public void jump(int num) {
		for (int i = 0; i < num; i++) {

			System.out.println("👣");
		}
	}

	public void greet(String s) {
		System.out.println(s + "先生おはようございます");
	}

	public int plus(int num1, int num2) {
		Calculator c = new Calculator();
		int answer = c.plus(num1, num2);
		return answer;
	}
}
