import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("olá mundo, hello world");
		out.println("</body>");
		out.println("</html>");
	}

}


//<!DOCTYPE html>
//<html>
//<head>
//<meta charset="ISO-8859-1">
//<title>Insert title here</title>
//</head>
//<body>
//	<form action="/Pessoa/novaPessoa" method="post">
//
//        Nome: <input type="text" name="nome" />
//		
//		<input type="submit"/>
//    </form>
//</body>
//</html>


