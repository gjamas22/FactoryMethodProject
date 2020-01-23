package com.gft;

public class FabricaCarro extends Fabrica {

	@Override
	public Produto criarProduto() {
		Carro c1 = new Carro("Jeep", "Branca", 4);
		return c1;
	}
}
