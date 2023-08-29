package cursos.alura.polimorfismo.bytebank.herdado.funcionarios;

import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.funcionario.Funcionario;


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
