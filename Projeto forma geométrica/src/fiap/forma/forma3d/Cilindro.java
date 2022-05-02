package fiap.forma.forma3d;
import fiap.forma.formas.formas;
import fiap.forma.volume.Volume;

public class Cilindro extends formas implements Volume {
	
	private double altura;

	public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
		super(coordenadaX, coordenadaY, raio);
		this.altura = altura;
	}

	public double calcularArea() {
		return 0;
	}
	
	public double calcularVolume() {
		return 0;
	}
	
	

}
