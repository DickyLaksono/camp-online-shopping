package aiwa.entity;

public class account {

	private int id;
	private String user;
	private String email;
	private String password;
	private int isAdmin;
	private String zipcode;
	private String address;

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public account(int id, String user, String email, String password, int i, String z, String a) {
		this.id = id;
		this.user = user;
		this.email = email;
		this.password = password;
		this.isAdmin = i;
		this.zipcode = z;
		this.address = a;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
