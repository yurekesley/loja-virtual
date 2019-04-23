package br.com.yurekesley.lojavirtual.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.yurekesley.lojavirtual.bean.ICarrinho;

@WebServlet("/compras")
public class ComplasServlet extends HttpServlet {
	
	@EJB 
	private ICarrinho carrinho;
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			 System.out.println(this.carrinho.getProdutosEmEstoque());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
