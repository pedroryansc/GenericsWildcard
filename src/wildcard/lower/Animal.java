package wildcard.lower;

public class Animal {

	private int id;

	public Animal(int id) {
		setId(id);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
}