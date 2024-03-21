package generics.ex3;

import java.time.LocalDate;

public class Jogo extends LojaVideogame {

	private String plataforma;
	
	public Jogo(String nome, double preco, LocalDate dataLancamento, String plataforma) {
		super(nome, preco, dataLancamento);
		setPlataforma(plataforma);
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogo [plataforma=");
		builder.append(plataforma);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}