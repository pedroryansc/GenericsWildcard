package generics.ex3;

import java.time.LocalDate;

public class Jogo {

	private int id;
	private String nome;
	private double preco;
	private LocalDate dataLancamento;
	private String desenvolvedora;
	private String distribuidora;
	
	public Jogo(int id, String nome, double preco, LocalDate dataLancamento, String desenvolvedora, String distribuidora) {
		setId(id);
		setNome(nome);
		setPreco(preco);
		setDataLancamento(dataLancamento);
		setDesenvolvedora(desenvolvedora);
		setDistribuidora(distribuidora);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogo [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", dataLancamento=");
		builder.append(dataLancamento);
		builder.append(", desenvolvedora=");
		builder.append(desenvolvedora);
		builder.append(", distribuidora=");
		builder.append(distribuidora);
		builder.append("]");
		return builder.toString();
	}
	
}