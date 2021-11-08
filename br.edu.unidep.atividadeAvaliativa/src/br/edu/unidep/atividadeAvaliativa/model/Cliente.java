package br.edu.unidep.atividadeAvaliativa.model;

public class Cliente extends Pessoa {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String calcularIdade() {
		String msg = "";
		if (getIdade() >= 16 && getIdade() < 18) {
			msg = "Cliente poderá ter um cadastro desde que tenha aprovação de um responsável";
		}
		else if (getIdade() > 18) {
			msg = "Cliente poderá ter um cadastro sujeito a consulta SPC";
		} else {
			msg = "Não poderá ter um cadastro devido idade ser menor do que 16 anos";
		}
		return msg;
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + "]";
	}
}
