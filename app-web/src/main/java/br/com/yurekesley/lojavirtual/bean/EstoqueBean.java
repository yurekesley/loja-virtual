package br.com.yurekesley.lojavirtual.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;

import br.com.yurekesley.lojavirtual.model.Produto;

@Startup
@Singleton
@ApplicationScoped
public class EstoqueBean implements IEstoque {
	
	private InfoBean info;
	
	private List<Produto> produtos = new ArrayList<Produto>();

	@PostConstruct
	private void init() {

		Produto p1 = new Produto("P0001", "CD DREAM THEATER", 20.00);
		Produto p2 = new Produto("P0002", "BICICLITA", 1.000);
		Produto p3 = new Produto("P0003", "CAMISA DO BRASIL BRANCA", 50.00);
		Produto p4 = new Produto("P0004", "SABÃO CRA CRA", 1.50);

		this.produtos.addAll(Arrays.asList(p1, p2, p3, p4));

	}

	public List<Produto> getProdutos() {
		return this.produtos;
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

	private boolean produtoExisteNoEstoque(Produto produto) {
		return this.produtos.contains(produto);
	}

	@Override
	public Integer getQuantidade() {
		if (this.produtos.equals(null)) {
			return 0;
		}
		return this.produtos.size();
	}
	
	@Override
	public Produto getProdutoPorID(String produtoID) {
		
		Produto produoSelecionado = null;
		
		for (Produto produto : this.produtos) {
				if (produto.getCodigo().equals(produtoID)) {
					produoSelecionado = produto;
					break;
				}
		}	
		
		return produoSelecionado;
	}

}