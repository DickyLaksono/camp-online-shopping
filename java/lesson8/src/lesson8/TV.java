package lesson8;

public class TV {

	private boolean power;
	private int channel;// default nya int "0"
	private int volume;

	public void show() {

		if (power) {
			if (channel == 0) {
				System.out.println("チャンネル : 未選択");
			} else {
				System.out.println("チャンネル : " + channel);
			}

			System.out.println("ボリューム : " + volume);

		}

	}

	// method ini digunakan jika ingin menggunakan private
	// (ini mengendalikan tv menggunakan remote)
	// merit meggunakan ini
	public void setPower(boolean p) {
		power = p;
	}

	public void setChannel(int c) {
		if (c == 1 || c == 2 || c == 3 || c == 4 || c == 5 || c == 6 || c == 7 || c == 8) {
			channel = c;
		}
	}

	public void setVolume(int v) {
		if (volume >= 0 && volume <= 40) {

			volume = v;
		}
	}
}
