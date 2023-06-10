package Tutorial;

public class A_Operator_Komparasi {

	public static void main(String[] args) {
		//operator komparasi ...ini akan menghasilkan nilai dalam bentuk boolean

		int a, b;
		boolean hasilkomparasi;

		//operator equal atau persamaan
		System.out.println("=== persamaan ===");
		a = 10;
		b = 10;
		hasilkomparasi = (a == b);
		System.out.println(a + " == " + b + " -->" + hasilkomparasi);

		a = 12;
		b = 10;
		hasilkomparasi = (a == b);
		System.out.println(a + " == " + b + " -->" + hasilkomparasi);

		//operator not equal atau pertidaksamaan
		System.out.println("=== pertidaksamaan ===");
		a = 10;
		b = 10;
		hasilkomparasi = (a != b);//tanda seru artinya bukan
		System.out.println(a + " != " + b + " -->" + hasilkomparasi);

		a = 12;
		b = 10;
		hasilkomparasi = (a != b);
		System.out.println(a + " != " + b + " -->" + hasilkomparasi);

		//operator less than atau kurang dari
		System.out.println("=== kurang dari ===");
		a = 9;
		b = 10;
		hasilkomparasi = (a < b);
		System.out.println(a + " < " + b + " -->" + hasilkomparasi);

		a = 12;
		b = 10;
		hasilkomparasi = (a < b);
		System.out.println(a + " < " + b + " -->" + hasilkomparasi);

		//operator greater than atau kurang dari
		System.out.println("=== lebih dari ===");
		a = 9;
		b = 10;
		hasilkomparasi = (a > b);
		System.out.println(a + " > " + b + " -->" + hasilkomparasi);

		a = 12;
		b = 10;
		hasilkomparasi = (a > b);
		System.out.println(a + " > " + b + " -->" + hasilkomparasi);

	}
}
