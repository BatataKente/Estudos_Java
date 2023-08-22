class A {
	public static void main(String[] args) {
		System.out.println(baskara(2, 5, 2));
	}

	private static String baskara(double a, double b, double c) {
		double delta = (b*b) - (4*a*c);
		if(delta < 0) return "delta negativo não foi possível efetuar cálculo.";
		double x_1 = ((-b) + (Math.pow(delta, 0.5)))/(2*a);
		double x_2 = ((-b) - (Math.pow(delta, 0.5)))/(2*a);
		return String.format("O valor de x' é %.2f e o valor de x'' é %.2f.", x_1, x_2);
	}
} 