package generics.ex4;

public class ChaveValor<V> {

	private String chave;
	private V valor;
	
	public ChaveValor(String chave, V valor) {
		setChave(chave);
		setValor(valor);
	}
	
	public String getChave() {
		return chave;
	}
	
	public void setChave(String chave) {
		this.chave = chave;
	}
	
	public V getValor() {
		return valor;
	}
	
	public void setValor(V valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChaveValor [chave=");
		builder.append(chave);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
}