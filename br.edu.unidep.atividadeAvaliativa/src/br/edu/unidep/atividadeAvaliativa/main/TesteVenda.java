package br.edu.unidep.atividadeAvaliativa.main;

import br.edu.unidep.atividadeAvaliativa.model.Venda;

public class TesteVenda {
	public static void main(String[] args) {
		Venda venda = new Venda();
		
		venda.setProduto("Chocolate");
		venda.setDataVenda(20211012);
		venda.setPreco(30);
		
		venda.salvar();
	}
}
