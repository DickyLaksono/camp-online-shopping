package Tutorial;

public class C_Operator_Bitwise {

	public static void main(String[] args) {

		//operator bitwise --> operator untuk melakukan operasi padan nilai bit
		byte a = 3;
		byte b, c;
		String a_bits, b_bits, c_bits;

		//ini artinya kita ingin membuat string dengan suatu format tertentu(dgn kelas helper nya string)
		//Integer.toBinaryString(a) ini untuk memindahkan byte ke string

		//operator SIFT LEFT
		System.out.println("==== SIFT LEFT (<<) ====");//"y%8s" artinya menambahkan 8 angka 
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.println(a_bits + " = " + a);
		b = (byte) (a << 3); //ini artinya di geser satu byte
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
		System.out.println(b_bits + " = " + b);

		//operator SIFT RIGHT
		System.out.println();
		System.out.println("==== SIFT RIGHT (>>) ====");
		a = 24;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.println(a_bits + " = " + a);
		b = (byte) (a >> 2); //ini artinya di geser satu byte
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
		System.out.println(b_bits + " = " + b);

		//operator bitwise OR
		System.out.println();
		System.out.println("==== BITWISE OR (|) ====");
		a = 24;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.println(a_bits + " = " + a);
		b = 12;
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
		System.out.println(b_bits + " = " + b);

		System.out.println("---------------->OR");
		c = (byte) (a | b);
		c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
		System.out.println(c_bits + " = " + c);

		//operator bitwise AND
		System.out.println();
		System.out.println("==== BITWISE AND (&) ====");
		a = 24;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.println(a_bits + " = " + a);
		b = 12;
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
		System.out.println(b_bits + " = " + b);

		System.out.println("---------------->AND");
		c = (byte) (a & b);
		c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
		System.out.println(c_bits + " = " + c);

		//operator bitwise XOR
		System.out.println();
		System.out.println("==== BITWISE XOR (^) ====");
		a = 24;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.println(a_bits + " = " + a);
		b = 12;
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
		System.out.println(b_bits + " = " + b);

		System.out.println("---------------->XOR");
		c = (byte) (a ^ b);
		c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
		System.out.println(c_bits + " = " + c);

		//operator Negasi / Not
		System.out.println();
		System.out.println("==== BITWISE NOT (~) ====");
		a = 24;
		b = (byte) (~a);
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.println(a_bits + " = " + a);
		b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
		System.out.println(b_bits + " = " + b);
	}

}
