package Fundamentos.Operators;

public class Aritmeticos {
	public static void main(String[] args) {
		var x = 34.56;
		double y = 2.2;
		System.out.printf("%.2f + %.2f = %.2f\n", x, y, x + y);
		System.out.printf("%.2f - %.2f = %.2f\n", x, y, x - y);
		System.out.printf("%.2f * %.2f = %.2f\n", x, y, x * y);
		System.out.printf("%.2f / %.2f = %.2f\n", x, y, x / y);
		int a = 10, b = 3;
		System.out.printf("\n%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.print( a + " / " + b + " = " + (a / (double)b) + "(convertendo pra double)\n");
		System.out.printf("%d / %d = %f(convertendo pra float)\n", a, b, a / (float)b);
		System.out.printf("%d / %d = %d(resto da divisão)\n", a, b, a % b);
		System.out.printf("%d / %d = %d(resto da divisão)\n", 8, 3, 8 % 3);
		System.out.printf("%.1f + %.1f - %d * %d = %.2f\n", x, y,  a, b, x + y - a * b);
	}
}
