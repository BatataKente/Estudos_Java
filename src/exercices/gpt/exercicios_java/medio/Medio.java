package exercices.gpt.exercicios_java.medio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.spec.EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Medio {
	public static void main(String[] args) {
		_15();
	}
	
//	### Nível Médio (15 exercícios)
//	1. **Ordenação de Números**: Implemente o algoritmo de ordenação Bubble Sort.
	public static int[] bubble_sort(int[] numeros) {
		int length = numeros.length;
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < length - 1 - i; j++) {
				final int a = numeros[j];
				final int b = numeros[j + 1];
				if(a >  b) {
					numeros[j] = b;
					numeros[j + 1] = a;
				}
			}
		}
		return numeros;
	}
	public static void _1() {
		System.out.println(Arrays.toString(bubble_sort(new int[] {76,2,63,4,1,6, 0})));
	}
//	2. **Palíndromo**: Verifique se uma palavra é um palíndromo.
	public static boolean isPalindromo(String palavra) {
		return new StringBuilder(palavra).reverse().toString().equalsIgnoreCase(palavra);
	}
	public static void _2() {
		Arrays.asList(
			"osso", "palavra", "reviver", "Palidromo", "teste", "Ovo"
		).forEach(palavra -> {
			System.out.println(palavra + (isPalindromo(palavra)? " é um palídromo." : " não é um palindromo."));
		});
	}
//	3. **Fibonacci**: Gere a sequência de Fibonacci até o enésimo número.
	public static int[] fibonacci(int length) {
        if (length <= 0) {
            return new int[0];
        }
		final int[] sequence = new int[length];
        sequence[0] = 0;
        if (length > 1) {
            sequence[1] = 1;
        }
        for (int i = 2; i < length; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
		return sequence;
	}
	public static void _3() {
		System.out.println(Arrays.toString(fibonacci(15)));
	}
//	4. **Cálculo de Potência**: Calcule a potência de um número sem usar bibliotecas.
	public static double pow(double a, double b) {
		if(b == 0) {
			return 1;
		}
		double result = a;
		double limit = b;
		if(limit < 0) {
			limit *= -1;
		}
		for(int i = 0; i < (limit - 1); i++) {
			result *= a;
		}
        return (b < 0) ? 1 / result : result;
	}
	public static void _4() {
		System.out.println(pow(2, 0));
	}
//	5. **Conversor de Moeda**: Crie um programa para converter entre diferentes moedas.
	public static Map<String, String> convertMoney(double value, String moedas) {
		Map<String, String> result = new HashMap<String, String>();
		List<String> fields = Arrays.asList("low", "high", "name");
        try {
        	HttpURLConnection httpURLConnection = (
					(HttpURLConnection) new URL("https://economia.awesomeapi.com.br/last/" + moedas).openConnection()
			);
			httpURLConnection.setRequestMethod("GET");
			try(
				InputStream inputStream = httpURLConnection.getInputStream();
				InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			) {
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				String line;
				StringBuilder response = new StringBuilder();
				while((line = bufferedReader.readLine()) != null) {
					response.append(line);
				}
				String[] splittedResponse = response.toString().split("\"");
				for(int i = 0; i < splittedResponse.length; i++) {
					String splittant = splittedResponse[i];
					for(int j = 0; j < fields.size(); j++) {
						String field = fields.get(j);
						if(splittant.contains(field)) {
							result.put(field,  splittedResponse[i + 2]);
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	public static void _5() {
		List<String> moedas = Arrays.asList("USD-BRL", "BRL-USD", "EUR-BRL", "BTC-BRL");
		System.out.println(convertMoney(1, moedas.get(0)).get("high"));
	}
//	6. **Anagrama**: Verifique se duas strings são anagramas.
	public static boolean isAnagrama(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        return Arrays.equals(arrayA, arrayB);
	}
	public static void _6() {
		System.out.println(isAnagrama("amor", "roma"));
	}
//	7. **Matriz de Identidade**: Gere uma matriz de identidade de ordem n.
	public static int[][] getIdentityMatrix(int size) {
		int[][] rows = new int[size][size];
		for(int row_index = 0; row_index < rows.length; row_index++) {
			for(int column_index = 0; column_index < rows.length; column_index++) {
				rows[row_index][column_index] = row_index == column_index? 1 : 0;
			}
		}
		return rows;
	}
	public static void _7() {
		int[][] identityMatrix = getIdentityMatrix(5);
		for(int row_index = 0; row_index < identityMatrix.length; row_index++) {
			for(int column_index = 0; column_index < identityMatrix.length; column_index++) {
				System.out.print(identityMatrix[row_index][column_index] + " ");
			}
			System.out.println();
		}
	}
//	8. **Números Perfeitos**: Verifique se um número é perfeito.
	public static List<Integer> divisorsOf(int number) {
		List<Integer> divisors = new ArrayList<Integer>();
		for(int i = 1; i < number; i++) {
			if(number % i ==  0) {
				divisors.add(i);
			}
		}
		return divisors;
	}
	public static boolean isPerfect(int number) {
		return (
				divisorsOf(number).stream().reduce(0, (a, b) -> {
					return a + b;
				}) == number
		);
	}
	public static void _8() {
        System.out.println(isPerfect(28));  // true
        System.out.println(isPerfect(6));   // true
        System.out.println(isPerfect(12));  // false
	}
//	9. **Contagem de Palavras**: Conte o número de palavras em uma frase.
	public static int numberOfWordsOf(String phrase) {
		return phrase.trim().split("\\s+").length;
	}
	public static void _9() {
		System.out.println(numberOfWordsOf("Conte o número de palavras em uma frase."));
	}
//	10. **Remoção de Duplicados**: Remova os elementos duplicados de um array.
    public static List<String> removeDuplicatesOf(List<String> list) {
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
    public static void _10() {
        String[] array = new String[] {"a", "e", "i", "o", "u", "u", "u"};
        System.out.println(removeDuplicatesOf(Arrays.asList(array)));
    }
//	11. **Sistema de Notas**: Implemente um sistema de notas que classifique as notas em conceitos.
    public static String classificarNota(double nota) {
        if (nota >= 90 && nota <= 100) {
            return "A";
        } else if (nota >= 80 && nota < 90) {
            return "B";
        } else if (nota >= 70 && nota < 80) {
            return "C";
        } else if (nota >= 60 && nota < 70) {
            return "D";
        } else if (nota >= 0 && nota < 60) {
            return "F";
        } else {
            return "Nota inválida";
        }
    }
    public static void _11() {
    	System.out.println(classificarNota(91));
	}
//	12. **Números de Armstrong**: Verifique se um número é um número de Armstrong.
    public static boolean isArmstrong(int fullNumber) {
    	String fullNumberAsString = String.valueOf(fullNumber);
    	int result = 0;
		for(int i = 0; i < fullNumberAsString.length(); i++) {
			int number = Integer.valueOf(String.valueOf(fullNumberAsString.charAt(i)));
			result += Math.pow(number, fullNumberAsString.length());
		}
		return fullNumber == result;
	}
    public static void _12() {
		System.out.println(isArmstrong(123));
		System.out.println(isArmstrong(453));
		System.out.println(isArmstrong(370));
		System.out.println(isArmstrong(153));
	}
//	13. **Conversão de Base**: Converta um número decimal para binário.
    public static void _13() {
		System.out.println(Integer.toBinaryString(174));
		System.out.println(Integer.toBinaryString(13));
		System.out.println(Integer.toBinaryString(0));
	}
//	14. **Busca Linear**: Implemente o algoritmo de busca linear em um array.
    public static Integer find(int a, int[] inArray) {
    	for(int i = 0; i < inArray.length; i++) {
    		int number = inArray[i];
    		if(number == a) {
    			return number;
    		}
    	}
    	return null;
    }
    public static void _14() {
		System.out.println(find(2, new int[] {1,2,3,4,5,6,7,8,9,10}));
	}
//	15. **Jogo da Forca**: Crie um simples jogo da forca.
	public static String get(String url) {
		StringBuilder response = null;
        try {
        	HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
			httpURLConnection.setRequestMethod("GET");
			try(
				InputStream inputStream = httpURLConnection.getInputStream();
				InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			) {
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				String line;
				response = new StringBuilder();
				while((line = bufferedReader.readLine()) != null) {
					response.append(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response.toString();
	}
	public static String getPhrase() {
		return get("https://phrase-api.vercel.app/api/list/random").split("\"")[5];
	}
	public static String getWord(int difficult, String[] phrase) {
		String selected_word = null;
		for(int i = 0; i < phrase.length; i++) {
			String current_word = phrase[i];
			if(current_word.length() > difficult) {
				selected_word = current_word;
				break;
			}
		}
		return selected_word;
	}
    public static void _15() {
    	String phrase = getPhrase();
		final String word = getWord(2, phrase.split(" "));
		phrase = phrase.replace(word, "_");
		System.out.println("Jogo da forca.");
		final Character[] word_encontradas = new Character[word.length()];
    	try(Scanner scanner = new Scanner(System.in)) {
			while(true) {
				System.out.println("\n\nFrase sem a palavra: " + phrase);
				for (int i = 0; i < word_encontradas.length; i++) {
					Character character = word_encontradas[i];
					if(character == null) {
						System.out.print("_ ");
						continue;
					}
					System.out.print(character + " ");
				}
    			System.out.print("\n\nEscolha uma letra: ");
    			String letra = scanner.nextLine();
    			if(letra.equals("")) {
        			System.out.print("Para prosseguir voce deve digitar alguma letra.");
        			continue;
    			}
    			boolean acertou = false;
				for(int i = 0; i < word.length(); i++) {
					char current_character = word.charAt(i);
					if(letra.equalsIgnoreCase(String.valueOf(current_character))) {
						word_encontradas[i] = current_character;
						acertou = true;
						break;
					}
				}
				if(!Arrays.asList(word_encontradas).stream().anyMatch(character -> {return character == null;})) {
					System.out.println("Parabens você descobriu a palavra e ganhou o jogo!");
					break;
				}
				System.out.println("Você " + (acertou? "acertou!" : "errou!"));
			}
    	}
	}
}
