package cursos.alura._1_1_SOLID.acoplamento._2;

public class Teste {
	public static void main(String[] args) {

        TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
        Frete correios = new Frete();
		
        CalculadoraDePrecos calculadoraDePrecos = new CalculadoraDePrecos(tabela, correios);
	}
}
