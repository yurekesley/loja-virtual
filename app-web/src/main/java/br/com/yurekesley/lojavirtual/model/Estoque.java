package br.com.yurekesley.lojavirtual.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	private List<Produto> produtos = new ArrayList<Produto>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Integer getQuantidade() {
		if (this.produtos != null) {
			return this.produtos.size();
		}
		return 0;
	}

}
