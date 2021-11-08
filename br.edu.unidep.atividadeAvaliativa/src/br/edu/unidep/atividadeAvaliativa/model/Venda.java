package br.edu.unidep.atividadeAvaliativa.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.edu.unidep.atividadeAvaliativa.IImposto.Iimposto;

public class Venda implements Iimposto {
	private String produto;
	private double preco;
	private int dataVenda; 
	private String estado;

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(int dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public double calcularICMS() {
		double vImposto = 0;
		if (getEstado() != "Parana") {
			vImposto = (preco * 12) / 100;
			System.out.println(vImposto);
		} else {
			vImposto = (preco * 7) / 100;
		}
		return vImposto;
	} 
	
	public String salvar() {
		try {
			FileWriter fw = new FileWriter("venda.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Nome: " + this.produto);
			pw.println("Data: " + this.dataVenda);
			pw.println("Valor: " + this.preco);
			pw.println("Imposto IMCS: " + this.calcularICMS());
			
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException ex) {
			Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
		}
		return "Cadastrado com sucesso!!";
	}

	@Override
	public String toString() {
		return "Venda [produto=" + produto + ", preco=" + preco + ", dataVenda=" + dataVenda + ", estado=" + estado
				+ "]";
	}
	
}
