package lesson8;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner si = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		System.out.println("*** カーシミュレーション");

		Car c = new Car();
		System.out.println("ナンバーを入力してください");
		c.numberplate = ss.nextLine();
		System.out.println("メーカーを入力してください");
		c.maker = ss.nextLine();
		System.out.println("色を入力してください");
		c.color = ss.nextLine();
		System.out.println("価格を入力してください");
		c.price = si.nextInt();
		System.out.println("ガソリンサイズを入力してください");
		c.engineSize = si.nextDouble();

		while (true) {
			System.out.println("------ MENU ------");
			System.out.println("1.自己紹介 2.アクセル 3.ブレーキ 4.右へ曲がる 5.左へ曲がる 0.終了");
			System.out.println();
			int menu = si.nextInt();
			if (menu == 0) {
				System.out.println("終了");
				break;
			} else if (menu == 1) {
				c.introduce();
			} else if (menu == 2) {
				c.go();
			} else if (menu == 3) {
				c.brake();
			} else if (menu == 4) {
				c.turnRight();
			} else if (menu == 5) {
				c.turnLeft();
			} else {
				System.out.println("エラー");
				continue;
			}
		}

	}

}
