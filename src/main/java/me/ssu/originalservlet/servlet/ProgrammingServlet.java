package me.ssu.originalservlet.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 서블릿 초기화 두 번째 방법, 프로그래밍 방식
 */
public class ProgrammingServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Log : JakartaProgrammingServlet.service");
		response.getWriter().println("HTTP Response : ProgrammingServlet!!!"); // throws IOException
	}
}