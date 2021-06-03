package Questao1;

public class MeuString<T> {
	private T type;

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	public MeuString(T type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeuString [type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}
	
	

}
