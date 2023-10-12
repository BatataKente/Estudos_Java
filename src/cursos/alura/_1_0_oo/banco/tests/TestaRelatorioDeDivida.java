package cursos.alura._1_0_oo.banco.tests;

import cursos.alura._1_0_oo.banco.models.Divida;
import cursos.alura._1_0_oo.banco.models.Pagamento;
import cursos.alura._1_0_oo.banco.models.Pessoa;
import cursos.alura._1_0_oo.banco.models.RelatorioDeDivida;
import cursos.alura._1_0_oo.banco.models.documento.CNPJ;

public class TestaRelatorioDeDivida {
	public static void main(String[] args) {
		Divida divida = new Divida(
				new Pessoa("Josicleison", new CNPJ("00.000.001/0001-01")), 
				100
		);
		Pagamento pagamento = new Pagamento(
				new Pessoa("Josicleide", new CNPJ("00.000.002/0002-02")), 
				20
		);
		divida.registrar(pagamento);
		
		RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida);
		System.out.println(relatorioDeDivida.get());
	}
}
