package lesson0;

public class Test8 {

	public void doIt1() {
		doIt2();
		System.out.println("hello");
		doIt2();
	}

	//access level
	private void doIt2() {
		System.out.println("bye");
	}
}
