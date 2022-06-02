
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/novaEmpresa")
//public class NovaEmpresaServlet extends HttpServlet {

//	private static final long serialVersionUID = 1L;

//    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//    	String name = request.getParameter("nome");
//    	System.out.println("Cadastrando nova empresa");
//    	System.out.println("Nome da empresa:" + name);
//    	PrintWriter out = response.getWriter();
//        out.println("<html><body>Empresa " + name + " cadastrada com sucesso!</body></html>");
//    }
//}

//@WebServlet("/novaEmpresa")
//public class NovaEmpresaServlet extends HttpServlet {
//
//    private static final long serialVersionUID = 1L;
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
//            throws ServletException, IOException {
//        System.out.println("Cadastrando nova empresa");
//
//        String name = request.getParameter("nome");
//
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>Empresa " + name + " cadastrada com sucesso!</body></html>");
//    }
//
//}


@WebServlet("/novaPessoa")
public class NovaPessoaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        System.out.println("Cadastrando nova pessoa");
        
        //é sempre uma string
        String name = request.getParameter("nome");
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome(name);
        
        Banco banco = new Banco();
        
        banco.adiciona(pessoa);
        
        banco.getPessoas().forEach(e -> System.out.println(e.getNome()));

        PrintWriter out = response.getWriter();
        out.println("<html><body>Pessoa " + name + " cadastrada com sucesso!</body></html>");
    }

}



