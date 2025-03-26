package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.test.app.controller.TestController;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter {
	// 특정 주소 요청 (servletcontext.xml) => interceptor preHandle(세션 검사) =>
	// true => controller 요청주소실행 => postHandle
		
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Call preHandle");
		HttpSession session = request.getSession();
		
		if (session.getAttribute("login") == null) {
			// response.sendRedirect("loginForm") 이렇게 하면 무한 재귀 같이 작동함
			// 그 이유는 모든 주소가 preHandle을 거치게 때문에
			System.out.println("정보 없음");
		}
		
		return true;
		// return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("Call postHandle");
		HandlerMethod method = (HandlerMethod)handler;
		
		if (method.getBean() instanceof TestController) {
			System.out.println("if문 실행 testcontroller 요청");
			modelAndView.setViewName("login");
			modelAndView.addObject("data", "사토루");
		}
		// super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("Call afterCompletion");
		// super.afterCompletion(request, response, handler, ex);
	}
}
