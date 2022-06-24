

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class novaEmpresa
 */
@WebServlet("/novaEmpresa")
public class novaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Olá,A empresa 'Nobre' usará meu primeiro servlets.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("o servlet OiMundoServlet foi chamado");
	}
}
