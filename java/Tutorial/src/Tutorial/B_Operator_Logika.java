package Tutorial;

public class B_Operator_Logika {
	public static void main(String[] args) {

		//operator logika --> operasi yang bisa kita lakukan kepada tipe data boolean
		//AND, OR, XOR(exclusive or), negasi

		boolean a, b, c;

		//OR / atau( || ) Logika nya di tambah
		System.out.println("==== OR (||)====");
		a = false;
		b = false;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);
		a = false;
		b = true;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);
		a = true;
		b = false;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);
		a = true;
		b = true;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);

		//AND / dan( && ) Logika nya di kali
		System.out.println();
		System.out.println("==== AND (&&)====");
		a = false;
		b = false;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);
		a = false;
		b = true;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);
		a = true;
		b = false;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);
		a = true;
		b = true;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);

		//XOR / exclusive or( ^ ) Logika nya jika ada nilai yg berbeda adalah true
		System.out.println();
		System.out.println("==== XOR (^)====");
		a = false;
		b = false;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);
		a = false;
		b = true;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);
		a = true;
		b = false;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);
		a = true;
		b = true;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);

		//NOT / negasi --> flipping (!)/membalikkan sebuah nilai
		System.out.println();
		System.out.println("==== NEGASI (!)====");
		a = true;
		c = !a;
		System.out.println(a + " -->(!) = " + c);
		a = false;
		c = !a;
		System.out.println(a + " -->(!) = " + c);
	}
}
