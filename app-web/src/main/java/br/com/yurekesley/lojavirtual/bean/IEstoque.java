package br.com.yurekesley.lojavirtual.bean;



import java.util.List;

import br.com.yurekesley.lojavirtual.model.Produto;

public interface IEstoque {
	
	public List<Produto> getProdutos();
	
	public void adcionarProduto(Produto produto);
	
	public Produto getProdutoPorID(String produtoID);
	
	public void removerProduto(Produto produto);

	public Integer getQuantidade();
}
