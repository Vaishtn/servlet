package com.xworkz.hibernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.hibernate.dao.CompanyDAO;
import com.xworkz.hibernate.dao.CompanyDAOImpl;
import com.xworkz.hibernate.entity.CompanyEntity;
import com.xworkz.hibernate.service.CompanyService;
import com.xworkz.hibernate.service.CompanyServiceImpl;

public class CompanyServlet extends HttpServlet{
	
	
	private CompanyService service;
	
	public CompanyServlet() {
		System.out.println("Created"+this.getClass().getSimpleName());
		
	}
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	this.service=new CompanyServiceImpl();
	System.out.println("invoked ");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
		System.out.println(req);
		String nameFromRequest = req.getParameter("name");
		String phoneFromRequest = req.getParameter("phone");
		String companyFromRequest = req.getParameter("company");
		String emailFromRequest = req.getParameter("email");
		String aboutFromRequest = req.getParameter("text");

		
		resp.setContentType("text/html");
		PrintWriter write = resp.getWriter();
		write.println("<html>");
		write.println("<body>");
		write.println("<h1>");
		write.println("Registration");
		write.println("</h1>");

		write.println("</br>");
		write.println("<b>");

		write.println("Register Successful for name " + nameFromRequest + "phone" + phoneFromRequest+"company"+companyFromRequest+"email"+emailFromRequest+"tell me about your project"+aboutFromRequest);
		

		write.println("</b>");
		write.println("<a href=index.html>submitt another response</a>");
		
	      
		write.println("</body>");
		write.println("</html>");
		write.flush();
		
		
		CompanyEntity entity=new CompanyEntity();
	    entity.setId(2);
	    entity.setName(nameFromRequest);
	    entity.setCompany(companyFromRequest);
	    entity.setEmail(emailFromRequest);
	    entity.setPhone(phoneFromRequest);
	    
	    CompanyDAO dao=new CompanyDAOImpl();
	    dao.create(entity);
	    
	   
       boolean save= service.validAndSave(entity);
       if(save) {
    	   System.out.println("data saved successfully");
    	   write.println("data saved successfully");
    	   
       }
       else {
    	   System.out.println("data couldnt save");
    	   write.println("data save failure");
    	   
       }
    

   	
		}

		
	}

	

