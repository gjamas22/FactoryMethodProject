package com.gft;

public class Carro extends Produto {

	private String marca;
	private String cor;
	private int portas;

	public Carro(String marca, String cor, int portas) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
	}

	public Carro() {
		super();
	}

	public void status() {
		System.out.println(
				"A marca do carro � :" + marca + "\nA cor �: " + cor + "\nA quantidade de portas s�o : " + portas);
	}
}
