package cursos.alura._1_2_design_patterns._5;

public abstract class Operacao implements Expressao {
	
	private final Expressao left;      
	private final Expressao right;     
	
	public Operacao(
			final Expressao left,
			final Expressao right
	) {
		this.left = left;    
		this.right = right;  
	}
	
	public Operacao(
			final int left,
			final int right
	) {
		this.left = new Numero(left);    
		this.right = new Numero(right);  
	}
	
	public Expressao getLeft() {
		return left;
	}
	
	public Expressao getRight() {
		return right;
	}
}
