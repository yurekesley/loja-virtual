package br.com.yurekesley.lojavirtual.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.yurekesley.lojavirtual.bean.ICarrinho;
import br.com.yurekesley.lojavirtual.bean.IEstoque;
import br.com.yurekesley.lojavirtual.model.Produto;

@WebServlet("remover-do-carrinho")
public class RemoverDoCarrinhoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICarrinho carrinho;
	
	@Inject
	private IEstoque estoque;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String produtoID = request.getParameter("produtoID");
		
		if(!produtoID.equals("") != produtoID.equals(null)) {
			Produto produto = this.estoque.getProdutoPorID(produtoID);				
			this.carrinho.removerProduto(produto);
		}
		
		response.sendRedirect(request.getContextPath() + "/compras");
		
	}

}
