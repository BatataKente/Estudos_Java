package Fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		System.out.printf("Resultado -> %.0f", stepCalculate());
	}
	static double stepCalculate() {
		double step = 3 + 2; 
		step *= 6;
		step = Math.pow(step, 2);
		step /= (3*2);
		step -= Math.pow((1 - 5)*(2 - 7)/2, 2);
		step = Math.pow(step, 3);
		step /= Math.pow(10, 3);
		return step;
	}
}