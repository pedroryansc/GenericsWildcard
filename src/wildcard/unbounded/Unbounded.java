package wildcard.unbounded;

import java.util.List;

public class Unbounded {

	public static void removeUltimoItem(List<?> lista) {
		lista.remove(lista.size() - 1);
	}
	
}