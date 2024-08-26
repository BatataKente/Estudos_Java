package cursos.alura._1_2_design_patterns._5;

public class Programa {
	public static void main(String[] args) {
		test_1();
	}
	
	private static void test_2() {
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
//		(5 + 7) - 5 = 12 - 5 = 7
		Expressao direita = new Soma(new Numero(2), new Numero(10));
//		2 + 10 = 12
		Expressao soma = new Soma(esquerda, direita);
//		((5 + 7) - 5) + (2 + 10) = 19
		final int resultado = soma.resolver();
		
//		System.out.println(resultado);
		
		OperacaoVisitor visitor = new OperacaoVisitor();
		soma.accept(visitor);
	}
	
	private static void test_1() {
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
//		(5 + 7) - 5 = 12 - 5 = 7
		Expressao direita = new Soma(new Numero(2), new Numero(10));
//		2 + 10 = 12
		Expressao soma = new Soma(esquerda, direita);
//		((5 + 7) - 5) + (2 + 10) = 19
		Expressao multiplicacao = new Multiplicacao(soma, new Numero(4));
//		19 * 4 = 76
		Expressao divisao = new Divisao(multiplicacao, new Numero(2));
//		76 / 2 = 38
		Expressao raiz = new Raiz(new Subtracao(divisao, new Numero(13)));
//		(38 - 13)^0,5 = 5
		final int resultado = raiz.resolver();

		OperacaoVisitor visitor = new OperacaoVisitor();
		raiz.accept(visitor);
		System.out.print(" = " + resultado);
	}
}
