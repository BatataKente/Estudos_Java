package cursos.alura.polimorfismo.bytebank.herdado.funcionarios.autenticavel;

public interface Autenticavel {
	public abstract void setSenha(int senha);
	public abstract boolean autentica(int senha);
}
