package com.gft;

public class Main {
	// O factory Method permite encapsular a cria��o de um objeto ,por�m deixa as classes decidirem
	// qual classe instanciar.
	public static void main(String[] args) {
		Fabrica fabricaCarro = new FabricaCarro();
		//
		Carro carro = (Carro) fabricaCarro.criarProduto();

		carro.status();

	}

}
