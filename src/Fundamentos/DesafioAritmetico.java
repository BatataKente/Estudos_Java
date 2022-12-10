package Fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		var a = Math.pow((((Math.pow((6*(3+2)), 2))/(3*2))-(Math.pow(((1-5)*(2-7)/2), 2))), 3)/Math.pow(10, 3);
		System.out.printf("Resultado -> %.0f", a);
	}
}