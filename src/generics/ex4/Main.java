package generics.ex4;

public class Main {
	public static void main(String[] args) {
		
		Lista<Integer> lista = new Lista<>();
		
		ChaveValor<Integer> obj1 = new ChaveValor<>("Pr1M31r0", 5);
		
		System.out.println(lista.adicionar(obj1));
		System.out.println(lista.buscarPelaChave("Pr1M31r0"));
		
		ChaveValor<Integer> obj2 = new ChaveValor<>("S3GuNd0", 7);
		
		System.out.println(lista.adicionar(obj2));
		System.out.println(lista.buscarPelaChave("S3GuNd0"));
		
		System.out.println(lista);
		
		ChaveValor<Integer> obj3 = new ChaveValor<>("S3GuNd0", 14);
		
		System.out.println(lista.adicionar(obj3));
		System.out.println(lista);
		
	}
}