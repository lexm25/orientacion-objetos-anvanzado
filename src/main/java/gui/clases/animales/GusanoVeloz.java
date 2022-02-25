package gui.clases.animales;

import java.util.Random;

/**
 * @author Alejandro Martín Álvarez
 *
 */
public class GusanoVeloz extends Gusano{

	private int numPatas;
	
	/**
	 * Constructor de GusanoVeloz pasandole por parametro el apood y el numero de patas
	 * @param apodo
	 * @param numPatas
	 */
	public GusanoVeloz(String apodo, int numPatas) {
		super(apodo, numPatas / 2);
		this.numPatas = numPatas;
	}

	/**
	 * Metodo avanza el cual solo avanza si la moneda es CARA
	 */
	@Override
	public void avanza() {
		super.avanza();
		int numero=0;
		Random moneda = new Random();
		numero = 1 + moneda.nextInt(2);
		if(numero==1) {
			super.distancia+=super.distancia;
		}
		else {
			(super.distancia) -= (super.ultimoTramo);
			System.out.println("Ha salido cruz, el gusano no avanza");
		}
	}

	/**
	 * Devuelve el numero de patas
	 */
	public int getNumPatas() {
		return numPatas;
	}

	/**
	 * Devuelve el numero de la clase de la cual herda, es decir Gusano
	 * @return numero de patas
	 */
	public int getNumPatasGusano() {
		return numPatas/2;
	}
	
	/**
	 * Grito de guerra de GusanoVeloz
	 */
	public void gritoDeGuerra() {
		System.out.println("Los cambios son buenos");
	}
	
}