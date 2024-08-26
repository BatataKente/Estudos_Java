package cursos.alura._1_1_SOLID.heranca._1;

public class ManipuladorDeSaldo {

	private double saldo;

	public ManipuladorDeSaldo() {}

	public ManipuladorDeSaldo(final double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(final double valor) {
		this.saldo += valor;
	}
	
	public void sacar(final double valor) {
		if(valor > saldo) throw new IllegalArgumentException();
		saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void render(final double taxa) {
		saldo *= taxa;
	}
}
