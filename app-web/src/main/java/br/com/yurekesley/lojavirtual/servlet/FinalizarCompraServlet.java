package br.com.yurekesley.lojavirtual.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.yurekesley.lojavirtual.bean.ICarrinho;

@WebServlet("finalizar-compra")
public class FinalizarCompraServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICarrinho carrinho;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			this.carrinho.finalizarCompra();
			
			response.sendRedirect(request.getContextPath() + "/compras");

	}
	

}
