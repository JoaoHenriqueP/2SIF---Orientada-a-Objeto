package br.fiap.venda;

import br.fiap.funcionario.Cargo;
import br.fiap.funcionario.Funcionario;

public class Venda {

	private Funcionario funcionario;
	private double valor;

	public Venda(Funcionario funcionario, double valor) {
		this.funcionario = funcionario;
		this.valor = valor;
	}

	public double calcularComissao() {
		
		Cargo cargo = funcionario.getCargo();
		double comissao = cargo.calcularComissao(valor);  

		return comissao;
	}

}
