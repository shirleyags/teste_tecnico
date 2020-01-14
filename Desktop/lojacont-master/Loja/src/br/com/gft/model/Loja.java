package br.com.gft.model;

import java.util.ArrayList;

public class Loja {

	private String nome;
	private String cnpj;
	private ArrayList<Livro> livros;
	private ArrayList<VideoGame> videoGame;

	public Loja() {

	}

	public Loja(String nome, String cnpj, ArrayList<Livro> livros, ArrayList<VideoGame> videoGame) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGame = videoGame;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	public ArrayList<VideoGame> getVideoGame() {
		return videoGame;
	}

	public void setVideoGame(ArrayList<VideoGame> videoGame) {
		this.videoGame = videoGame;
	}

	public void listaLivros() {
		
		System.out.println("---------------------------------------------------------------------------");
		
		if (livros.isEmpty()) {
			System.out.println("A lista está vazia");
		} else {

			System.out.println("As Lojas Americanas possui estes livros para venda: ");
			for (Livro daLista : livros) {
				System.out.println("\nTitulo:" + daLista.getNome() + ", Preço: " + daLista.getPreco()
						+ ", Quantidade em estoque: " + daLista.getQuantidade());

			}

		}
		
		System.out.println("---------------------------------------------------------------------------");

	}

	public void listaVideoGame() {

		if (videoGame.isEmpty()) {
			System.out.println("A lista está vazia");
		} else {

			System.out.println("As Lojas Americanas possui estes consoles para venda: ");
			for (VideoGame daLoja : videoGame) {
				System.out.println("\nVídeo-game:" + daLoja.getNome() + ", Preço: " + daLoja.getPreco()
						+ ", Quantidade em estoque: " + daLoja.getQuantidade());

			}

		}
		
		System.out.println("---------------------------------------------------------------------------");

	}

	
	public Double calculaPatrimonio() {
		Double total = (double) 0;
		for (Livro daLista : livros) {
			total += daLista.getPreco()*daLista.getQuantidade();
		}
		Double totalGame = (double) 0;
		for (VideoGame daLoja : videoGame) {
			totalGame += daLoja.getPreco()*daLoja.getQuantidade();
			
		}
		
		System.out.println("O patrimônio da Loja "+this.getNome()+" é de R$ " + (total+totalGame) + ".");
		return total+totalGame;

	}
	
	}
