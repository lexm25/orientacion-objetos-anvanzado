package gui.clases.pilas;

import gui.interfaces.pilas.Pile;

/**
 * @author Alejandro Martín Álvarez
 *
 * @param <T> (genérico)
 */
public class Pila<T> extends MyList<T> implements Pile<T>{
	
	/**
	 * Metodo que añade un elemento al FINAL de la lista
	 */
	@Override
	public boolean push(T elemento) {
		return super.add(elemento);
	}

	/**
	 * Metodo que saca el ÚLTIMO elemento de la lista y lo devuelve
	 */
	@Override
	public T pop() {
		T elemento = super.get(super.size()-1);
		super.delete(elemento);
		return elemento;
	}

	/**
	 * Metodo que deuvelve el tamaño de la lista
	 * @return int
	 */
	@Override
	public int size() {
		return super.size();
	}

}
