package Fundamentos.Operators;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println("a = " + a);
		System.out.print(a + " + 1 = ");
		a++; 
		System.out.println(a);
		System.out.print(a + " - 1 = ");
		a--; 
		System.out.println(a);
		System.out.println("\nb = " + b);
		System.out.print(b + " + 1 = ");
		++b; 
		System.out.println(b);
		System.out.print(b + " - 1 = ");
		--b; 
		System.out.println(b);
		System.out.printf("\n%d == %d? %b\n", a, b, ++a == b--);
		System.out.printf("\n%d == %d? %b\n", a, b, a == b);
	}
}
