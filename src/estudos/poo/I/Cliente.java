package estudos.poo.I;

import java.util.function.Supplier;

public class Cliente {
	String nome; 
	String rg; 
	int idade;
	Supplier<String> getStatus = () -> "Name: " + nome + "\nRg: " + rg + "\nage: " + idade;
//	String getStatus() {
//		return "Name: " + nome + "\nRg: " + rg + "\nage: " + idade;
//	}
}
