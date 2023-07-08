package me.ssu.originalservlet.container.servlet;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

import java.util.Set;

public class JakartaHandlesTypesAnnotationServlet implements ServletContainerInitializer {
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		System.out.println("MyContainerInitV1.onStartup");
		System.out.println("MyContainerInitV1 c = " + c);
		System.out.println("MyContainerInitV1 ctx = " + ctx);
	}
}