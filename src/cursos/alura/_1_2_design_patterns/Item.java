package cursos.alura._1_2_design_patterns;

public class Item {
	
	private String nome;
	private double valor;

	public Item(final String nome, final double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
}
