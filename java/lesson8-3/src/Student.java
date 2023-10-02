
public class Student {

	public void listenMusic(MusicPlayer player) {

		player.play();
	}

	public void PlayGame(Game game) {
		String title = game.getTitle();
		System.out.println(title + "で遊びます。");
	}

	public void CareDog(Dog dog, Food food) {

		dog.eat(food);

	}

}
