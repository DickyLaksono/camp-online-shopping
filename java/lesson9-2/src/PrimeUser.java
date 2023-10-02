
public class PrimeUser extends User {

	private double discount;

	public void show() {

		super.show();//super untuk memanggil "parent class"
		System.out.println("DISCOUNT: " + discount + "%%OFF");
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
