package br.com.yurekesley.lojavirtual.service;

import java.util.List;

import br.com.yurekesley.lojavirtual.model.Produto;

public interface IProduto {
	public List<Produto> getProdutosEmEstoque();
	
	public Integer getQuantidadeProdutosEmEstoque();
}
