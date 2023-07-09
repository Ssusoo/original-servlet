package me.ssu.originalservlet.container;

import jakarta.servlet.ServletContext;

/**
 * 애플리케이션 초기화 인터페이스 생성
 */
public interface ApplicationContainerInitializerImpl {
	// ServletContext : 서블릿 컨테이너 그 자체(서블릿 등록, 필터 등록할 수 있음)
	void onStartUp(ServletContext servletContext);
}
