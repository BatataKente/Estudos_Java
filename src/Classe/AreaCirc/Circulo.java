package Classe.AreaCirc;

public class Circulo {
	final static double PI = Math.PI;
	final double raio;
	Circulo(double raio) {
		this.raio = raio;
	}
	double area() {
		return Math.pow(raio, 2)*PI;
	}
}
