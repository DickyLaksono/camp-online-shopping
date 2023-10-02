package lesson8;

public class AirCon {

	private String maker;
	private boolean power;
	private int temp;
	private int mode;

	public void show() {
		System.out.println(maker + ":" + power + ":" + temp + ":" + mode);
	}

	public void setMaker(String maker) {
		this.maker = maker;//penggunaan this untuk agar bisa mengambil nilai dari atas
	}

	public String getMaker() {
		return this.maker;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public boolean getPower() {
		return this.power;
	}

	public void setTemp(int temp) {
		if (temp >= 20 && temp <= 30) {
			this.temp = temp;

		}
	}

	public int getTemt() {
		return this.temp;
	}

	public void setMode(int mode) {
		if (mode == 1 || mode == 2 || mode == 3) {
			this.mode = mode;

		}
	}

	public int getMode() {
		return this.mode;
	}

}
