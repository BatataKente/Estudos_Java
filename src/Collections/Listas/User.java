package Collections.Listas;

import java.util.Objects;

public class User {
	String nome;
	public User(String nome) {
		this.nome = nome;
	}
	@Override public String toString() {
//		return super.toString();
		return "meu nome é " + nome + ".";
	}
	@Override public int hashCode() {
		return Objects.hash(nome);
	}
	@Override public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		User other = (User) obj;
		return Objects.equals(nome, other.nome);
	}
}
