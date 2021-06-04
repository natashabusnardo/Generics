package Questao4;

import java.util.ArrayList;
import java.util.List;

public class Componente<E> {
	protected List<E> valor;
	protected List<String> chave;

	public Componente() {
		chave = new ArrayList<String>();
		valor = new ArrayList<>();
	}

	public boolean addComponente(String chave, E valor) {
		for (String strChave : this.chave) {
			if (strChave.equals(chave))
				return false;
		}

		this.chave.add(chave);
		this.valor.add(valor);
		return true;
	}

	public String busca(String chaves) {
		int tam = chave.size();

		for (int j = 0; j < tam; j++) {
			if (chaves.equals(chave.get(j))) {
				return "Chave:  " + chave.get(j) + ", valor: " + valor.get(j);
			}
		}
		return "Tente novamente! Chave não encontrada.";
	}
}
