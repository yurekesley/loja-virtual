
package br.com.yurekesley.lojavirtual.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.yurekesley.lojavirtual.bean.CarrinhoBean;
import br.com.yurekesley.lojavirtual.bean.EstoqueBean;

@ApplicationScoped
public class ControleCompras {

	@Inject
	CarrinhoBean carrinhoBean;

	@Inject
	EstoqueBean estoqueBean;

}
