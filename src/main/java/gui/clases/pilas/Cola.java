package gui.clases.pilas;

import gui.interfaces.pilas.Queue;

/**
 * @author Alejandro Martín Álvarez
 *
 * @param <T> (genérico)
 */
public class Cola<T> extends MyListArray<T> implements Queue<T>{

	/**
	 * Metodo apilar que añade un elemento al PRINCIPIO de la lista
	 */
	@Override
	public boolean add(T elemento) {
		return super.add(elemento);
	}

	/**
	 * Metodo que devuelve el PRIMER elemento de la lista
	 */
	@Override
	public T get() {
		return super.get(0);
	}
	
	/**
	 * Metodo que devuelve la longitud de la lista
	 * @return int
	 */
	@Override
	public int size() {
		return super.size();
	}
	
}