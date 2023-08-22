package apresentacao._5_construtores_e_metodos;
import java.util.Date;

public class Pessoa {
	private String cpf;
	private String nome;
	private Date dataDeNascimento;
	private boolean sabeLer;
	
	Pessoa(String cpf, String nome, Date dataDeNascimento) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}
	Pessoa(String nome) {
		this.nome = nome;
	}
	Pessoa() {
		this.nome = "Não Identificado";
	}
	
	public String getSabeLer() {
		return sabeLer? "Sabe ler" : "Analfabeto";
	}
	public void setSabeLer(boolean sabeLer) {
		this.sabeLer = sabeLer;
	}
	public String toString() {
		if(cpf == null || dataDeNascimento == null) {
			return "nome: " + nome;
		}
		return (
				String.format(
						"cpf: %s\nnome: %s\ndata de nascimento: %s", 
						new Object[] {
								cpf,
								nome,
								dataDeNascimento.toLocaleString()
						}
				)
		);
	}
}
