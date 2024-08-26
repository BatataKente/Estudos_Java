package cursos.alura._1_0_oo.empresa;

import cursos.alura._1_0_oo.empresa.colaborador.Colaborador;

public class PagadorDeFuncionario {

	public void pagaFuncionario(Colaborador funcionario) {
		funcionario.pagar(funcionario.getSalario() + funcionario.getBonus());
	}
}