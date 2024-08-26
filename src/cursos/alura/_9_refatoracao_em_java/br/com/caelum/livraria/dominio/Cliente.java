package cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio;

public class Cliente {
	
	private final String id;
	private final String cep;

	private final String ddd;
	private final String numero;
	
	public Cliente(
			final String id, 
			final String ddd, 
			final String numero, 
			final String cep
	) {
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
		this.cep = cep;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;
		if(obj instanceof Cliente) {
			Cliente outra = (Cliente) obj;
			iguais = id.equals(outra.id);
		}
		return iguais;
	}

	public String getTelefone() {
		return String.format("(%s) %s", ddd, numero);
	}
	
	public String getCep() {
		return cep;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
