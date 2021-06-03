package Questao3;

public class ProdutoX {
	private String nome;
	private double valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public ProdutoX(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoX [nome=");
		builder.append(nome);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}

}
