package lesson7;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author oo
 * @author tai
 *
 */
public class PairWork1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		String[] flowers = { "🌼", "🌷", "👃" };
		String flower = flowers[r.nextInt(flowers.length)];

		int water = 1;
		int energy = 1;
		int nutrition = 1;
		int friendly = 1;
		int health = 1;
		int mood = 1;

		for (int i = 0; i < 10; i++) {

			if (i <= 2) {
				System.out.println("🌱");
			} else if (i <= 5) {
				System.out.println("🍃");
			} else if (i <= 8) {
				System.out.println("🌲");
			}

			System.out.println(i + 1 + "日目(残り" + (9 - i) + "日)");
			System.out.println("何をしますか❓");

			System.out.println("1:💧水をあげる  2:🌞日に当てる  3:💉肥料を与える  4:😍話しかける 5:📴エアコンをつける 6:🎵音楽を聴かせる 7:🙊何もしない");

			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("何リットルあげますか");
				int liter = sc.nextInt();

				if (liter >= 4) {
					System.out.println("水のあげすきです🥶");
					System.out.println("👻枯れました");
					System.out.println("GAME OVER");
					return;
				}
				water += liter;

			} else if (menu == 2) {
				System.out.println("何時間日にあてますか");
				int time = sc.nextInt();

				if (time >= 4) {

					System.out.println("日に当てすぎです🥵");
					System.out.println("👻枯れました");
					System.out.println("GAME OVER");
					return;

				}
				energy += time;

			} else if (menu == 3) {
				System.out.println("肥料を何杯入れますか");
				int amount = sc.nextInt();
				if (amount >= 4) {
					System.out.println("肥料あげすぎ🍴");
					System.out.println("👻枯れました");
					System.out.println("GAME OVER");
					return;
				}
				nutrition += amount;

			} else if (menu == 4) {
				System.out.println("どんな話をしますか？");
				System.out.println("1:恋愛のこと 2:人生のこと 3:料理のこと 4:将来の夢");
				int type = sc.nextInt();
				if (type == 3) {
					System.out.println("食べられるの！？🥴");
					System.out.println("👻枯れました");
					System.out.println("GAME OVER");
					return;
				}
				friendly += 3;

			} else if (menu == 5) {
				System.out.println("何度エアコンをつけますか？");
				System.out.println("1:23  2:28  3:15  4:32");
				int temperature = sc.nextInt();
				if (temperature == 3) {
					System.out.println("寒い！🥶");
					System.out.println("👻枯れました");
					System.out.println("GAME OVER");
					return;
				} else if (temperature == 4) {
					System.out.println("暑い！🥵");
					System.out.println("👻枯れました");
					System.out.println("GAME OVER");
					return;
				}
				health += 3;

			} else if (menu == 6) {
				System.out.println("どんな音楽を聴かせますか？");
				System.out.println("1:pop 2:rock 3:jazz 4:classic");
				int type = sc.nextInt();
				if (type == 2) {
					System.out.println("うるさい！🤬");
					System.out.println("👻枯れました");
					System.out.println("GAME OVER");
					return;
				}

				mood += 3;
			}
			water--;
			energy--;
			nutrition--;
			friendly--;
			health--;
			mood--;
		}

		if (water <= 0) {
			System.out.println("水がぜんぜんない！");
			System.out.println("👻枯れました");
			System.out.println("GAME OVER");
		} else if (energy <= 0) {
			System.out.println("日光がぜんぜんない！");
			System.out.println("👻枯れました");
			System.out.println("GAME OVER");
		} else if (nutrition <= 0) {
			System.out.println("肥料がぜんぜんない！");
			System.out.println("👻枯れました");
			System.out.println("GAME OVER");
		} else if (friendly <= 0) {
			System.out.println("親交がぜんぜんない！");
			System.out.println("👻枯れました");
			System.out.println("GAME OVER");
		} else if (health <= 0) {
			System.out.println("元気がぜんぜんない！");
			System.out.println("👻枯れました");
			System.out.println("GAME OVER");
		} else if (mood <= 0) {
			System.out.println("機嫌が悪い！");
			System.out.println("👻枯れました");
			System.out.println("GAME OVER☠");
		} else {
			int result = water + energy + nutrition + friendly + health + mood;
			for (int k = 0; k < result; k++) {
				System.out.print(flower);
			}
			System.out.println();
			System.out.println("💐お花がいっぱいさきました💐");
			System.out.println("🎉GAME CLEAR🎉");
		}
	}

}
