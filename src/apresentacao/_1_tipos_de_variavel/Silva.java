package apresentacao._1_tipos_de_variavel;

public abstract class Silva {
	static String sobrenome = "Silva";//Variável estática
	String nome;//Variável de instância (objeto)
	public Silva(String nome) {
		this.nome = nome;
	}
	protected void seApresentar() {
		String apresentacao = "Olá, meu nome é " + nome;//	Variável local
		System.out.println(apresentacao);
	}
}
