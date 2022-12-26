package Classe.Objetos;

public class Circulo {
	final static double PI = Math.PI;
	final double raio;
	Circulo(double raio) {
		this.raio = raio;
	}
	double area() {
		return Math.pow(raio, 2)*PI;
	}
	static double area(double raio) {
		return Math.pow(raio, 2)*PI;
	}
}
