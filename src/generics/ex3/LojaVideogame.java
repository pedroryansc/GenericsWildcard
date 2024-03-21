package generics.ex3;

import java.time.LocalDate;

public abstract class LojaVideogame {
	
	private String nome;
	private double preco;
	private LocalDate dataLancamento;
	
	public LojaVideogame(String nome, double preco, LocalDate dataLancamento) {
		setNome(nome);
		setPreco(preco);
		setDataLancamento(dataLancamento);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LojaVideogame [nome=");
		builder.append(nome);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", dataLancamento=");
		builder.append(dataLancamento);
		builder.append("]");
		return builder.toString();
	}
	
}