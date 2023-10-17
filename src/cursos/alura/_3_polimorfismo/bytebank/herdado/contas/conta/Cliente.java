package cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta;

/**
 * Classe representa o cliente no bytebank
 * @author djunqueira
 * @version 0.1
 */
public class Cliente {
	private String nome, profissao, cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
