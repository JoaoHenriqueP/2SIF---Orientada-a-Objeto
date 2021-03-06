package br.fiapresort.hotel;

public class Resort {
	
	private String cidade;
	private int categoria;
	private String fone;
	
	
	public Resort(String cidade, int categoria, String fone) {
		this.cidade = cidade;
		this.categoria = categoria;
		this.fone = fone;
	}
	
	public String getDados() {
		String aux = "";
		aux += "Cidade: " + cidade + "\n";
		aux += "Categoria: " + categoria + "\n";
		aux += "Fone: " + fone + "\n";
		return aux;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux += "Cidade: " + cidade + "\n";
		aux += "Categoria: " + categoria + "\n";
		aux += "Fone: " + fone;
		return aux;
	}

	public String getCidade() {
		return cidade;
	}
	
}
