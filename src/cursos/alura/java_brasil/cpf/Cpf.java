package cursos.alura.java_brasil.cpf;

import javax.naming.directory.InvalidAttributeValueException;

public class Cpf {
	
	private String value;
	
	public Cpf() {}
	
	public Cpf(final String value) {
		setValue(value);
	}
	
	public void assertValid(final String value) throws InvalidAttributeValueException {
		if(value.length() != 11) throw new InvalidAttributeValueException();
		int sum = 0;
		for (int i = 0; i < value.length() - 2; i++) {
			final String letter = value.substring(i, i + 1);
			try {
				int digit = Integer.parseInt(letter);
				final int mult = Math.abs(i - (value.length() - 1));
				sum += digit * mult;
			} catch (Exception e) {
				throw new InvalidAttributeValueException();
			}
		}
		if(!value.substring(value.length() - 2, value.length() - 1).equals(String.valueOf((sum*10)%11))) throw new InvalidAttributeValueException();
		sum = 0;
		for (int i = 0; i < value.length() - 1; i++) {
			final String letter = value.substring(i, i + 1);
			try {
				int digit = Integer.parseInt(letter);
				final int mult = Math.abs(i - (value.length()));
				sum += digit * mult;
			} catch (Exception e) {
				throw new InvalidAttributeValueException();
			}
		}
		if(!value.substring(value.length() - 1, value.length()).equals(String.valueOf((sum*10)%11))) throw new InvalidAttributeValueException();
	}
	
	public void setValue(final String value) {
		try {
			assertValid(value);
			this.value = value;
		} catch (Exception e) {
			return;
		}
	}
	
	public boolean isValid() {
		return value != null;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getControle() {
		return value.substring(value.length() - 2);
	}
}
