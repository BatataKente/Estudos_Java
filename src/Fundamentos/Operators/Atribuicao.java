package Fundamentos.Operators;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 2;
		int b = a;
		int c = a + b;
		System.out.print(c + " + " + b);
		c += b; // c = c + b;
		System.out.println(" = " + c);
		System.out.print(c + " - " + a);
		c -= a; // c = c - a;
		System.out.println(" = " + c);
		System.out.print(c + " * " + b);
		c *= b; // c = c * b;
		System.out.println(" = " + c);
		System.out.print(c + " / " + a);
		c /= a; // c = c / a;
		System.out.println(" = " + c);
		System.out.print(c + " % " + 2);
		c %= 2; // c = c % 2;
		System.out.println(" = " + c);
		System.out.print(c + " + " + 1);
		c ++; // c = c + 1;
		System.out.println(" = " + c);
	}
}
