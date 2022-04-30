package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterAula201 {

	public static void main(String[] args) {

		DesafioAula201ClassAluno a1 = new DesafioAula201ClassAluno("Luclia", 9.5, 9.8);
		DesafioAula201ClassAluno a2 = new DesafioAula201ClassAluno("Raimundo", 7.5, 8.8);
		DesafioAula201ClassAluno a3 = new DesafioAula201ClassAluno("Matheus", 5.5, 8.8);
		DesafioAula201ClassAluno a4 = new DesafioAula201ClassAluno("Marcelo", 7.5, 7.8);
		DesafioAula201ClassAluno a5 = new DesafioAula201ClassAluno("Marcilio", 9.5, 7.8);
		DesafioAula201ClassAluno a6 = new DesafioAula201ClassAluno("Macauly", 4.5, 7.8);
		DesafioAula201ClassAluno a7 = new DesafioAula201ClassAluno("Gleice", 5.5, 6.8);
		DesafioAula201ClassAluno a8 = new DesafioAula201ClassAluno("Alessandra", 4.5, 3.4);
		DesafioAula201ClassAluno a9 = new DesafioAula201ClassAluno("Isabela", 9.5, 7.8);
		DesafioAula201ClassAluno a10 = new DesafioAula201ClassAluno("Laura", 6.5, 7.8);
		DesafioAula201ClassAluno a11 = new DesafioAula201ClassAluno("Barbara", 4.5, 2.8);
		DesafioAula201ClassAluno a12 = new DesafioAula201ClassAluno("Alex", 5.5, 1.8);
		DesafioAula201ClassAluno a13 = new DesafioAula201ClassAluno("Fant", 3.5, 9.8);
		DesafioAula201ClassAluno a14 = new DesafioAula201ClassAluno("Mariana", 2.5, 2.8);
		DesafioAula201ClassAluno a15 = new DesafioAula201ClassAluno("Maicon", 6.5, 6.8);
		DesafioAula201ClassAluno a16 = new DesafioAula201ClassAluno("Luiza", 1.5, 8.8);
		DesafioAula201ClassAluno a17 = new DesafioAula201ClassAluno("Camila", 6.5, 7.8);

		List<DesafioAula201ClassAluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13,
				a14, a15, a16, a17);

		Predicate<DesafioAula201ClassAluno> aprovado = a -> (a.nota1 + a.nota2) >= 7 && (a.nota1 + a.nota2) / 2 < 10;
		Predicate<DesafioAula201ClassAluno> recuperação = a -> (a.nota1 + a.nota2) / 2 >= 4
				&& (a.nota1 + a.nota2) / 2 < 7;
		Predicate<DesafioAula201ClassAluno> reprovado = a -> (a.nota1 + a.nota2) / 2 >= 0
				&& (a.nota1 + a.nota2) / 2 < 4;

		Function<DesafioAula201ClassAluno, String> saudacaoAprovados = a -> "Parabens " + a.nome
				+ " Você foi aprovado!";
		Function<DesafioAula201ClassAluno, String> saudacaoRecuperacao = a -> "Infelizmente " + a.nome
				+ ", você está de Recuperação!";
		Function<DesafioAula201ClassAluno, String> saudacaoReprovado = a -> "Infelizmente " + a.nome
				+ ", você está Reprovado!";

		alunos.stream().filter(aprovado).map(saudacaoAprovados).forEach(System.out::println);
		System.out.println();
		alunos.stream().filter(recuperação).map(saudacaoRecuperacao).forEach(System.out::println);
		System.out.println();
		alunos.stream().filter(reprovado).map(saudacaoReprovado).forEach(System.out::println);
	}
}
