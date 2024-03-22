package wildcard.upper;

import java.util.List;

public class UpperBounded {
	
	public static double soma(List<? extends Number> lista) {
		double total = 0;
		for(Number valor : lista)
			total += valor.doubleValue();
		return total;
	}
	
}