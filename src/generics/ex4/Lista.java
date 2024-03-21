package generics.ex4;

import java.util.ArrayList;
import java.util.List;

public class Lista<V> {

	private List<ChaveValor<V>> lista = new ArrayList<ChaveValor<V>>();

	public boolean adicionar(ChaveValor<V> obj) {
		for(int i = 0; i < lista.size(); i++) {
			if(obj.getChave().equals(lista.get(i).getChave()))
				return false;
		}
		lista.add(obj);
		return true;
	}
	
	public ChaveValor<V> buscarPelaChave(String chave){
		for(int i = 0; i < lista.size(); i++) {
			if(chave.equals(lista.get(i).getChave()))
				return lista.get(i);
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lista [lista=");
		builder.append(lista);
		builder.append("]");
		return builder.toString();
	}
	
}