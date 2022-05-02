package br.fiapresort.reserva;

import br.fiapresort.hotel.Resort;
import br.fiapresort.hospede.Hospede;

public class Reserva {

	String data;
	Resort resort;
	Hospede hospede;

	public Reserva(String data, Resort resort, Hospede hospede) {
		this.data = data;
		this.resort = resort;
		this.hospede = hospede;
	}

	public Reserva(Resort resort, Hospede hospede) {
		this.resort = resort;
		this.hospede = hospede;
		this.data = "25/04/2022";
	}

	public String getDados() {
		String aux = "";
		aux += "Data: " + data + "\n";
		aux += "Resort: \n" + resort + "\n";
		aux += "Hospede: \n" + hospede + "\n";
		return aux;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux += "Data: " + data + "\n";
		aux += "Resort: \n" + resort + "\n";
		aux += "Hospede: \n" + hospede + "\n";
		return aux;
	}

	public Hospede getHospede() {
		return hospede;
	}
	
	public String getCidade() {
		return resort.getCidade();
	}
	

}
