package curso.I;

import java.util.function.Supplier;

public class Aula_4_Cliente {
	String nome; 
	String rg; 
	int idade;
	Supplier<String> status = () -> "Name: " + nome + "; Rg: " + rg + "; age: " + idade;
//	String getStatus() {
//		return "Name: " + nome + "\nRg: " + rg + "\nage: " + idade;
//	}
}
