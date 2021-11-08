package br.edu.unidep.atividadeAvaliativa.model;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private int anoNascimento;
	private String endereco;
	private char sexo;
	
	public abstract String calcularIdade();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", anoNascimento=" + anoNascimento + ", endereco="
				+ endereco + ", sexo=" + sexo + "]";
	}
}
