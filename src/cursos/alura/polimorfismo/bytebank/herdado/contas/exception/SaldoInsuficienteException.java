package cursos.alura.polimorfismo.bytebank.herdado.contas.exception;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
