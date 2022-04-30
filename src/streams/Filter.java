package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7 && a.nota <= 10;
		Predicate<Aluno> reprovado = a -> a.nota >= 0 && a.nota < 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Voce foi Aprovado(a)!";
		Function<Aluno, String> saudacaoReprovado = a -> "Infelizmente " + a.nome + ", Voce foi Reprovado(a).";
		
		alunos.stream().filter(aprovado).map(saudacaoAprovado).forEach(System.out::println);
		System.out.println();
		alunos.stream().filter(reprovado).map(saudacaoReprovado).forEach(System.out::println);
	}
}
