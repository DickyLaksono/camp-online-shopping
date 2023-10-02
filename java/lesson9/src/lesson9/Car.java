package lesson9;

public class Car {
	private String number;
	private double gas;

	//pada construct bisa menggunakan method yang sama ,asalkan 引数 nya berbeda(オーバーロード)
	public Car(String number) {
		System.out.println("A");
		this.number = number;
	}

	public Car(String number, double gas) {
		System.out.println("B");
		this.number = number;
		this.gas = gas;
	}

	//********* オーバーロード adalah saat menggunakan nama method yang sama tetapi 引数 nya berbeda *********
	public void show() {
		System.out.println("number : " + number);
		System.out.println("gas : " + gas);
	}
}
