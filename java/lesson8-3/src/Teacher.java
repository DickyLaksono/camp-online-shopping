
public class Teacher {

	public static void main(String[] args) {
		Student s = new Student();
		MusicPlayer mp = new MusicPlayer();
		s.listenMusic(mp);

		Game g = new Game();
		g.setTitle("CSGO");
		s.PlayGame(g);

		Dog d = new Dog();
		Food f = new Food();
		f.setType("肉");
		s.CareDog(d, f);

	}

}
