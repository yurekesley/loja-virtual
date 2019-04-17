package br.com.yurekesley.lojavirtual.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;

import br.com.yurekesley.lojavirtual.model.Produto;

@Startup
@ApplicationScoped
public class EstoqueBean {

	private List<Produto> produtos = new ArrayList<Produto>();

	@PostConstruct
	public void init() {

		Produto cd = new Produto("PRD0001", "CD DREAM THEATER", 20.0);
		Produto blicicleta = new Produto("PRD0002", "BICICLETA", 1.200);
		Produto pneu = new Produto("PRD0003", "PNEU CARRO ARO 14", 125.51);
		Produto camisa = new Produto("PRD0004", "CAMISA", 15.0);

		this.produtos.addAll(Arrays.asList(cd, blicicleta, pneu, camisa));
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Integer getQuantidade() {
		if (this.produtos != null) 
			return this.produtos.size();
		
		return 0;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
