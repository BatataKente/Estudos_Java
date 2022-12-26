package Classe.AreaCirc;

public class CirculoTeste {
	public static void main(String[] args) {
		final var circulo = new Circulo(5.6);
		System.out.println(circulo.area());
		final var circuloDois = new Circulo(10);
		System.out.print(circuloDois.area()); 
	} 
}
