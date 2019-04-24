package br.com.yurekesley.lojavirtual.service;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

import br.com.yurekesley.lojavirtual.bean.IEstoque;
import br.com.yurekesley.lojavirtual.model.Produto;

@ManagedBean
public class ControleProduto implements IProduto {

	@Inject
	private IEstoque estoque;

	@Override
	public List<Produto> getProdutosEmEstoque() {
		return this.estoque.getProdutos();
	}

	@Override
	public Integer getQuantidadeProdutosEmEstoque() {
		return this.estoque.getQuantidade();
	}
}
