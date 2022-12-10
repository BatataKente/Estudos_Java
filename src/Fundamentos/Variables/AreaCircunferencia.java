package Fundamentos.Variables;

public class AreaCircunferencia {
	public static void main(String[] args) {
		System.out.print("Area = " + areaDaCircunferencia(3.4) + "\n");
		System.out.print("Area = " + areaDaCircunferencia(10));
	}
	static double areaDaCircunferencia(double raio) {
		final double PI = 3.14159;
		return PI*raio*raio;
	}
}
 