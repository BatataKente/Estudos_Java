package curso.streams.filter;

import curso.streams.Aluno;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro {
	public static void main(String[] args) {
		var alunos = Arrays.asList(
				new Aluno("Josicleison", 7.8),
				new Aluno("Josicleide", 6.8),
				new Aluno("Alfredo", 7.1),
				new Aluno("Marcidineide", 9.9),
				new Aluno("Godolfredo", 2),
				new Aluno("Alfreditte", 8.8)
		);
		Predicate<Aluno> isAprovado = a -> a.nota >= 7;
		Function<Aluno, String> giveParabéns = a -> "Parabéns! " + a.nome + "! Você foi aprovado!";
		alunos.stream()
			.filter(isAprovado)
			.map(giveParabéns)
			.forEach(System.out::println);
	}
}
