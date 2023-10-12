package cursos.alura._1_1_SOLID.heranca._1;

public class ContaComum {

	private final ManipuladorDeSaldo manipuladorDeSaldo;
	
	public ContaComum() {
		this.manipuladorDeSaldo = new ManipuladorDeSaldo();
	}

	public void sacar(final double valor) {
		manipuladorDeSaldo.sacar(valor);
	}
	
	public void depositar(final double valor) {
		manipuladorDeSaldo.depositar(valor);
	}
	
	public void render() {
		manipuladorDeSaldo.render(1.1);
	}
	
	public double getSaldo() {
		return manipuladorDeSaldo.getSaldo();
	}
}
