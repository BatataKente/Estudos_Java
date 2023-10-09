package cursos.alura._3_polimorfismo.bytebank.herdado.contas.exception;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
