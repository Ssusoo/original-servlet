package me.ssu.originalservlet.container;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;

import java.util.Set;

/**
 * 서블릿 초기화 첫 번째 방법, 어노테이션 초기화 방법
 * Since:
 * Servlet 3.0
 * See Also:
 * jakarta.servlet.annotation.HandlesTypes
 */
public class JakartaHandlesTypesAnnotationServlet implements ServletContainerInitializer {
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) {
		System.out.println("JakartaHandlesTypesAnnotationServlet.onStartup");
		System.out.println("JakartaHandlesTypesAnnotationServlet c = " + c);
		System.out.println("JakartaHandlesTypesAnnotationServlet ctx = " + ctx);
	}
}