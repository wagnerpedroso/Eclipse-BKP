import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaPessoas")
public class ListaPessoasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Pessoa> lista = banco.getPessoas();
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
        out.println("<ul>");
        for (Pessoa pessoa: lista) {
        	out.println("<li>"+ pessoa.getNome() +"</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
	}

}
