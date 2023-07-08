package me.ssu.originalservlet.container;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;

import java.util.Set;

public class JakartaHandlesTypesAnnotationServletContainer implements ServletContainerInitializer {
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) {
		System.out.println("JakartaHandlesTypesAnnotationServlet.onStartup");
		System.out.println("JakartaHandlesTypesAnnotationServlet c = " + c);
		System.out.println("JakartaHandlesTypesAnnotationServlet ctx = " + ctx);
	}
}
