package br.com.yurekesley.lojavirtual.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import br.com.yurekesley.lojavirtual.model.Produto;

@ApplicationScoped
public class EstoqueBean implements IEstoque {

	private List<Produto> produtos = new ArrayList<Produto>();

	@PostConstruct
	private void init() {

		Produto p1 = new Produto("P0001", "CD DREAM THEATER", 20.00);
		Produto p2 = new Produto("P0002", "BICICLITA", 1.000);
		Produto p3 = new Produto("P0003", "CAMISA DO BRASIL BRANCA", 50.00);

		this.produtos.addAll(Arrays.asList(p1, p2, p3));

	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public void adcionarProduto(Produto produto) {
		if (!this.produtoExisteNoEstoque(produto)) {
			this.produtos.add(produto);
		}
	}

	@Override
	public void removerProduto(Produto produto) {
		if (this.produtoExisteNoEstoque(produto)) {
			this.produtos.remove(produto);
		}
	}

	@Override
	public int totalDeProdutos() {
		if (this.produtos.equals(null)) {
			return 0;
		}
		return this.produtos.size();
	}

	private boolean produtoExisteNoEstoque(Produto produto) {
		return this.produtos.contains(produto);
	}

}
