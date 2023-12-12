package aiwa.entity;

public class Category {

	private int categoryId;
	private String categoryName;
	private String categoryImage;

	public String getCategoryImage() {
		return categoryImage;
	}

	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}

	/**
	 * カテゴリーIDを習得する
	 * @return
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * 
	 * @param categoryId
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
