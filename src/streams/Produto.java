package streams;

import java.io.PrintStream;

public class Produto {

	final String nome;
	final double preco;
	final double desconto;
	final double valorFrete;
	public double valorFinal;

	public Produto(String nome, double preco, double desconto, double valorFrete) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.valorFrete = valorFrete;
	}

	public double precoFinal(){
		return this.valorFinal = this.preco * (1- this.desconto);
	}
}
