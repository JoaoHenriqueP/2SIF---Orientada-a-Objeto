package br.fiap.main;

import br.fiap.funcionario.Cargo;
import br.fiap.funcionario.Funcionario;
import br.fiap.venda.Venda;

public class Main {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("João", 2000, Cargo.GERENTE);
		Venda venda = new Venda(funcionario, 2000);
		System.out.println(venda.calcularComissao());
	}

}
