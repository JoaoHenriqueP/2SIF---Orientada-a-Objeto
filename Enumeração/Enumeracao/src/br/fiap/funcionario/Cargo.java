package br.fiap.funcionario;
import br.fiap.comissao.Comissao;

public enum Cargo implements Comissao {
ATENDENTE{
	public double calcularComissao(double valor) {
	return valor*0.1;	
	}
},

VENDEDOR{
	public double calcularComissao(double valor) {
	return valor*0.15 + 5;	
	}
},

GERENTE{
	public double calcularComissao(double valor) {
	return valor*0.2 + 10;	
	}
}
	
	
	
}
