package br.com.yurekesley.lojavirtual.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.yurekesley.lojavirtual.bean.ICarrinho;
import br.com.yurekesley.lojavirtual.bean.IEstoque;
import br.com.yurekesley.lojavirtual.model.Produto;

@WebServlet("carrinho")
public class CarrinhoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ICarrinho carrinho;
	
	@EJB
	private IEstoque estoque;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String produtoID = request.getParameter("produtoID");
		
		if(!produtoID.equals("") != produtoID.equals(null)) {
			Produto produto = this.estoque.getProdutoPorID(produtoID);				
			this.carrinho.adcionarProduto(produto);
		}
		
		response.sendRedirect(request.getContextPath() + "/compras");
	}

}
