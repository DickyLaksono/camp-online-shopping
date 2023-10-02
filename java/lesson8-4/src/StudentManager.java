import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {

		// MODEL
		System.out.println("**** 学生管理システム ****");
		System.out.println();

		Student s1 = new Student();
		s1.setId("B-0001");
		s1.setName("タイシュエ ゼン アウン");
		s1.setCountry("ミャンマー");
		s1.setAge(19);

		Student s2 = new Student();
		s2.setId("B-0002");
		s2.setName("チャンティタイン トゥイ");
		s2.setCountry("ベトナム");
		s2.setAge(20);

		Student s3 = new Student();
		s3.setId("B-0003");
		s3.setName("ディッキー ラクソノ");
		s3.setCountry("インドネシア");
		s3.setAge(21);

		Student s4 = new Student();
		s4.setId("B-0004");
		s4.setName("マハルジャン バブ ソウブ");
		s4.setCountry("ベトナム");
		s4.setAge(22);

		Student s5 = new Student();
		s5.setId("B-0005");
		s5.setName("ホアンティ ダオ");
		s5.setCountry("ベトナム");
		s5.setAge(23);

		Student s6 = new Student();
		s6.setId("B-0006");
		s6.setName("ドフック ハウ");
		s6.setCountry("ベトナム");
		s6.setAge(23);

		Student s7 = new Student();
		s7.setId("B-0007");
		s7.setName("リン テットトゥン");
		s7.setCountry("ミャンマー");
		s7.setAge(25);

		Student s8 = new Student();
		s8.setId("B-0008");
		s8.setName("レーティ ハン");
		s8.setCountry("ベトナム");
		s8.setAge(22);

		Student s9 = new Student();
		s9.setId("B-0009");
		s9.setName("ドバン ズン");
		s9.setCountry("ベトナム");
		s9.setAge(24);

		Student s10 = new Student();
		s10.setId("B-0010");
		s10.setName("レ クエ アン");
		s10.setCountry("ベトナム");
		s10.setAge(21);

		Student s11 = new Student();
		Student s12 = new Student();
		Student s13 = new Student();
		Student s14 = new Student();
		Student s15 = new Student();
		Student s16 = new Student();
		Student s17 = new Student();
		Student s18 = new Student();
		Student s19 = new Student();
		Student s20 = new Student();
		Student s21 = new Student();
		Student s22 = new Student();

		s11.setId("B-0011");
		s12.setId("B-0012");
		s13.setId("B-0013");
		s14.setId("B-0014");
		s15.setId("B-0015");
		s16.setId("B-0016");
		s17.setId("B-0017");
		s18.setId("B-0018");
		s19.setId("B-0019");
		s20.setId("B-0020");
		s21.setId("B-0021");
		s22.setId("B-0022");

		s11.setName("オズデミル フルカン");
		s12.setName("ゴルバチョワ マルガリータ");
		s13.setName("チャン ティ タイン トゥイ");
		s14.setName("サカジ ブラジストラブ");
		s15.setName("ソー ヤン ナィン テット");
		s16.setName("チャン ビェット ドゥック");
		s17.setName("タイ シュエ ゼン アウン");
		s18.setName("ユッセフ モハマド ハサン モハマド エルノビ");
		s19.setName("シノモト ケイコ");
		s20.setName("エケルンド マリウス オスカル ダニエル");
		s21.setName("グエン ミン ティエン");
		s22.setName("ヌウェウー カイ");

		s11.setCountry("トルコ");
		s12.setCountry("ロシア");
		s13.setCountry("ベトナム");
		s14.setCountry("ウクライナ");
		s15.setCountry("ミャンマー");
		s16.setCountry("ベトナム");
		s17.setCountry("ミャンマー");
		s18.setCountry("エジプト");
		s19.setCountry("シンガポール");
		s20.setCountry("ノルウェー");
		s21.setCountry("ベトナム");
		s22.setCountry("ミャンマー");

		s11.setAge(21);
		s12.setAge(20);
		s13.setAge(25);
		s14.setAge(24);
		s15.setAge(21);
		s16.setAge(20);
		s17.setAge(19);
		s18.setAge(18);
		s19.setAge(20);
		s20.setAge(27);
		s21.setAge(23);
		s22.setAge(26);

		ArrayList<Student> students = new ArrayList<Student>();//pada " <> " yang kedua tidak harus diisi
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		students.add(s11);
		students.add(s12);
		students.add(s13);
		students.add(s14);
		students.add(s15);
		students.add(s16);
		students.add(s17);
		students.add(s18);
		students.add(s19);
		students.add(s20);
		students.add(s21);
		students.add(s22);

		// CONTROLER
		while (true) {
			Scanner scanInt = new Scanner(System.in);
			Scanner scanStr = new Scanner(System.in);
			System.out.println("1:学籍番号  2:名前  3:国籍  4:年齢  5:終了");
			int menu = scanInt.nextInt();

			ArrayList<Student> result = new ArrayList<>();

			if (menu == 2) {
				System.out.println("キーワードを入力してください");
				String keyword = scanStr.nextLine();

				for (int i = 0; i < students.size(); i++) {
					Student s = students.get(i);
					String name = s.getName();
					if (name.contains(keyword)) {
						result.add(s);
					}
				}

			} else if (menu == 3) {
				System.out.println("キーワードを入力してください");
				String keyword = scanStr.nextLine();

				for (int i = 0; i < students.size(); i++) {
					Student s = students.get(i);
					String country = s.getCountry();
					if (country.contains(keyword)) {
						result.add(s);
					}

				}
			} else if (menu == 4) {
				System.out.println("キーワードを入力してください");
				int keyword1 = scanInt.nextInt();
				int keyword2 = scanInt.nextInt();

				for (int i = 0; i < students.size(); i++) {
					Student s = students.get(i);
					int age = s.getAge();
					if (age >= keyword1 && age <= keyword2) {
						result.add(s);
					}

				}

			} else if (menu == 1) {
				System.out.println("キーワードを入力してください");
				String keyword = scanStr.nextLine();

				for (int i = 0; i < students.size(); i++) {
					Student s = students.get(i);
					String id = s.getId();
					if (id.equals(keyword)) {
						result.add(s);
					}

				}
			} else if (menu == 5) {
				System.out.println("----- プログラム終了 -----");
				break;
			}

			// ------- VIEW ---------
			if (result.size() == 0) {
				System.out.println("見つかりませんでした");
			} else {
				//

				for (int i = 0; i < result.size(); i++) {
					Student s = result.get(i);

					System.out.println("学籍番号  : " + s.getId());
					System.out.println("名前 	  : " + s.getName());
					System.out.println("国籍	  : " + s.getCountry());
					System.out.println("年齢 	  : " + s.getAge());
					System.out.println("-----------------------------------");
					System.out.println();
				}
			}
		}
	}

}
