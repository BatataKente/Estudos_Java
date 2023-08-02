package curso.streams.reduce;

import curso.streams.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce_2 {
    public static void main(String[] args) {
        aula();
    }
    private static void aula() {

        Aluno a_1 = new Aluno("Ana", 7.1);
        Aluno a_2 = new Aluno("Josicleison", 6.1);
        Aluno a_3 = new Aluno("Guilermino", 8.1);
        Aluno a_4 = new Aluno("Gabrielem", 10);

        List<Aluno> alunos = Arrays.asList(a_1, a_2, a_3, a_4);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> apenasNota = aluno -> aluno.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
        alunos.parallelStream()
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
}
