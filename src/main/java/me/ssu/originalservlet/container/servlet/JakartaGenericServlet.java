package me.ssu.originalservlet.container.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * http://localhost:8080/test
 */
@WebServlet(urlPatterns = "/test")
public class JakartaGenericServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("로그 : JakartaGenericServlet.service");
		response.getWriter().println("HTTP 응답 : test");
	}
}