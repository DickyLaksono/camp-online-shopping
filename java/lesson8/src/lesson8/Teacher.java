package lesson8;

public class Teacher {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "デイッキー";
		s1.country = "インドネシア";
		s1.age = 22;
		s1.introduce();

		Student s2 = new Student();
		s2.name = "ゆせふ";
		s2.country = "エジプト";
		s2.age = 21;
		s2.introduce();

		Student s3 = new Student();
		s3.name = "ウー";
		s3.country = "ミャンマー";
		s3.age = 23;
		s3.introduce();

		Student s4 = new Student();
		s4.introduce();

		/*Calculator c = new Calculator();// インスタンス化 instance
		System.out.println(c.plus(10, 20));
		System.out.println(c.minus(10, 5));
		System.out.println(c.multiply(10, 5));
		System.out.println(c.devide(10, 40));*/
		/*for (int i = 0; i < 5; i++) {
			s.clean(i + 1);
		
		}
		*/

		/*String[] names = { "三浦", "曽根崎", "丸山", "一宮", "有田" };
		for (int i = 0; i < names.length; i++) {
			s.greet(names[i]);
		
		}*/

		/*int a = c.plus(100, 20);
		int b = c.minus(100, 20);
		int d = c.multify(100, 20);
		double e = c.devide(100, 20);
		System.out.println("合計は" + a + "です");
		System.out.println("合計は" + b + "です");
		System.out.println("合計は" + d + "です");
		System.out.println("合計は" + e + "です");
		*/

	}

}
