package br.com.yurekesley.lojavirtual.bean;



import java.util.List;

import br.com.yurekesley.lojavirtual.model.Produto;

public interface IEstoque {
	
	public List<Produto> getProdutos();
	
	public void adcionarProduto(Produto produto);
	
	public void removerProduto(Produto removerProduto);

	public Integer getQuantidade();
}
