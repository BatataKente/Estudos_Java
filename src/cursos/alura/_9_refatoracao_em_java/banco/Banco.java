package cursos.alura._9_refatoracao_em_java.banco;


public class Banco {
	
	public void depositar(Conta conta, double valor) {
		conta.depositar(valor);
	}
	
	public void realizarTransferencia(Conta pagador, double valor, Conta recebedor) {
		pagador.sacar(valor);
		recebedor.depositar(valor);
	}
}
