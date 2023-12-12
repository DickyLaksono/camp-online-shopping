package aiwa.entity;

public class Type {

	private int itemid;
	private String name;
	private String detail;
	private String image;
	private Category categoryid;

	public Category getCategory() {
		return categoryid;
	}

	public void setCategory(Category categoryid) {
		this.categoryid = categoryid;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
