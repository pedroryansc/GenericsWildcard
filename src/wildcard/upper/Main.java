package wildcard.upper;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> inteiros = new ArrayList<Integer>();
		inteiros.add(5);
		inteiros.add(7);
		
		double soma = UpperBounded.soma(inteiros);
		System.out.println(soma);
		
		List<Double> doubles = new ArrayList<Double>();
		doubles.add(9.5);
		doubles.add(10.2);
		
		soma = UpperBounded.soma(doubles);
		System.out.println(soma);
		
	}
}