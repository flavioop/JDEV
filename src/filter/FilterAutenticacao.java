package filter;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import connection.ConnectionDatabase;
import user.UserLogado;


@WebFilter(urlPatterns={"/pages/*"})
public class FilterAutenticacao  implements Filter{

	private static Connection connection;	
	
	@Override//faz algo quando a aplicação é derrubada.
	public void destroy() {
	
	}

	@Override//intercepta todas as nossas requisições.
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain)throws IOException, ServletException {
		
			HttpServletRequest req = (HttpServletRequest) request;
			HttpSession session = req.getSession();
			
			String urlParaAutenticar = req.getServletPath();
			
			//retorna null se não estiver logado
			UserLogado userLogado = (UserLogado) session.getAttribute("usuario");
			
			if(userLogado == null && !urlParaAutenticar.equalsIgnoreCase("/pages/ServletAutenticacao")) {//usuario não logado
				RequestDispatcher dispatcher = 	request.getRequestDispatcher("/autenticar.jsp?url="+urlParaAutenticar);
				dispatcher.forward(request, response);
				return;// para o processo para redirecionar
			}
			
			//executa as ações do request / response
			chain.doFilter(request, response);
		
			
		
	}

	@Override //excuta algo quando a aplicação é iniciada
	public void init(FilterConfig filterConfig) throws ServletException {
		connection = ConnectionDatabase.getConnection();

		
	}
	
	

}
