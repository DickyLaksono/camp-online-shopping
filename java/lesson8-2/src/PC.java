
public class PC {

	private String type;
	private int size;

	public void show() {
		System.out.println("*** information ***");
		System.out.println(this.type + " " + this.size + " inch");
		System.out.println("*******************");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
