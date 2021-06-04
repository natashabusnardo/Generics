package Questao2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Questao2<V> {

	private String produto;
	private V id;
	private double valor;
	private Date dataFabricacao;
	private Date dataVencimento;

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public V getId() {
		return id;
	}

	public void setId(V id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		try {
			this.dataFabricacao = new SimpleDateFormat("dd/MM/yyyy").parse(dataFabricacao);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		try {
			this.dataVencimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataVencimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Date StrToDate(String pDate) {

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Date dia = null;
		try {

			dia = df.parse(pDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return dia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Questao2 [produto=");
		builder.append(produto);
		builder.append(", id=");
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

	public Questao2(String produto, V id, double valor, String dataFabricacao, String dataVencimento) {
		this.produto = produto;
		this.id = id;
		this.valor = valor;
		this.dataFabricacao = StrToDate(dataFabricacao);
		this.dataVencimento = StrToDate(dataVencimento);
	}

}
