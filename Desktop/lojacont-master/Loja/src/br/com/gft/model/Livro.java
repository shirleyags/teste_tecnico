package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {

	private String autor;
	private String tema;
	private int quantidadePagina;

	public Livro() {

	}

	public Livro(String nome, Double preco, int quantidade, String autor, String tema, int quantidadePagina) {
		super(nome, preco, quantidade);
		this.autor = autor;
		this.tema = tema;
		this.quantidadePagina = quantidadePagina;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQuantidadePagina() {
		return quantidadePagina;
	}

	public void setQuantidadePagina(int quantidadePagina) {
		this.quantidadePagina = quantidadePagina;
	}

	public Double calculaImposto() {

		Double desconto = 0.00;

		if (this.tema == "Educativo") {

			System.out.println("Livro educativo não tem imposto: " + this.getNome() + ".");

		} else {
			desconto = this.getPreco() * 0.10;

			System.out.println("R$ " + desconto + " de imposto sobre o livro: " + this.getNome() + ".");

		}

		return desconto;

	}

}
