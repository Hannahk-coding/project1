package com.jw.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle( HttpServletRequest request, HttpServletResponse response, Object handler ) throws Exception {
		
		log.info("==================== BEGIN ====================");
		log.info("Request URI ===> " + request.getRequestURI());
		return true;
	}
	
	@Override
	public void postHandle( HttpServletRequest request
						  , HttpServletResponse response
						  , Object handler
						  , ModelAndView modelAndView ) throws Exception {
		log.info("==================== END ======================");
	}
	
	@Override
	public void afterCompletion( HttpServletRequest request
					           , HttpServletResponse response
					           , Object handler
					           , Exception ex ) throws Exception {
		log.info("===== ===== ===== ===== ===== afterCompletion");
	}
	
}
