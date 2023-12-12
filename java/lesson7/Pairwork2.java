package lesson7;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author ユッセフ
 * @author トウイ
 *
 */
public class Pairwork2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] animals = { "🐶", "🦁", "🐅",
				"🐨", "🐔", "🐭", "🐔", "🐭",
				"🐰", "🐵", "🐽", "🦍", "🐪",
				"🐮", "🐼", "🐪", "🦛", "🐻",
				"🏇", "🐽", "🦍", "🦛", "🐻",
				"🦛", "🐻", "🐘", "🐮", "🐼",
				"🐨", "🐔", "🐭", "🐵", "🐼",
				"🐨", "🐔", "🐭", "🐶", "🦁"
		};

		String[] cats = { "😽", "🐈", "😺" };

		Random r = new Random();
		int cnt = 4;
		while (true) {
			int tate = r.nextInt(cnt);
			int yoko = r.nextInt(cnt);

			for (int i = 0; i < cnt; i++) {
				for (int k = 0; k < cnt; k++) {

					if (i == yoko && k == tate) {
						System.out.print(cats[r.nextInt(cats.length)]);
					} else {
						System.out.print(animals[r.nextInt(animals.length)]);
					}
				}

				System.out.println();
			}

			System.out.println("見つけたニャー?");
			System.out.println("縦（1～N）");
			int t = s.nextInt();
			System.out.println("横（1～N）");
			int y = s.nextInt();

			if (tate == --t && yoko == --y) {
				System.out.println("正解ニャー");
				++cnt;
			} else {
				System.out.println("違うニャー");
				break;
			}
		}

	}

}
