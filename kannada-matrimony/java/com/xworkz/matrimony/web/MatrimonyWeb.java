package com.xworkz.matrimony.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MatrimonyWeb extends HttpServlet {
	public MatrimonyWeb() {
		System.out.println("create Matrimony data"+this.getClass().getSimpleName());
	}

   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   System.out.println("Registration Done");
		System.out.println(req);
		String nameFromRequest = req.getParameter("firstname");
		String lastFromRequest = req.getParameter("lastname");
		String emailFromRequest = req.getParameter("email");
		String passwordFromRequest = req.getParameter("password");
		String repasswordFromRequest = req.getParameter("repassword");

		System.out.println(nameFromRequest);
		System.out.println(lastFromRequest);
		System.out.println(emailFromRequest);
		System.out.println(passwordFromRequest);
		System.out.println(repasswordFromRequest);

		resp.setContentType("text/html");
		PrintWriter write = resp.getWriter();
		write.println("<html>");
		write.println("<body>");
		write.println("<h1>");
		write.println("Registration");
		write.println("</h1>");

		write.println("</br>");
		write.println("<b>");

		write.println("Register Successful for firstname " + nameFromRequest + "Lastname" + lastFromRequest);
		

		write.println("</b>");

		write.println("</body>");
		write.println("</html>");
		write.flush();

	}
}
