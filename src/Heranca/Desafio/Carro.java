package Heranca.Desafio;

public class Carro {
	int velocidade = 0;
	void acelerar() {
		velocidade += 5;
	}
	void freiar() {
		if (velocidade > 0) {
			velocidade -= 5;
		}
	}
	String status() {
		return "Velocidade: " + velocidade;
	}
}
