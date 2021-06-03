package Questao1;

public class Animal {

	private String nome;
	private String classeReprodutiva;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasseReprodutiva() {
		return classeReprodutiva;
	}

	public void setClasseReprodutiva(String classeReprodutiva) {
		this.classeReprodutiva = classeReprodutiva;
	}

	
	public Animal(String nome, String classeReprodutiva) {
		this.nome = nome;
		this.classeReprodutiva = classeReprodutiva;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [nome=");
		builder.append(nome);
		builder.append(", classeReprodutiva=");
		builder.append(classeReprodutiva);
		builder.append("]");
		return builder.toString();
	}

}
