package br.fiapresort.main;

import java.util.Scanner;

import br.fiapresort.hospede.Hospede;
import br.fiapresort.hotel.Resort;
import br.fiapresort.reserva.Reserva;

public class Main {

	public static void main(String[] args) {
		
		Reserva reserva[] = new Reserva[4];
		Scanner entrada = new Scanner(System.in);
		String cidade;
		int categoria=0;
		String fone;
		String cpf;
		String nome;
		String data = "";
		int cont=0;
		
		for (Reserva a: reserva) {
			System.out.println("Qual a cidade? (SP, BH, RJ)");
			cidade = entrada.next();
			System.out.println("Qual a categoria?");
			categoria = entrada.nextInt();
			System.out.println("Qual O telefone?");
			fone = entrada.next();
			System.out.println("Qual o CPF do hóspede?");
			cpf = entrada.next();
			System.out.println("Qual o Nome do hóspede?");
			nome = entrada.next();
			System.out.println("Qual a data da reserva?");
			data = entrada.next();
			
			Resort resort = new Resort(cidade,categoria,fone);
			
			Hospede hospede = new Hospede(cpf,nome);				
			
			Reserva reservas;			
			if (data != "") {
				reservas = new Reserva(data, resort, hospede);	
			} else {
				reservas = new Reserva(resort, hospede);	
			}
			
			reserva[cont] = reservas;
			cont++;
		}
		
		System.out.println("Listagem de todos os hóspedes que fizeram a reserva! \n");
		for (Reserva a: reserva) {
			System.out.println(a.getHospede());
		}

		System.out.println("Listagem dos hóspedes que fizeram a reserva em São Paulo para o dia 25/04/2022! \n");
		for (Reserva a: reserva) {
			if (a.getCidade().equalsIgnoreCase("SP")) {
				System.out.println(a.getHospede());				
			}
		}
		
	}

}
