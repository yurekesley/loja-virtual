package br.com.yurekesley.lojavirtual.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.yurekesley.lojavirtual.model.Produto;
import br.com.yurekesley.lojavirtual.service.ControleProduto;

@WebServlet("/produtos")
public class ProdutoServlet extends HttpServlet {

	@Inject
	private ControleProduto controllerProduto;

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		
		writer.append("<html>");
		writer.append("<body>");

		writer.append("<h1>Lista de Produtos</h1>");

		writer.append("<table>");
		writer.append("<tr>");
		writer.append("<th>");
		writer.append("C�digo");
		writer.append("</th>");
		writer.append("<th>");
		writer.append("Produto");
		writer.append("</th>");
		writer.append("<th>");
		writer.append("</th>");
		writer.append("</tr>");

		for (Produto produto : this.controllerProduto.getProdutosEmEstoque()) {
			writer.append("<tr>");
			writer.append("<td>");
			writer.append(produto.getCodigo());
			writer.append("</td>");
			writer.append("<td>");
			writer.append(produto.getNome());
			writer.append("</td>");

			writer.append("</tr>");

		}

		writer.append("</table>");

		writer.append("<h3>Quantidade de produtos em estoque: "
				+ this.controllerProduto.getQuantidadeProdutosEmEstoque() + "</h3>");

		writer.append("</body>");
		writer.append("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
