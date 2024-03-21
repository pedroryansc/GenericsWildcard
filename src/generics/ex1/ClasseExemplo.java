package generics.ex1;

public class ClasseExemplo {

	private String nome;
	private int idade;
	private String planeta;
	
	public ClasseExemplo(String nome, int idade, String planeta) {
		setNome(nome);
		setIdade(idade);
		setPlaneta(planeta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClasseExemplo [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", planeta=");
		builder.append(planeta);
		builder.append("]");
		return builder.toString();
	}
	
}