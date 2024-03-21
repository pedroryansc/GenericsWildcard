package generics.ex3;

import java.util.ArrayList;
import java.util.List;

public class Pedido<T extends LojaVideogame> {

	private List<T> listaProdutos = new ArrayList<T>();
	
	public void adicionarProduto(T produto) {
		listaProdutos.add(produto);
	}
	
	public void mostrarLista() {
		for(int i = 0; i < listaProdutos.size(); i++) {
			System.out.println((i + 1) + ". " + listaProdutos.get(i));
		}
	}
	
}