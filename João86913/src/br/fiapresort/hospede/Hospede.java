package br.fiapresort.hospede;

public class Hospede {

	String cpf;
	String nome;
	int pontuacao;

	public Hospede(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getDados() {
		String aux = "";
		aux += "CPF: " + cpf + "\n";
		aux += "Nome: " + nome + "\n";
		aux += "Pontuação: " + pontuacao + "\n";
		return aux;
	}

	@Override
	public String toString() {
		String aux = "";
		aux += "CPF: " + cpf + "\n";
		aux += "Nome: " + nome + "\n";
		aux += "Pontuação: " + pontuacao + "\n";
		return aux;
	}
	
	

}
