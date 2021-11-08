package br.edu.unidep.atividadeAvaliativa.main;

import java.util.Scanner;

import br.edu.unidep.atividadeAvaliativa.model.Venda;

public class RelatorioVenda {
    
    Scanner entr = new Scanner(System.in);
    Venda venda = new Venda();


    public void entradaDadosVenda() {
        System.out.println("Digite o nome do produto: ");
        venda.setProduto(entr.next());

        System.out.println("Digite o preço do produto: ");
        venda.setPreco(entr.nextDouble());

        System.out.println("Digite a data da venda: ");
        venda.setDataVenda(entr.nextInt());

        System.out.println("Digite o estado onde foi efetuado a venda: ");
        venda.setEstado(entr.next());

        entr.close();
    }

    public void mostrarVenda() {
        System.out.println("Produto: " + venda.getProduto() +"\n"+ "Preço: " + venda.getPreco() +"\n"+ "Data: " + venda.getDataVenda() +"\n"+ "Estado: " + venda.getEstado());
    }

    /*public void msgICMS() {
        System.out.println("O imposto aplicado e: " + venda.calcularICMS() +"\n"+ "E o novo preço e: " + (venda.getPreco() - venda.calcularICMS()));
    }*/

    public void mostrarIMCS() {
        venda.salvar();
    }

}
