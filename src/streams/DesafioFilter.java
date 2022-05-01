package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		Produto p1 = new Produto("Lapis", 1.99, 0.35, 0);
		Produto p2 = new Produto("Notebook", 4899.99, 0.32, 0);
		Produto p3 = new Produto("Caderno", 30.0, 0.45, 0);
		Produto p4 = new Produto("Impressora", 1200.00, 0.40, 0);
		Produto p5 = new Produto("Ipad", 3100.0, 0.29, 30);
		Produto p6 = new Produto("Relogio", 1900.0, 0.12, 0);
		Produto p7 = new Produto("Monitor", 800.0, 0.31, 0);
		Produto p8 = new Produto("Mochila", 110.99, 0.12, 0);
		Produto p9 = new Produto("Pochete", 14.99, 0.10, 0);
		Produto p10 = new Produto("Apontador", 2.99, 0.35, 0);
		Produto p11 = new Produto("Lapizeira", 8.99, 0.35, 0);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
		
		//Filter
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.30;
		Predicate<Produto> freteGratis = f -> f.valorFrete >= 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
				
		Function<Produto, String> chamadaPromocional = p -> "Aproveite " + p.nome + " por R$ " + p.precoFinal();
				
		produtos.stream().filter(superPromocao).filter(freteGratis).filter(produtoRelevante).map(chamadaPromocional).forEach(System.out::println);;
	}
}
