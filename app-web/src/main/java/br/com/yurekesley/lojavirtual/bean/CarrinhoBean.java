package br.com.yurekesley.lojavirtual.bean;

import java.util.List;

import javax.ejb.Stateful;
import javax.inject.Inject;

import br.com.yurekesley.lojavirtual.model.Produto;

@Stateful
public class CarrinhoBean implements ICarrinho {
	
	@Inject
	private IEstoque estoque;
	
	public List<Produto> getProdutosEmEstoque() {
		return this.estoque.getProdutos();
	}

	@Override
	public void adcionarProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerProduto(Produto removerProduto) {
		// TODO Auto-generated method stub
		
	}
	
	

}
