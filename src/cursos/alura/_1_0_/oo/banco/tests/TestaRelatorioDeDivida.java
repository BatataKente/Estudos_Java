package cursos.alura._1_0_.oo.banco.tests;

import cursos.alura._1_0_.oo.banco.models.Divida;
import cursos.alura._1_0_.oo.banco.models.Pagamento;
import cursos.alura._1_0_.oo.banco.models.PessoaJuridica;
import cursos.alura._1_0_.oo.banco.models.RelatorioDeDivida;

public class TestaRelatorioDeDivida {
	public static void main(String[] args) {
		Divida divida = new Divida(new PessoaJuridica("Josicleison", "00.000.001/0001-01"), 100);
		
		Pagamento pagamento = new Pagamento(new PessoaJuridica("Josicleide", "00.000.002/0002-02"), 20);
		divida.registrar(pagamento);
		
		RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida);
		System.out.println(relatorioDeDivida.get());
	}
}
