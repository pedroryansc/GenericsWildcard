package wildcard.lower;

import java.util.List;

public class LowerBounded {

	public static void apresentarElementos(List<? super Cachorro> lista) {
		for(int i = 0; i < lista.size(); i++)
			System.out.println((i + 1) + ". " + lista.get(i));
	}
	
}