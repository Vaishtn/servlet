package com.xworkz.it.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompanyWeb extends HttpServlet {
	public CompanyWeb() {
		System.out.println("create" + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doGet from Company");
		System.out.println(req);
		String nameFromRequest = req.getParameter("name");
		String phoneFromRequest = req.getParameter("phone");
		System.out.println(phoneFromRequest);
		System.out.println(nameFromRequest);
		resp.setContentType("text/html");
		PrintWriter write = resp.getWriter();
		write.println("<html>");
		write.println("<body>");
		write.println("<h1>");
		write.println("Company Application");
		write.println("</h1>");

		write.println("</br>");
		write.println("<b>");

		write.println("Name " + nameFromRequest  );
		write.println(" Phone no: " + phoneFromRequest );
		write.println(" The data is Stored");


		write.println("</b>");

		write.println("</body>");
		write.println("</html>");
		write.flush();

	}

}
