
public class Starter3 {

	public static void main(String[] args) {
		//		Iphone i = new Iphone();
		//		i.on();
		//		i.call();
		//
		//		Android a = new Android();
		//		a.on();
		//		a.call();

		//
		//pada kasus ini jika ingin menggunakan aabstract / tidak jelas harus menggunakan 
		//parent class (SmartPhone ) lalu method nya
		//ini seperti inigin meminjam hp tanpa mempedulikan android ataupun iphone
		SmartPhone a = new Android();
		a.on();
		a.call();
	}

}
