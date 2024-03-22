package wildcard.unbounded;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<String> listaNomes = new ArrayList<String>();
		listaNomes.add("Rodrigo Curvêllo");
		listaNomes.add("Yoda");
		listaNomes.add("Neo");
		
		System.out.println(listaNomes);
		
		Unbounded.removeUltimoItem(listaNomes);
		
		System.out.println(listaNomes);
		
	}
}