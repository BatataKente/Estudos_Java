package curso.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce_1 {
    public static void main(String[] args) {
        aula();
    }
    private static void aula() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        BinaryOperator<Integer> sum = (accumulated, number) -> accumulated + number;
//        Iplementando método no reduce que será aplicado a cada valor.
        Integer total_1 = numbers.stream().reduce(sum).get();
        System.out.println("1. " + total_1);
//        Valor inicial sendo considerado multiplas vezes.
        Integer total_2 = numbers.parallelStream().reduce(100, sum);
        System.out.println("2. " + total_2);
//        Valor inicial sendo considerado uma única vez.
        Integer total_3 = numbers.stream().reduce(100, sum);
        System.out.println("3. " + total_3);
//        Resultado foi um Optional<Integer>...
        System.out.print("4. ");
        numbers
            .stream()
            .filter(number -> number > 5)
            .reduce(sum)
            .ifPresent(System.out::println)
        ;
    }
}
