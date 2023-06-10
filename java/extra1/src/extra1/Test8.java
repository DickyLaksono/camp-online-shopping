package extra1;

public class Test8 {

	public static void main(String[] args) {
		int size = 9;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				int result = i * j;
				System.out.print(result + "\t"); // タブ区切りで表示
			}
			System.out.println(); // 改行
		}
	}

}
//if (i % 3 == 0) {
//	System.out.println(i);
//}