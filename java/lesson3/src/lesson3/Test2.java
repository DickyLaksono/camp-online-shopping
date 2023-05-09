package lesson3;

public class Test2 {
	public static void main(String[] args) {
		int num1 =10;
		int num2 =20;
		
		System.out.println("num1 =" + num1);
		System.out.println("num2 =" + num2);
		
		int num3 = num1 + num2;
		System.out.println("num3 = " + num3);
		
		num1 = 40;
		num2 = 50;
		
		num3 = num1 + num2;
		
		System.out.println("num3 = " + num3);
		
		num1 = num1 + 10;
		
		System.out.println("num1 = " + num1);
	}
}
