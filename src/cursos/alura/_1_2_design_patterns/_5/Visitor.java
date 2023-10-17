package cursos.alura._1_2_design_patterns._5;

public interface Visitor {
	public void visitSoma(Soma soma);
	public void visitSubtracao(Subtracao subtracao);
	public void visitMultiplicacao(Multiplicacao multiplicacao);
	public void visitDivisao(Divisao divisao);
	public void visitRaiz(Raiz raiz);
	public void visitNumero(Numero numero);
}
