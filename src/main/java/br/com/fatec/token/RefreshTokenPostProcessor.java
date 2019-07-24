package br.com.fatec.token;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/*
 * Essa classe intercepta a resposta da chamada para receber o token JWT.
 * Por segurança nós iremos remover o Refresh Token do corpo da respota da requisição.
 * O mesmo será adicionado em um cookie que a aplicação angular não terá acesso.
 */

@ControllerAdvice
public class RefreshTokenPostProcessor implements ResponseBodyAdvice<OAuth2AccessToken>{

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		// este método caso retorne true, irá passar no beforeBodyWrite, por isso ele verifica o método se é o post no access/token.
		return returnType.getMethod().getName().equals("postAccessToken");
	}

	@Override
	public OAuth2AccessToken beforeBodyWrite(OAuth2AccessToken body, MethodParameter returnType,
			MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType,
			ServerHttpRequest request, ServerHttpResponse response) {
		
		HttpServletRequest req = ((ServletServerHttpRequest) request).getServletRequest();
		HttpServletResponse resp = ((ServletServerHttpResponse) response).getServletResponse();
		
		DefaultOAuth2AccessToken token = (DefaultOAuth2AccessToken) body;
		// pega o refresh token que seria retornado no corpo da resposta
		String refreshToken = body.getRefreshToken().getValue();
		
		// chama o método que irá adicionar o refresh token no cookie
		insertRefreshTokenOnCookie(refreshToken, req, resp);
		
		// após adicionar no cookie, remove o refresh token do body
		removeRefreshTokenFromBody(token);
		
		return body;
	}

	private void removeRefreshTokenFromBody(DefaultOAuth2AccessToken token) {
		token.setRefreshToken(null);
		
	}

	private void insertRefreshTokenOnCookie(String refreshToken, HttpServletRequest req, HttpServletResponse resp) {
		Cookie refreshTokenCookie = new Cookie("refreshToken", refreshToken);
		
		refreshTokenCookie.setHttpOnly(true);
		refreshTokenCookie.setSecure(false); //TODO: Mudar para true em produção
		refreshTokenCookie.setPath(req.getContextPath() + "/oauth/token");
		refreshTokenCookie.setMaxAge(2592000); //30 dias para expirar
		
		resp.addCookie(refreshTokenCookie);
	}



}
