package fiap.forma.main;

import fiap.forma.forma3d.Cilindro;
import fiap.forma.formas.formas;
import fiap.forma.volume.Volume;
import fiap.formas.forma2d.Circulo;

public class main {

	public static void main(String[] args) {

		formas[] forma = new formas[4];
		
		
		forma[0] = new Circulo(10, 15, 5);
		forma[1] = new Cilindro(8, 5, 7, 3.5);
		forma[2] = new Circulo(5, 7, 2);
		forma[3] = new Cilindro(4, 2, 3, 1.2);
		
		for (formas f: forma) {
		//	System.out.println(f.calcularArea());
		}
		
		System.out.println();
		for (formas f: forma) {
			if(f instanceof Volume) {
				System.out.println(((Volume) f).calcularVolume());
			}
		}
		
	}

}
