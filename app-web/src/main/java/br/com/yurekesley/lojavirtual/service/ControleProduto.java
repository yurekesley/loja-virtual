
package br.com.yurekesley.lojavirtual.service;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.yurekesley.lojavirtual.bean.EstoqueBean;

@Stateless
public class ControleProduto {

	@Inject private EstoqueBean estoqueBean;
	
	@PostConstruct
	private void init() {
		System.out.println("Criou ControleProduto Bean");
	}

	public void teste() {
		System.out.println("OIIII CarrinhoBean");
	}
}
