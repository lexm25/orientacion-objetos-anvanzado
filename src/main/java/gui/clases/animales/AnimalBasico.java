package gui.clases.animales;

import gui.interfaces.animales.IAnimalCarrera;

/**
 * @author Alejandro Martín Álvarez
 *
 */
public abstract class AnimalBasico implements IAnimalCarrera{
	
	/**
	 * Atributo PRIVATE de tipo String para que solo sea accesible por la propia clase.
	 * Atributos PROTECTED para que solo sea accesible por la clase y sus derivadas.
	 */
	private String apodo;
	protected Integer distancia;
	protected Integer ultimoTramo;
	
	/**
	 * Constructor sobrecargado PROTECTED que recibe el apodo y inicializa los valores iniciales
	 * @param apodo
	 */
	protected AnimalBasico(String apodo) {
		this.apodo = apodo;
		distancia = 0;
		ultimoTramo = 0;
	}

	/**
	 * Getter que devuelve el apodo
	 * @return apodo
	 */
	@Override
	public String getApodo() {
		return apodo;
	}

	/**
	 * Metodo avanza que depende de las clases derivadas por lo que es tipo ABSTRACT
	 */
	@Override
	public abstract void avanza();

	/**
	 * Metodo que reestablece los valores a 0 o vacío
	 */
	final public void resetea() {
		apodo = "";
		distancia = 0;
		ultimoTramo = 0;
	}

	/**
	 * Devuelve la distancia
	 * @return distancia
	 */
	final public Integer getDistancia() {
		return distancia;
	}
	
	/**
	 * Metodo que depende de las clases derivadas, por lo que es tipo ABSTRACT 	 
	 */
	abstract void gritoDeGuerra();
	
}