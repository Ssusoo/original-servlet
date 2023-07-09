package me.ssu.originalservlet.container;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;

import java.util.Set;

public class AnnotationServletContainer implements ServletContainerInitializer {
	@Override
	public void onStartup(Set<Class<?>> classes, ServletContext servletContext) {
		System.out.println("AnnotationServlet.onStartup");
		System.out.println("AnnotationServlet classes = " + classes);
		System.out.println("AnnotationServlet servletContext = " + servletContext);
	}
}
