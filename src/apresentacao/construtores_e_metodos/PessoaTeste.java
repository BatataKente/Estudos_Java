package apresentacao.construtores_e_metodos;
import java.util.Date;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[] {
				new Pessoa("Carlos Alberto"),
				new Pessoa("Márcos Rodolfo"),
				new Pessoa("999.999.999-99", "Reginalda Maria", new Date())
		};
		for(int i = 0; i < pessoas.length; i++) {
			Pessoa pessoa = pessoas[i];
			System.out.println(pessoa + "\n");
		}
	}
}
