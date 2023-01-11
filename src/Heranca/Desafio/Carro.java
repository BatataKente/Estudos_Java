package Heranca.Desafio;

public class Carro {
	private final int VELOCIDADE_MAXIMA;
	private int velocidade = 0;
	protected int delta = 5;
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	public void acelerar() {
		if (velocidade + delta > VELOCIDADE_MAXIMA) {return;}
		velocidade += delta;
	}
	public void freiar() {
		if (velocidade > 0) {
			velocidade -= delta;
		}
	}
	public String status() {
		return "Velocidade: " + velocidade;
	}
}
