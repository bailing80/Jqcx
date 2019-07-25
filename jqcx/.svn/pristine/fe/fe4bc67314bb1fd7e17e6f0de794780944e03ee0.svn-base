package com.xm.xmap1702044.interceptor;

import com.xm.xm.util.StringUtils;
import com.xm.xm.util.SysConst;
import com.xm.xmap1702044.commons.scan.Authorization;
import com.xm.xmap1702044.model.TokenModel;
import com.xm.xmap1702044.service.TokenManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 鉴权
 * 拦截器，用来生成或去除token
 * @author
 */
public class CsrfInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private TokenManager manager;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (!(handler instanceof HandlerMethod)) {
			return true;
		}
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Method method = handlerMethod.getMethod();
		//从header中得到token
		String authorization = request.getHeader(SysConst.AUTHORIZATION);
		if (StringUtils.isEmpty(authorization)) {
			authorization = request.getHeader(SysConst.AUTHORIZATION.toUpperCase());
		}
		//验证token
		TokenModel model = manager.getToken(authorization);
		if (manager.checkToken(model)) {
			//如果token验证成功，将token对应的用户id存在request中，便于之后注入
			request.setAttribute(SysConst.CURRENT_USER_ID, model.getUserId());
			request.setAttribute(SysConst.CURRENT_USER, model);
			return true;
		}
		//如果验证token失败，并且方法注明了Authorization，返回401错误
		if (method.getAnnotation(Authorization.class) != null) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return false;
		}
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		return false;
	}

	/**
	 * todo
	 * 用于清理token保证只能请求成功一次
	 */
/*
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		// 非控制器请求直接跳出
		if (!(handler instanceof HandlerMethod)) {
			return;
		}
		Tok csrfToken = handlerMethod.getMethodAnnotation(CsrfToken.class);
		if (csrfToken == null || !csrfToken.remove()) {
			return;
		}
		csrfTokenRepository.getRemoveCacheUrl(request, response);
		csrfTokenRepository.saveToken(null, request, response);
	}
*/


}
