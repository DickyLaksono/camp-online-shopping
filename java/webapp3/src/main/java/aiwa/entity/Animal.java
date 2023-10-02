package aiwa.entity;

public class Animal {

	private int Id;
	private String type;
	private double height;
	private double weight;
	private String image;

	public Animal(int id, String type, double height, double weight, String image) {
		this.Id = id;
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.image = image;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
