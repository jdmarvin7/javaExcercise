package br.edu.unidep.atividadeAvaliativa.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		RelatorioCliente relatorio = new RelatorioCliente();
		RelatorioFuncionario relatorioFun = new RelatorioFuncionario();
		RelatorioVenda relatorioVenda = new RelatorioVenda();
		
		Scanner option = new Scanner(System.in);
		
		System.out.println("Deseja cadastrar um cliente, um funciorio ou efetuar uma venda?\n 1 == cliente / 2 == funcionario.");
		int resposta = option.nextInt();

		if (resposta == 1) {
			relatorio.entradaDados();
			relatorio.mostrarCliente();
			relatorio.msgReaultado();
		} 
		
		else if(resposta == 2) {
			relatorioFun.entradaDadosFun();
			relatorioFun.mostrarFuncionario();
			relatorioFun.msgReaultadoFun();
		}
		
		else {
			relatorioVenda.entradaDadosVenda();
			relatorioVenda.mostrarVenda();
			relatorioVenda.mostrarIMCS();
		}
	}
}
