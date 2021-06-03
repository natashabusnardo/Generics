package Questao3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido p = new Pedido();
		ProdutoX p1 = new ProdutoX("Esmalte", 6.99);
		ProdutoX p2 = new ProdutoX("Acetona", 3.99);
		ProdutoX p3 = new ProdutoX("Algodão", 1.99);
		
		p.addProduto(p1);
		p.addProduto(p2);
		p.addProduto(p3);
		
		System.out.println(p.show());
		
	}

}
