package gui.interfaces.pilas;

/**
 * @author Alejandro Martín Álvarez
 *
 * @param <T>
 */
public interface Pile<T> {

	boolean push(T elemento);
	
	T pop();
	
	int size();
	
}
