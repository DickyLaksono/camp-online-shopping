
public class DVDPlayer implements Player {

	//untuk menggunakan implements harus meng overraide ,
	//dengan menggunakan nama method yang sama dari class yang di inplements
	@Override
	public void play() {
		System.out.println("映画を映す📺");

	}

}
