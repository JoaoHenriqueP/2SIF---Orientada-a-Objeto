package bilheteUnico;

import java.util.Random;

public class Bilhete {

	int numero;
	double saldo;
	static double valorDaPassagem = 4.4;
	Usuario usuario;

	public Bilhete(String nome, String cpf, String tipo) {
		Random gerador = new Random();
		this.numero = gerador.nextInt(1000);
		this.saldo = 0;
		this.usuario = new Usuario(nome, cpf, tipo);
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	public void passarNaCatraca() {
		if (saldo >= valorDaPassagem) {
			if (usuario.tipo.equalsIgnoreCase("Estudante") || usuario.tipo.equalsIgnoreCase("Professor")) {
				saldo -=valorDaPassagem;
			} else {
				saldo -=valorDaPassagem/2;
			}
		}
	}

	public void carregar(double valor) {
		this.saldo += valor;
	}

}
