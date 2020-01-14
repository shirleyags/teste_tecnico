package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame() {

	}

	public VideoGame(String nome, Double preco, int quantidade, String marca, String modelo, boolean isUsado) {

		super(nome, preco, quantidade);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	public Double calculaImposto() {
		if (this.isUsado) {
			Double taxa = getPreco() * 0.25;
			System.out.println("Imposto sobre " + this.getNome() +" " + this.getModelo() + " Usado é de R$ "+taxa+"." );
			return taxa;

		} else {
			Double taxa = getPreco() * 0.45;
			System.out.println ("Imposto sobre " + this.getNome() +" "+this.getModelo()+" é de R$ "+taxa+"." );
			return taxa;

		}

	}
}
