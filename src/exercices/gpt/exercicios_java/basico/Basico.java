package exercices.gpt.exercicios_java.basico;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Basico {
	public static void main(String[] args) {
		_15();
	}
	
//	### Nível Básico (15 exercícios)
//	1. **Hello World**: Escreva um programa que exiba "Hello World" no console.
	public static void _1() {
		System.out.println("Hello World");
	}
//	2. **Soma de Dois Números**: Crie um programa que some dois números fornecidos pelo usuário.
	public static void _2() {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("*Programa Somador A + B*\nInforme os valores de A e B para a soma\nDigite o valor de A: ");
			int a = scanner.nextInt();
			System.out.print("\nDigite o valor de B: ");
			int b = scanner.nextInt();
			System.out.println("\nO resultado da soma dos valores é: " + (a + b));
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Por favor, digite números inteiros.");
		}
	}
//	3. **Par ou Ímpar**: Verifique se um número é par ou ímpar.
	public static boolean is_odd(int number) {
		return number % 2 != 0;
	}
	public static void _3() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i + " é " + (is_odd(i)? "impar" : "par"));
		}
	}
//	4. **Maior de Dois Números**: Determine o maior de dois números.
	public static void _4() {
		System.out.println(Math.max(2, 6));
	}
//	5. **Conversão de Temperatura**: Converta uma temperatura de Celsius para Fahrenheit.
	public static double toFahrenheit(double celcius) {
		return ((9*celcius)/5) + 32;
	}
	public static double toCelsius(double fahrenheit) {
		return 5*((fahrenheit - 32)/9);
	}
	public static void _5() {
		double farenheit = toFahrenheit(20);
		System.out.println(farenheit);
		double celcius = toCelsius(farenheit);
		System.out.println(celcius);
	}
//	6. **Fatorial de um Número**: Calcule o fatorial de um número dado.
	public static BigDecimal fatorial(int number) {
		if(number == 0 || number == 1) {
			return new BigDecimal(1);
		}
		BigDecimal result = new BigDecimal(number);
		for(int i = (number - 1); i > 0; i--) {
			result = result.multiply(new BigDecimal(i));
		}
		return result;
	}
	public static void _6() {
		for(int i = 0; i < 100; i++) {
			System.out.println("O fatorial de " + i + " é " + fatorial(i));
		} 
	}
//	7. **Contagem Regressiva**: Implemente uma contagem regressiva de 10 a 0.
	public static void _7() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
//	8. **Tabuada**: Exiba a tabuada de um número fornecido pelo usuário.
	public static void _8() {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um numero para a tabuada: ");
			int a = scanner.nextInt();
			System.out.println("Segue a tabuada de " + a + ":");
			for(int i = 1; i <= 10; i++) {
				System.out.printf("%d x %d = %d\n", a, i, (i*a));
			}
		} catch (InputMismatchException e) {
			System.out.println("Erro ao inputar valor.");
		}
	}
//	9. **Números Primos**: Verifique se um número é primo.
	public static boolean isPrimo(int number) {
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0 || number <= 1) {
            return false;
        }
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void _9() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i + (isPrimo(i)? " é primo" : " não é primo"));
		} 
	}
//	10. **Inversão de String**: Inverta uma string fornecida pelo usuário.
	public static void _10() {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite algo: ");
			StringBuilder algo = new StringBuilder(scanner.nextLine());
			System.out.println(algo.reverse());
		} 
	}
//	11. **Cálculo de Média**: Calcule a média de três números.
	public static double media(double a, double b, double c) {
		return (a + b + c)/3;
	}
	public static void _11() {
		System.out.println(media(2,2,2));
		System.out.println(media(1,2,3));
		System.out.println(media(2,7,40));
	}
//	12. **Contador de Vogais**: Conte o número de vogais em uma string.
	public static void _12() {
		String palavra = "tabcdee";
		Set<Character> vogais = Set.of('a', 'e', 'i', 'o', 'u');
		long result = palavra.chars().filter((letra) -> {return vogais.contains((char) letra);}).count();
		System.out.println(result);
	}
//	13. **Calculadora Simples**: Implemente uma calculadora básica (adição, subtração, multiplicação, divisão).
	public static void _13() {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Calculadora simples. Instruções:");
			System.out.println("primeiro informe o numero, depois digite + para somar, - subtrair, * multiplicar e / para dividir");
			System.out.println("Digite \"Sair\" para sair\nVamos começar..\n");
			BigDecimal a = new BigDecimal(0);
			while(true) {
				System.out.println(a);
				String operation = scanner.nextLine();
				if(operation.equalsIgnoreCase("sair")) {
					break;
				}
				BigDecimal b = new BigDecimal(scanner.nextLine());
				switch(operation) {
				case "+":
					a = a.add(b);
					break;
				case "-":
					a =a.subtract(b);
					break;
				case "*":
					a = a.multiply(b);
					break;
				case "/":
					a = a.divide(b);
					break;
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Erro ao inputar valor");
		}
	}
//	14. **Concatenação de Strings**: Concatene duas strings fornecidas pelo usuário.
	public static void _14() {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("Informe uma palavra: ");
			StringBuilder palavras = new StringBuilder(scanner.nextLine());
			System.out.print("Informe outra palavra: ");
			palavras.append(scanner.nextLine());
			System.out.println("Juntando as duas palavras temos " + palavras);
		}
	}
//	15. **Área de um Retângulo**: Calcule a área de um retângulo a partir da largura e altura fornecidas.
	public static double calculateTriangulo(double altura, double largura) {
		return (altura*largura)/2;
	}
	public static void _15() {
		System.out.println(calculateTriangulo(2, 2));
	}
}
