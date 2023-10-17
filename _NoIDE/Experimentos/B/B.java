class Pair {
	final double x_1;
	final double x_2;
	Pair(double x_1, double x_2) {
		this.x_1 = x_1;
		this.x_2 = x_2;
	}
	public String toString() {
		return String.format("x': %.2f\nx'': %.2f", x_1, x_2);
	}
} 
class B {
	public static void main(String[] args) {
		Pair calcule = baskara(2, 5, 2);
		//System.out.println(calcule);
		System.out.println(calcule.x_1);
		System.out.println(calcule.x_2);
	}
	private static Pair baskara(double a, double b, double c) {
		double delta = (b*b) - (4*a*c);
		if(delta < 0) return null;
		double x_1 = ((-b) + (Math.pow(delta, 0.5)))/(2*a);
		double x_2 = ((-b) - (Math.pow(delta, 0.5)))/(2*a);
		return new Pair(x_1, x_2);
	}
} 