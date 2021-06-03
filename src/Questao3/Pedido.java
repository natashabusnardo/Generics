package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	protected List<ProdutoX> produto;

	public Pedido() {
		produto = new ArrayList<ProdutoX>();
	}

	public boolean addProduto(ProdutoX p) {
		return produto.add(p);
	}

	public String show() {
		String strProduto = "";
		for (ProdutoX produtoX : produto) {
			strProduto += produtoX + " ";
		}
		return strProduto;
	}
}
