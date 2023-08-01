package curso.Fundamentos.Variables;

public class TipoString {
	public static void main(String[] args) {
		System.out.print("Olá Josicleison".charAt(2) + "\n\n");
		final String phrase = "Boa tarde";
		System.out.print(phrase.concat("!!!"));
		System.out.print("\n" + phrase + "\n\n");
		System.out.println("Começa com a palavra boa? " + phrase.toLowerCase().startsWith("boa"));
		System.out.println("Quantos caracteres tem a frase? " + phrase.length());
		System.out.print("Termina com a palavra tarde? " + phrase.endsWith("tarde") + "\n");
		System.out.print("A frase é \"Boa tarde\"? " + phrase.equals("Boa tarde") + "\n");
		System.out.println(
				"Desconsiderando letras maiúsculas ou minúsculas.\n" + 
				"A frase é igual \"boa tarde\"? " + 
				phrase.equalsIgnoreCase("boa tarde") + "\n"
		);
		final var nome = "Josicleison";
		final var sobreNome = "Elves";
		final var idade = 33;
		final var salario = 1000.0F;
		String otraFrase = 
				"Nome completo: " + nome +
				" " + sobreNome +
				"\nIdade: " + idade + 
				"\nSalário: " + salario
		;
//		System.out.print(
//				"Nome completo: " + nome + 
//		        " " + sobreNome +
//				"\nIdade: " + idade + 
//				"\nSalário: " + salario
//		);
		System.out.printf(
				"Nome completo: %s %s\nIdade: %d\nSalário: R$ %.2f\n\n", nome, sobreNome, idade, salario
		);
		System.out.println(otraFrase.contains("Lero Lero"));
	}
}
