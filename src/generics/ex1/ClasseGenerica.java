package generics.ex1;

public class ClasseGenerica<E> {

	private E elemento;
	
	public ClasseGenerica(E elemento) {
		this.elemento = elemento;
	}
	
	public E getElemento() {
		return elemento;
	}
	
}