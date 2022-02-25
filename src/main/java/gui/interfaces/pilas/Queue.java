package gui.interfaces.pilas;

/**
 * @author Alejandro Martín Álvarez
 *
 * @param <T>
 */
public interface Queue<T> {
	
	boolean add(T elemento);
	
	T get();
	
	int size();
	
}
