package Heranca.Desafio;

public class Ferrari extends Carro {
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	public Ferrari() {
		super(315);
		delta = 15;
	}
//	@Override void acelerar() {
//		super.acelerar();
//		super.acelerar();
//		super.acelerar();
//	}
}
