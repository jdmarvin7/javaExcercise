package br.edu.unidep.atividadeAvaliativa.main;

import java.util.Scanner;

import br.edu.unidep.atividadeAvaliativa.model.Cliente;

public class RelatorioCliente {
	
	Cliente clienteUm = new Cliente();
	
	public void entradaDados() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente: ");
		String nome = input.next();
		clienteUm.setNome(nome);
		
		System.out.println("Digite a idade do cliente: ");
		int idade = input.nextInt();
		clienteUm.setIdade(idade);

		System.out.println("Digite o ano do nascimento do cliente: ");
		int anoNascimento = input.nextInt();
		clienteUm.setAnoNascimento(anoNascimento);
		
		System.out.println("Digite o endereço do cliente: ");
		String endereco = input.next();
		clienteUm.setEndereco(endereco);
		
		System.out.println("Digite o sexo do cliente");
		char sexo = input.next().charAt(0);
		clienteUm.setSexo(sexo);
		
		System.out.println("Digite o cpf: ");
		String cpf = input.next();
		clienteUm.setCpf(cpf);
		
		input.close();
	}
	
	public void mostrarCliente() {
		
		System.out.println("\n****************************************************************");
		
		System.out.println("Nome: " + clienteUm.getNome() +"\n"+ "Idade: " + clienteUm.getIdade() +"\n"+ "Ano de nascimento: " + clienteUm.getAnoNascimento() 
		+"\n"+ "Endereço: " + clienteUm.getEndereco() +"\n"+ "Sexo: " +clienteUm.getSexo() +"\n" + "CPF: " + clienteUm.getCpf()
		);
		
		System.out.println("\n****************************************************************");
	}
	
	public void msgReaultado() {
		
		System.out.println(clienteUm.calcularIdade());
	}
}

