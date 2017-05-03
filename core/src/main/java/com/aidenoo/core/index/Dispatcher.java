package com.aidenoo.core.index;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/index.do")
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = -8883010093370255561L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws IOException {
		PrintWriter out = responce.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>It Works !!!</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
