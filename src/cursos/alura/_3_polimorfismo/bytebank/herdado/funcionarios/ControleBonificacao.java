package cursos.alura._3_polimorfismo.bytebank.herdado.funcionarios;

import cursos.alura._3_polimorfismo.bytebank.herdado.funcionarios.funcionario.Funcionario;


public class ControleBonificacao {
	private double soma;
	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.soma += bonificacao;
	}
	public double getSoma() {
		return soma;
	}
}
