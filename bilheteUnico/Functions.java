package bilheteUnico;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Functions {

	Bilhete[] bd = new Bilhete[5];
	int index = 0;

	public void menuPrincipal() {
		String aux = "Escolha uma opera��o \n1. Administrador \n2. Usu�rio\n3. Logout";
		int opt;

		do {
			opt = parseInt(showInputDialog(aux));
			if (opt < 1 || opt > 3) {
				showMessageDialog(null, "Op��o inv�lida");
			} else {
				if (opt == 1) {
					menuAdm();
				} else if (opt == 2) {
					menuUser();
				}
			}
		} while (opt != 3);

	}

	public void menuAdm() {
		String aux = "Escolha uma opera��o \n1. Cadastrar Bilhete \n2. Consultar Bilhete\n3. Logout";
		int opt;

		do {
			opt = parseInt(showInputDialog(aux));
			if (opt < 1 || opt > 3) {
				showMessageDialog(null, "Op��o inv�lida");
			} else {

			}
		} while (opt != 3);
	}

	public void menuUser() {
		String aux = "Escolha uma opera��o \n1. Consultar Saldo \n2. Carregar bilhete\n3. Passar na catraca\n4. Logout";
		int opt;

		do {
			opt = parseInt(showInputDialog(aux));
			if (opt < 1 || opt > 4) {
				showMessageDialog(null, "Op��o inv�lida");
			} else {

			}
		} while (opt != 4);
	}

	public void cadastrarBilhete() {
		if (index < bd.length) {
			String nome = showInputDialog("Nome: ");
			String cpf = showInputDialog("CPF:");
			String tipo = showInputDialog("Tipo (Estudante/ Professor / Normal):");

			bd[index] = new Bilhete(nome, cpf, tipo);
			index++;
		}	else {
			showMessageDialog(null, "tamo cheio de bilhete");
		}

	}

}
