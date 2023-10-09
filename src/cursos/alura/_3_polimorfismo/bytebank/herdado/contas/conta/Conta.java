package cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta;

import cursos.alura._3_polimorfismo.bytebank.herdado.contas.exception.SaldoInsuficienteException;

/**
 * Classe que representa uma conta
 * @author djunqueira
 */
public abstract class Conta implements Comparable<Conta> {
	
	private static int total;
	protected double saldo;
	private int agencia = 1, numero;
	private Cliente titular;
	/**
	 * Construtor para inicializar a conta
	 * @param agencia
	 * @param numero
	 */
	public Conta(final int agencia, final int numero) {
		this.setAgencia(agencia);
		this.setNumero(numero);
		total++;
	}
	public abstract void depositar(final double valor);
	/**
	 * Valor precisa ser maior que o saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void sacar(final double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) throw new SaldoInsuficienteException(
				String.format("Não tem saldo suficiente para poder sacar o valor: R$ %.2f", valor)
		);
		this.saldo -= valor; 
	}
	
	public void transferir(final double valor, final Conta recebedor) throws SaldoInsuficienteException {
		this.sacar(valor);
		recebedor.depositar(valor);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public static int getTotal() {
		return total;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if(numero < 0) return;
		this.numero = numero;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) return;
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public String toString() {
		return (
				this.getClass().getSimpleName() + ": Numero: " + getNumero() + ";" +
				" Agencia: " + getAgencia() + ";" +
				" Saldo da conta: " + 
				String.format(
						"%.2f", new Object[] {new Double(getSaldo())}
				)
		);
	}
	
	public int compareTo(Conta conta) {
		return Double.compare(getSaldo(), conta.getSaldo());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) return false;
		Conta conta = (Conta) obj;
		return (
				getAgencia() == conta.getAgencia() &&
				getNumero() == conta.getNumero()
		);
	}
}