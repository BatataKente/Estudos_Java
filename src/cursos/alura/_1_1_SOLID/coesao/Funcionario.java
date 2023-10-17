package cursos.alura._1_1_SOLID.coesao;

public abstract class Funcionario {
	private Cargo cargo;
	private String nome;
	private String cpf;
	private double salario;

	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public double getSalarioCalculadoComRegra() {
		return getCargo().getRegraDeCalculo().calcula(this);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}
}
