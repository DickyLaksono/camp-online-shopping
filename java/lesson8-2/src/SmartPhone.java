
public class SmartPhone {

	private String type;
	private int version;

	public void show() {
		System.out.println("****** information ******");
		System.out.println(this.type + " " + this.version);
		System.out.println("*************************");
	}

	public void call() {
		System.out.println("calling");

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
