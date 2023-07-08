package me.ssu.originalservlet.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 서블릿 초기화 첫 번째 방법, 어노테이션 초기화 방법
 *
 * http://localhost:8080/test
 * Since:
 * Servlet 3.0
 * See Also:
 * jakarta.servlet.annotation.HandlesTypes
 */
@WebServlet(urlPatterns = "/test")
public class AnnotationServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Log : JakartaHandlesTypesAnnotationServlet.service");
		response.getWriter().println("HTTP Response : annotation"); // throws : IOException
	}
}