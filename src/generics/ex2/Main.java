package generics.ex2;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		LocalDate dataFab = LocalDate.parse("2024-02-22");
		LocalDate dataVen = LocalDate.parse("2024-04-24");
		
		Produto<Integer> p1 = new Produto<>(2087460, 55.99, dataFab, dataVen);
		System.out.println(p1);
		
		Produto<String> p2 = new Produto<>("R0ffGh4n0r", 55.99, dataFab, dataVen);
		System.out.println(p2);
		
	}
}