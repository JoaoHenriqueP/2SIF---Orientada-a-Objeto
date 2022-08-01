package br.fiap.funcionario; 

public class Funcionario {

	private String nome;
	private double salario;
	private Cargo cargo;
	
	public Funcionario(String nome, double salario, Cargo cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + "]";
	}

	public Cargo getCargo() {
		return cargo;
	}
	
	
}
