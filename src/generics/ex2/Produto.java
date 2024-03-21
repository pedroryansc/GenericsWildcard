package generics.ex2;

import java.time.LocalDate;

public class Produto <K> {

	private K id;
	private double valor;
	private LocalDate dataFabricacao;
	private LocalDate dataVencimento;
	
	public Produto(K id, double valor, LocalDate dataFabricacao, LocalDate dataVencimento) {
		setId(id);
		setValor(valor);
		setDataFabricacao(dataFabricacao);
		setDataVencimento(dataVencimento);
	}

	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataFabricacao=");
		builder.append(dataFabricacao);
		builder.append(", dataVencimento=");
		builder.append(dataVencimento);
		builder.append("]");
		return builder.toString();
	}
	
}