

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Nobre
 */


@WebServlet("/nobre")
public class Nobre extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Olá, bem vindo a pagina na empresa Nobre. Desenvolvida para auxílio no desenvolvimento de Softwere");
		 
		out.println("Insira aki seu CNPJ: <br/>");
		
		out.println("Insira aki seu CNPJ: ");
		
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("o servlet OiMundoServlet foi chamado");
	
	}
//	public class Nobre extends HttpServlet {
//
//	    private static final long serialVersionUID = 1L;
	//	@Override
	   
//	        
//	        //é sempre uma string
//	        String name = request.getParameter("nome");
//	        
//	        Pessoa pessoa = new Pessoa();
//	        
//	        pessoa.setNome(name);
//	        
//	        Banco banco = new Banco();
//	        
//	        banco.adiciona(pessoa);
//	        
//	        banco.getPessoas().forEach(e -> System.out.println(e.getNome()));
//
//	        PrintWriter out = response.getWriter();
//	        out.println("<html><body>Pessoa " + name + " cadastrada com sucesso!</body></html>");
	    }
		

	

