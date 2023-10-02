package lesson9;

public class Student {

	private String name;
	private int age;

	//ini namanya construct
	//ini gunanya untuk menentukann nilainy terlebih dahulu atw ini adalah nlai yg harus ada saat awal
	//ini agar tidak lupa
	public Student(String n, int a) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void intruduce() {
		System.out.println("名前は" + name + "です");
		System.out.println("年齢は" + age + "才です");
	}

}
