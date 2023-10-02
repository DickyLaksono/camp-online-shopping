
public class Shop {

	public SmartPhone buyPhone() {
		SmartPhone s = new SmartPhone();
		s.setType("android");
		s.setVersion(9);

		return s;
	}

	public PC buyPC() {
		PC pc = new PC();
		pc.setType("windows");
		pc.setSize(14);

		return pc;
	}
}
