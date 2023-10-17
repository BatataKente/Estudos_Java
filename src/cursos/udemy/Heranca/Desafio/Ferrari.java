package curso.Heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	private boolean turboLigado = false;
	private boolean arLigado;
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	public Ferrari() {
		super(315);
		setDelta(15);
	}
//	@Override void acelerar() {
//		super.acelerar();
//		super.acelerar();
//		super.acelerar();
//	}
	@Override public void ligarTurbo() {
		turboLigado = true;
	}
	@Override public void desligarTurbo() {
		turboLigado = false;
	}
	@Override public void ligarAr() {
		arLigado = true;
	}
	@Override public void desligarAr() {
		arLigado = false;
	}
	@Override
	public int getDelta() {
		if (turboLigado && !arLigado) {
			return 35;
		} else if (turboLigado && arLigado) {
			return 30;
		} else if (!turboLigado && !arLigado) {
			return 20;
		}
		return 15;
	}
}
