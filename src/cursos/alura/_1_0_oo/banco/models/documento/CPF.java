package cursos.alura._1_0_oo.banco.models.documento;

public class CPF implements Documento {
	
	private final String value;
	
	public CPF(final String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return getValue();
	}
	
	@Override
	public int hashCode() {
		return getValue().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CPF)) return false;
		CPF cnpj = (CPF) obj;
		return getValue().equals(cnpj.getValue());
	}
}
