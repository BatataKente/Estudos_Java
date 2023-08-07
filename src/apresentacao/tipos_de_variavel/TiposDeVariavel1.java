package apresentacao.tipos_de_variavel;

public class TiposDeVariavel1 {
	public static void main(String[] args) {
		Silva jose = new Jose();
		jose.seApresentar();
		System.out.println(Silva.sobrenome);
		System.out.println(
				String.format(
						"nome completo: %s %s", 
						new Object[]{jose.nome, jose.sobrenome}
				)
		);
	}
}
