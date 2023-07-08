package me.ssu.originalservlet.container;

import jakarta.servlet.ServletContext;
import me.ssu.originalservlet.servlet.JakartaProgrammingServlet;

/**
 * http://localhost:8080/application-servlet
 */
public class ApplicationInitializerServletContainer implements ApplicationInitializer {
	@Override
	public void onStartUp(ServletContext servletContext) {
		System.out.println("ApplicationInitializerServletContainer.onStartUp");

		// 순수 서블릿 코드 등록(프로그래밍 방식)
		var servletRegistration =
				servletContext.addServlet("jakartaProgrammingServlet", new JakartaProgrammingServlet());
		servletRegistration.addMapping("/jakartaProgrammingServlet-servlet");
	}
}