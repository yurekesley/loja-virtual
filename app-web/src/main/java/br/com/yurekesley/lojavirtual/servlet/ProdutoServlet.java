package br.com.yurekesley.lojavirtual.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.yurekesley.lojavirtual.bean.EstoqueBean;
import br.com.yurekesley.lojavirtual.model.Produto;

@WebServlet("/produtos")
public class ProdutoServlet extends HttpServlet {

	@Inject
	private EstoqueBean estoqueBean;

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StringBuffer buffer = new StringBuffer("");

		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		writer.append("<body>");
		
		writer.append("<h1>Lista de Produtos</h1>");

		for (Produto produto : this.estoqueBean.getProdutos()) {
			writer.append("<li>");
			writer.append(produto.getNome()); 
			writer.append("</li>");

		}
		
		
		writer.append("<h3>Quantidade de produtos em estoque: " + this.estoqueBean.getQuantidade() + "</h3>");

		writer.append("</body>");
		writer.append("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
