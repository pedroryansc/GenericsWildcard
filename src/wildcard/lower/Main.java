package wildcard.lower;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Animal> animais = new ArrayList<Animal>();
		animais.add(new Animal(1));
		animais.add(new Animal(2));
		LowerBounded.apresentarElementos(animais);
		
	}
}