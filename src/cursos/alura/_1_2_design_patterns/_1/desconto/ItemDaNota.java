package cursos.alura._1_2_design_patterns._1.desconto;

public class ItemDaNota {

	private final String nome;
	private final double valor;
	
	public ItemDaNota(String nome, double valor) {
		super();
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
