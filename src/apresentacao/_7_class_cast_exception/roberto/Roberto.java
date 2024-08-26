package apresentacao._7_class_cast_exception.roberto;

public abstract class Roberto {
	protected String sobreNome/* = "Roberto"*/;
	protected String nome;
	Roberto(String nome) {
		this.sobreNome = "Roberto";
		this.nome = nome;
	}
	public String toString() {
		return String.format("Meu nome eh %s %s.", new Object[]{nome, sobreNome});
	}
}