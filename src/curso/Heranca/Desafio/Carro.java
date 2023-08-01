package curso.Heranca.Desafio;

public class Carro {
	private final int VELOCIDADE_MAXIMA;
	private int velocidade = 0;
	private int delta = 5;
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	public void acelerar() {
		if (velocidade + getDelta() > VELOCIDADE_MAXIMA) {return;}
		velocidade += getDelta();
	}
	public void freiar() {
		if (velocidade > 0) {
			velocidade -= delta;
			System.out.print("Lero Lero");
		}
	}
	public String status() {
		return "Velocidade: " + velocidade;
	}
	public int getDelta() {
		return delta;
	}
	public void setDelta(int delta) {
		this.delta = delta;
	}
}
