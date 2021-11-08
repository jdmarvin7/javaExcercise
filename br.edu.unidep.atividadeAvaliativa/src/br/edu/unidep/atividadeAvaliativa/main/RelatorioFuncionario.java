package br.edu.unidep.atividadeAvaliativa.main;

import java.util.Scanner;

import br.edu.unidep.atividadeAvaliativa.model.Funcionario;

public class RelatorioFuncionario {
	Funcionario funcionario = new Funcionario();
	
	public void entradaDadosFun() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcionario: ");
		funcionario.setNome(input.next());
		
		System.out.println("Digite a idade do funcionario: ");
		funcionario.setIdade(input.nextInt());

		System.out.println("Digite o ano do nascimento do funcionario: ");
		funcionario.setAnoNascimento(input.nextInt());
		
		System.out.println("Digite o endereço do funcionario: ");
		funcionario.setEndereco(input.next());
		
		System.out.println("Digite o sexo do funcionario: ");
		funcionario.setSexo(input.next().charAt(0));
		
		System.out.println("Digite a funçao do funcionario: ");
		funcionario.setFuncao(input.next());
		
		input.close();
		}
	
	public void mostrarFuncionario() {
		
		System.out.println("\n****************************************************************");
		
		System.out.println("Nome: " + funcionario.getNome() +"\n"+ "Idade: " + funcionario.getIdade() +"\n"+ "Ano de nascimento: " + funcionario.getAnoNascimento() 
		+"\n"+ "Endereço: " + funcionario.getEndereco() +"\n"+ "Sexo: " +funcionario.getSexo() +"\n" + "Funçao: " + funcionario.getFuncao()
		);
		
		System.out.println("\n****************************************************************");
	}
	
	public void msgReaultadoFun() {
		
		System.out.println(funcionario.calcularIdade());
	}
}
