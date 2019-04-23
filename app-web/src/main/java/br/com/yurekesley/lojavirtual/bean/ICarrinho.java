package br.com.yurekesley.lojavirtual.bean;

import java.util.List;

import br.com.yurekesley.lojavirtual.model.Produto;

public interface ICarrinho {
	public void adcionarProduto(Produto produto);
	public void removerProduto(Produto removerProduto);
	public List<Produto> getProdutosEmEstoque();
}
