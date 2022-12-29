package Classe.EqualsHash;

import java.util.Objects;

public class User {
	String nome, email;
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	public boolean equals(Object obj) {
		if (this == obj || obj == null || getClass() != obj.getClass()) {
			return false;
		}
		User other = (User) obj;
		return Objects.equals(email, other.email) && 
					Objects.equals(nome, other.nome);
	}
//	public int hashCode() {
//	return nome.length() + email.length();
//}
//	public boolean equals(Object object) {
//		if (object instanceof User) {
//			var other = (User) object;
//			var nameIsEqual = other.nome.equals(nome);
//			var emmailIsEqual = other.email.equals(email);
//			return nameIsEqual && emmailIsEqual;
//		}
//		return false;
//	}
//	public boolean equals(User user) {
//		var other = (User) user;
//		var nameIsEqual = other.nome.equals(nome);
//		var emmailIsEqual = other.email.equals(email);
//		return nameIsEqual && emmailIsEqual;
//	}
}
