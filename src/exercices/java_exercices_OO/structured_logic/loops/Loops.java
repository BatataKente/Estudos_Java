package exercices.java_exercices_OO.structured_logic.loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        _4(input);
        input.close();
    }
//1) Fazer uma classe Ex1Primos para:
//            • Receber um inteiro N do usuário
//            • Testar se este inteiro é primo ou não e informar
    private static void _1() {
    	Ex1Primos ex1primos = new Ex1Primos(4);
        ex1primos.showNumberIsPrime();
        Ex1Primos.showNumberIsPrime(3);
        Ex1Primos.showPrimesAtInterval(0, 100);
    }
//2) Fazer uma classe Ex2Sorteio para:
//            • Sortear um número de 0 a 1000 (dica: usar Math.random())
//            • Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
//    menor do que o número sorteado.
//            • Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
//    quantas tentativas ele acertou.
    private static void _2(Scanner input) {
        int randomNumber = Ex2Sorteio.generateNumber(0, 1000);
        int numberOfAttempts = 1;
        do {
            System.out.println("Foi gerado um número aleatório de 0 a 1000, tente descobrir qual é.");
            System.out.print("Informe um número: ");
            try {
            	int number = Integer.parseInt(input.next());
                if(number == randomNumber) {
                    System.out.println("Voce acertou!!!");
                    System.out.print("E precisou de " + numberOfAttempts + "%d tentativas pra isso.");
                    break;
                }
                String numberIs = number > randomNumber? "maior" : "menor";
                System.out.println("Voce errou!! Esse número é " + numberIs + " que o número gerado.");
                numberOfAttempts++;
            } catch (Exception exception) {
                System.out.println("Voce informou um valor inválido.");
            }
        } while(true);
    }
//3) Fazer um programa para receber dois números do tipo int do usuário e
//    determinar se um número é permutação do outro ou não. Ex: 431 é permutação
//    de 143, 42 é permutação de 204, 1211 é permutação de 1112, etc. O programa
//    só deve aceitar números positivos.
    private static void _3(Scanner input) {
        do {
            System.out.print("Informe o primeiro número: ");
            String text_1 = input.next();
            System.out.print("Informe o segundo número: ");
            String text_2 = input.next();
            try {
                Integer.parseInt(text_1);
                Integer.parseInt(text_2);
                String firstPermutesSecond = "";
                String secondPermutesFirst = "";

                final char[] text_1CharArray = text_1.toCharArray();
                for (int i = 0; i < text_1CharArray.length; i++) {
                	final char character = text_1CharArray[i];
                    if(!text_2.contains(String.valueOf(character))) {
                        firstPermutesSecond = " não"; break;
                    }
                }
                final char[] text_2CharArray = text_2.toCharArray();
                for (int i = 0; i < text_2CharArray.length; i++) {
                	final char character = text_2CharArray[i];
                    if(!text_1.contains(String.valueOf(character))) {
                        secondPermutesFirst = " não"; break;
                    }
                }
                System.out.println("O primeiro número" + firstPermutesSecond + " permuta do segundo.");
                System.out.println("O segundo número" + secondPermutesFirst + " permuta do primeiro.");
                System.out.print("Deseja continuar?(S/N) ");
                if(input.next().equalsIgnoreCase("n")) {
                    break;
                }
            } catch(Exception exception) {
                System.out.println("Voce informou algum valor inválido.");
            }
        } while(true);
    }
//4) Fazer um programa para medir os reflexos do usuário. O programa deve:
//            • Mostrar a palavra “Agora!” após um tempo aleatório e um número,
//    também aleatório
//            • Contar o tempo até que o usuário digite o número pedido e mostrar esse
//    tempo.
//            • Dicas: usar o método getTimeInMillis da classe Calendar ou o método
//    nanoTime da classe System.
    static void _4(Scanner input) {
        System.out.println("Bem-vindo ao teste de reflexos!");
        System.out.println("Pressione Enter quando estiver pronto...");
        input.nextLine();
        try {
            Thread.sleep(Ex2Sorteio.generateNumber(0, 5000));
            System.out.println("Agora!");
            int a = Ex2Sorteio.generateNumber(0, 10);
            int b = Ex2Sorteio.generateNumber(0, 10);
            System.out.print("Quanto é " + a + " vezes " + b + "? ");
            long askTime = System.currentTimeMillis();
            int response = Integer.parseInt(input.next());
            float responseTime = System.currentTimeMillis() - askTime;
            System.out.println("Sua resposta foi: " + response + " no tempo " + responseTime/1000);
            double result = a * b;
            System.out.println("E está " + (result == response? "correto" : "incorreto"));
        } catch (Exception exception) {
            System.out.println(exception);
        }

    }
}
