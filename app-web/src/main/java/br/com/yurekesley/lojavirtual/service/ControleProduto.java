package br.com.yurekesley.lojavirtual.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.yurekesley.lojavirtual.bean.IEstoque;
import br.com.yurekesley.lojavirtual.model.Produto;

@Stateless
public class ControleProduto implements  IProduto {
	
	@Inject
	private IEstoque estoque;
	
	public List<Produto> getProdutos () {
		return this.estoque.getProdutos();
	}
	
	

}
