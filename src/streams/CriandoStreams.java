package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::print;

		// Stream.of passando os valores literais
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");

		langs.forEach(print);

		String[] maisLangs = { "Pyton ", "Lisp ", "Pelr ", "Go\n" };

		// Stream.of passando um array
		Stream.of(maisLangs).forEach(print);
		// Arrays.Stream passando as informações necessárias
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print);

		List<String> outrasLagns = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLagns.stream().forEach(print);
		outrasLagns.parallelStream().forEach(print);// Stream paralela

		// Stream.generate(() -> "a").forEach(print); // Stream de forma infinita
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
}
