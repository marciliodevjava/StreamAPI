package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

		System.out.println("Utilizando o for");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println("Nome: " + aprovados.get(i));
		}

		System.out.println();
		System.out.println("Usando o Foreach");
		for (String nome : aprovados) {
			System.out.println("Nome: " + nome);
		}

		System.out.println();
		System.out.println("Usando o Iterator...");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println("Nome: " + it.next());
		}
	}
}
