package curso.Polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		var ingrediente_1 = new Arroz(0.2);
		var ingrediente_2 = new Feijão(0.1);
		System.out.println(convidado.getPeso());
		convidado.comer(ingrediente_1);
		convidado.comer(ingrediente_2);
		System.out.println(convidado.getPeso());
		var ingrediente_3 = new Sorvete(0.4);
		convidado.comer(ingrediente_3);
		System.out.println(convidado.getPeso());
		Pessoa pessoa = new Pessoa(70.0);
		convidado.comer(pessoa); 
		System.out.println(convidado.getPeso());
	}
}
