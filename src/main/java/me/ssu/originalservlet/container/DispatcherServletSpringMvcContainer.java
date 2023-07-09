package me.ssu.originalservlet.container;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import me.ssu.originalservlet.config.SpringConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * http://localhost:8080/welcome-spring
 */
public class DispatcherServletSpringMvcContainer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("SpringMvcContainer.onStartup");

		// 스프링 컨테이너 생성
		AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();
		springContext.register(SpringConfig.class);

		// 스프링 MVC 디스패처 서블릿 생성, 스프링 컨테이너 연결
		DispatcherServlet dispatcherServlet = new DispatcherServlet(springContext);

		// 디스패처 서블릿을 컨테이너에 등록(이름 주의! dispatcherV2)
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcherV2", dispatcherServlet);

		// 모든 요청이 디스패처 서블릿을 통하도록 설정
		servlet.addMapping("/");
	}
}
