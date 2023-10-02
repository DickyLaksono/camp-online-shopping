
public class Starter {

	public static void main(String[] args) {

		User u = new User();
		u.setId(1);
		u.setName("アン");
		u.setBirthday("2000/01/20");
		u.setAddress("博多");
		u.setPassword("aiwa5858");
		u.setTel("090-2222-3333");

		u.show();

		System.out.println("------------------------");
		PrimeUser pu = new PrimeUser();
		pu.setId(2);
		pu.setName("ディッキー");
		pu.setBirthday("2000/11/28");
		pu.setAddress("博多");
		pu.setPassword("aiwa5858");
		pu.setTel("090-2222-3333");
		pu.setDiscount(10.5);

		pu.show();

	}

}
