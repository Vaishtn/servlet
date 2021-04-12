package com.xworkz.bus.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BusWeb extends HttpServlet {
	public BusWeb() {
		System.out.println("Created Booking"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Registration Done");
		System.out.println(req);
		String sourceFromRequest = req.getParameter("source");
		String destinationFromRequest = req.getParameter("destination");
		String noOfPeopleFromRequest = req.getParameter("noOfPeople");
		String genderFromRequest = req.getParameter("gender");
		String bookedByFromRequest = req.getParameter("bookedBy");
		String busvendorByFromRequest = req.getParameter("busvendor");
		String emailFromRequest = req.getParameter("email");
		String phonenoFromRequest = req.getParameter("phoneno");
		String dateFromRequest = req.getParameter("date");
		String busTypeFromRequest = req.getParameter("busType");



		System.out.println(sourceFromRequest);
		System.out.println(destinationFromRequest);
		System.out.println(noOfPeopleFromRequest);
		System.out.println(genderFromRequest);
		System.out.println(bookedByFromRequest);
		System.out.println(busvendorByFromRequest);
		System.out.println(emailFromRequest);
		System.out.println(phonenoFromRequest);
		System.out.println(dateFromRequest);
		System.out.println(busTypeFromRequest);
		

		resp.setContentType("text/html");
		PrintWriter write = resp.getWriter();
		
		write.println("<html>");
		write.println("<body>");
		write.println("<h1>");
		write.println("Booking is Done");
		write.println("</h1>");

		write.println("</br>");
		write.println("<b>");

		write.println("source" +sourceFromRequest);
		write.println("</br>");
		write.println("source" +destinationFromRequest);
		write.println("</br>");
		write.println("source" +noOfPeopleFromRequest);
		write.println("</br>");
		write.println("source" +genderFromRequest);
		write.println("</br>");
		write.println("source" +bookedByFromRequest);
		write.println("</br>");
		write.println("source" +busvendorByFromRequest);
		write.println("</br>");
		write.println("source" +emailFromRequest);
		write.println("</br>");
		write.println("source" +phonenoFromRequest);
		write.println("</br>");
		write.println("source" +dateFromRequest);
		write.println("</br>");
		write.println("source" +busTypeFromRequest);
		write.println("</br>");
		write.println("Registration is successful");

		

		

		write.println("</b>");

		write.println("</body>");
		write.println("</html>");
		write.flush();


	}

}
