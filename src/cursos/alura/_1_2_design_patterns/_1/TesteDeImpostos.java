package cursos.alura._1_2_design_patterns._1;

import cursos.alura._1_2_design_patterns._1.imposto.*;

public class TesteDeImpostos {
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(4000.0); 
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		
		calculadorDeImposto.realizarCalculo(orcamento, iss);
		calculadorDeImposto.realizarCalculo(orcamento, icms);
		calculadorDeImposto.realizarCalculo(orcamento, iccc);
	}
}
