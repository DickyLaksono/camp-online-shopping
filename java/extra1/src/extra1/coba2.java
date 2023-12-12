package extra1;

import java.util.Scanner;

public class coba2 {

	public static void main(String[] args) {
		String[] names = { "みうら", "いちみや", "まるやま", "ありた", "そねざき" };

		Scanner scan = new Scanner(System.in);
		System.out.println("検索名前を入力してください");

		String target = scan.nextLine();

		boolean hit = false;

		for (int i = 0; i < names.length; i++) {
			if (target.equals(names[i])) {
				hit = true;
			}
		}
		if (hit) {
			System.out.println("名前が見つかりました");
		} else {
			System.out.println("名前が見つかりませんでした");
		}
		//

		//

	}

}
