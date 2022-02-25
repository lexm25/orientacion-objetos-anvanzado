package gui.clases.animales;

import java.util.Random;

/**
 * @author Alejandro Martín Álvarez
 *
 */
public class Gusano extends AnimalBasico{

	/**
	 * Atributos de Gusano
	 */
	protected int numPatas;
	
	/**
	 * Constructor de gusano el cual utiliza el constructor de AnimalBasico
	 * @param apodo
	 * @param numPatas
	 */
	public Gusano(String apodo, int numPatas) {
		//llamo al constructor de la clase padre AnimalBasico
		super(apodo);
		this.numPatas = numPatas;
	}

	/**
	 * Implementación del metodo gritoDeGuerra de AnimalBásico con un lema del Gusano
	 */
	@Override
	protected void gritoDeGuerra() {
		System.out.println("Antes de que te coman los humanos, que te devoren los gusanos");
	}

	/**
	 * Implementacion del metodo avanza de AnmialBasico con un dado el cual
	 * avanza según la cantidad que saque el dado.
	 */
	@Override
	public void avanza() {
			Random dado = new Random();
			int resultadoDado = 1 + dado.nextInt(4);
			distancia += resultadoDado;
			ultimoTramo = resultadoDado;
	}

	/**
	 * Devuelve el numero de patas
	 * @return numPatas
	 */
	public int getNumPatas() {
		return numPatas;
	}

	/**
	 * Modifica el numero de patas
	 * @param numPatas
	 */
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
}