
public class User {

	private int id;
	private String name;
	private String password;
	private String address;
	private String tel;
	private String birthday;

	public void show() {
		System.out.println("ID: " + id);
		System.out.println("NAME: " + name);
		System.out.println("BIRTHDAY: " + birthday);
		System.out.println("PASS: " + password);
		System.out.println("ADDRESS: " + address);
		System.out.println("TEL: " + tel);
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
