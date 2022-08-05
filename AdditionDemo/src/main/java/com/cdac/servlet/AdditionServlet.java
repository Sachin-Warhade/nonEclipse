package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/accept")
public class AdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html"); // setting up header response
		PrintWriter pw = response.getWriter();

		int fnum = Integer.parseInt(request.getParameter("txtFnum"));
		int snum = Integer.parseInt(request.getParameter("txtSnum"));
		int ans = fnum + snum;

		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		
		pw.println("<title>SUM DEMO</title>");
		
		pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		pw.println("<link rel=\"stylesheet\"\r\n"
				+ "	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
		pw.println("<script\r\n"
				+ "	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>");
		pw.println("<script\r\n"
				+ "	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
		
		pw.println("</head>");

		pw.println("<body>");
		pw.println("<div class=\"container\">");

		pw.println("<h1 style=color:green> Sum of " + fnum + " and " + snum + " is " + ans + "</h1>");

		pw.println("</body>");
		pw.println("</html>");
	}
}
