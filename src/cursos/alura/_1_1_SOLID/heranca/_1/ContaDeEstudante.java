package cursos.alura._1_1_SOLID.heranca._1;

public class ContaDeEstudante extends ContaComum {

	private final ManipuladorDeSaldo manipuladorDeSaldo;
	private int milhas;
	
	public ContaDeEstudante() {
		this.manipuladorDeSaldo = new ManipuladorDeSaldo();
	}
	
	@Override
	public void depositar(final double valor) {
		manipuladorDeSaldo.depositar(valor);
		milhas += (int) valor;
	}
	
	public int getMilhas() {
		return milhas;
	}
}