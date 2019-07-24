package br.com.fatec.token;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.catalina.util.ParameterMap;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
 * Essa classe é responsável por interceptar as requisições do servidor e pegar o refresh token do cookie.
 */

@Component
@Order(Ordered.HIGHEST_PRECEDENCE) //Aumenta a prioridade deste filtro para que seja executado antes de tudo
public class RefreshTokenCookiePreProcessorFilter implements Filter{
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		

		HttpServletRequest req = (HttpServletRequest) request;
		
		//verifica se a requisição é para oauth/token e se o grant_type é do tipo: refresh_token
		if("/oauth/token".equalsIgnoreCase(req.getRequestURI())
				&& "refresh_token".equals(req.getParameter("grant_type"))
				&& req.getCookies() != null) {
			for(Cookie cookie : req.getCookies()) //para acessar os cookies é necessário iterar em uma lista de cookies
				if(cookie.getName().equals("refreshToken")) { //necessário verificar se o nome do cookie é o refreshToken
					String refreshToken = cookie.getValue(); // caso seja, pegamos o valor.
					//agora iremos substituir a requisição pela classe criada abaixo.
					req = new MyServletRequestWrapper(req, refreshToken);
				}
		}
		//continua a requisição com o chain, passando nossa request nova:
		chain.doFilter(req, response);
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}



	@Override
	public void destroy() {
		
	}
	
	//a requisição não pode ser alterada, por este motivo, é feito a classe abaixo, um wrapper para substituir a requisição original.
	static class MyServletRequestWrapper extends HttpServletRequestWrapper {
		
		private String refreshToken;
		
		public MyServletRequestWrapper(HttpServletRequest request, String refreshToken) {
			super(request);
			this.refreshToken = refreshToken;
		}
		
		//agora é necessário fazer o override no get parametermap, para quando a requisição for pegar os parametros, pegar o nosso refresh token.
		@Override
		public Map<String, String[]> getParameterMap() {
			ParameterMap<String, String[]> map = new ParameterMap<>(getRequest().getParameterMap());
			map.put("refresh_token", new String[] { refreshToken });
			map.setLocked(true);
			return map;
		}
	}

}
