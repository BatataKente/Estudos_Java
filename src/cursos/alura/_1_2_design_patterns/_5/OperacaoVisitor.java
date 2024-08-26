package cursos.alura._1_2_design_patterns._5;

public class OperacaoVisitor implements Visitor {

	private void joinLeftRight(String operator, Operacao operacao) {
//		System.out.print("(");
//		operacao.getLeft().accept(this);
//		System.out.print(" " + operator + " ");
//		operacao.getRight().accept(this);
//		System.out.print(")");
		
		System.out.print("(");
		System.out.print(operator + " ");
		operacao.getLeft().accept(this);
		System.out.print(" ");
		operacao.getRight().accept(this);
		System.out.print(")");
	} 

	private void joinLeft(String operator, Operacao operacao) {
//		System.out.print("(");
//		operacao.getLeft().accept(this);
//		System.out.print(" " + operator);
//		System.out.print(")");
		
		System.out.print("(");
		System.out.print(operator + " ");
		operacao.getLeft().accept(this);
		System.out.print(")");
	} 
	
	public void visitSoma(Soma soma) {
		joinLeftRight("+", soma);
	}

	public void visitSubtracao(Subtracao subtracao) {
		joinLeftRight("-", subtracao);
	}

	@Override
	public void visitMultiplicacao(Multiplicacao multiplicacao) {
		joinLeftRight("*", multiplicacao);
	}

	@Override
	public void visitDivisao(Divisao divisao) {
		joinLeftRight("/", divisao);
	}

	@Override
	public void visitRaiz(Raiz raiz) {
//		joinLeft("^ 0.5", raiz);
		joinLeft("√", raiz);
	}

	public void visitNumero(Numero numero) {
		System.out.print(
				numero.getValue()
		);
	}
}
