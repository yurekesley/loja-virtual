package br.com.yurekesley.lojavirtual.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import br.com.yurekesley.lojavirtual.model.Produto;

@Stateful
@SessionScoped
public class CarrinhoBean implements ICarrinho {
	
	private List<Produto> produtos = new ArrayList<Produto>();

	@Inject
	private IEstoque estoque;

	public void adcionarProduto(Produto produto) {

		if (!this.produtos.contains(produto)) {
			this.produtos.add(produto);
		}
	}

	public void removerProduto(Produto produto) {
		if (this.produtos.contains(produto)) {
			this.produtos.remove(produto);
		}
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void finalizarCompra() {

		for (Produto produto : this.produtos) {
			this.estoque.removerProduto(produto);
		}

	}
}
