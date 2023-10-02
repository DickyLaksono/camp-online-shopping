package lesson9;

public class Test1 {
	private int num;

	public Test1(int n) {
		num = n;
	}

	public void show() {
		System.out.println("num = " + num);
	}

	public static void main(String[] args) {
		Test1 t = new Test1(1);
		t.show();
	}

}
