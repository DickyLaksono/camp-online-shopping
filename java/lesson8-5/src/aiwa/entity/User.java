package aiwa.entity;

public class User {

	private int id;
	private String name;
	private int age;
	private int type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getType() {
		return type;
	}

	public String getTypeName() { // ini untuk mengatur type agar lebih praktis
		if (this.type == 1) {
			return "account";
		} else if (this.type == 2) {
			return "page";
		} else {
			return "group";
		}
		// jika terakhir nya else maka return yang terakhir nya tidak perlu di masukkan 
		// karena jika else ,, akan mencakup return yang ada didalam if dan method nya
	}

	public void setType(int type) {
		this.type = type;
	}

}
