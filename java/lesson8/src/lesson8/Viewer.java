package lesson8;

public class Viewer {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.setPower(true);

		tv.setChannel(3);
		tv.setVolume(50);

		tv.show();

	}

}
