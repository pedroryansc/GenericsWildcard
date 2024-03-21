package generics.ex3;

import java.time.LocalDate;

public class Console extends LojaVideogame {

	private String fabricante;
	
	public Console(String nome, double preco, LocalDate dataLancamento, String fabricante) {
		super(nome, preco, dataLancamento);
		setFabricante(fabricante);
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Console [fabricante=");
		builder.append(fabricante);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
