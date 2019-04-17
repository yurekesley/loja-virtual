package br.com.yurekesley.lojavirtual.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;
import javax.inject.Inject;

import br.com.yurekesley.lojavirtual.model.Produto;

@Stateful
public class CarrinhoBean {
		
	@Inject private EstoqueBean estoque;
	
	private List<Produto> produtos = new ArrayList<Produto>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adicionarProduto(Produto produto) {
		if (produtos != null) {
			this.produtos.add(produto);
		}
	}

	public void removerProduto(String codigo) {
		if (produtos != null) {
			for (Produto produto : this.getProdutos()) {
				if (produto.getCodigo().equals(codigo)) {
					this.produtos.remove(produto);
					break;
				}
			}
		}
	}

	public List<Produto> listarProdutos() {
		return this.getProdutos();
	}
	
	public void teste() {
		System.out.println("OIIII CarrinhoBean");
	}

}
