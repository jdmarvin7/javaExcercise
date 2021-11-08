package br.edu.unidep.atividadeAvaliativa.model;

public class Funcionario extends Pessoa{
	private String funcao;
	
	
	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String calcularIdade() {
		String msg = "";
		if (getIdade() >= 16 && getIdade() < 18) {
			msg = "Colaborador poderá ser vinculado a empresa como Menor Aprendiz";
		}
		else if (getIdade() > 18) {
			msg = "Colaborador poderá ser vinculado a empresa com contrato efetivo";
		} else {
			msg = "Não poderá ter um vincula a empresa";
		}
		return msg;
	}
	
	@Override
	public String toString() {
		return "Funcionario [funcao=" + funcao + "]";
	}

}
