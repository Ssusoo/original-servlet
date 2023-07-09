package me.ssu.originalservlet.container;


import jakarta.servlet.ServletContext;
import me.ssu.originalservlet.servlet.ProgrammingServlet;

/**
 * http://localhost:8080/programming-servlet
 */
public class ApplicationContainerInitializer implements ApplicationContainerInitializerImpl {
	@Override
	public void onStartUp(ServletContext servletContext) {
		System.out.println("ProgrammingServletContainerInitializerContainer.onStartUp");

		// 순수 서블릿 코드 등록(프로그래밍 방식)
		var servletRegistration =
				servletContext.addServlet("programmingServlet", new ProgrammingServlet());
		servletRegistration.addMapping("/programming-servlet");
	}
}