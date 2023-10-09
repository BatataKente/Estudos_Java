package cursos.alura._1_0_.oo.banco.models;

public class CNPJ {
	
	private final String value;
	
	public CNPJ(final String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public boolean hasValidCnpj() {
		return (
				primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
				&& segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj()
		);
	}

	private int primeiroDigitoCorretoParaCnpj() {
		return 0;
	}

	private int primeiroDigitoVerificadorDoCnpj() {
		return 0;
	}

	private int segundoDigitoCorretoParaCnpj() {
		return 0;
	}

	private int segundoDigitoVerificadorDoCnpj() {
		return 0;
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
		if(!(obj instanceof CNPJ)) return false;
		CNPJ cnpj = (CNPJ) obj;
		return getValue().equals(cnpj.getValue());
	}
}
