package generics.ex1;

public class Main {
	public static void main(String[] args) {
		
		String str = "Este elemento é uma String";
		ClasseGenerica<String> string = new ClasseGenerica<>(str);
		System.out.println(string.getElemento());
		
		int num = 42; // ou Integer
		ClasseGenerica<Integer> inteiro = new ClasseGenerica<>(num);
		System.out.println(inteiro.getElemento());
		
		ClasseGenerica<ClasseExemplo> objeto = new ClasseGenerica<>(new ClasseExemplo("Yoda", 45, "Arrakis"));
		System.out.println(objeto.getElemento());
		
	}
}