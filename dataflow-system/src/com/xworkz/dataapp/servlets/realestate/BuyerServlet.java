package com.xworkz.dataapp.servlets.realestate;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/buyer",loadOnStartup = 2)
public class BuyerServlet extends GenericServlet {
    public BuyerServlet(){
        System.out.println("Buyer servlet instance created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on buyer servlet \n");

        System.out.println("Buyer details are:");
        System.out.println("Buyer Name:"+servletRequest.getParameter("buyerName"));
        System.out.println("Contact number:"+servletRequest.getParameter("contactNo"));
        System.out.println("Email:"+servletRequest.getParameter("email"));
        System.out.println("Preferred location:"+servletRequest.getParameter("preferredLocation"));
        System.out.println("Preferred size:"+servletRequest.getParameter("preferredSize")+"sq ft");
        System.out.println("Property type:"+servletRequest.getParameter("propertyType"));
        System.out.println("Budget:"+servletRequest.getParameter("budget"));
        System.out.println("Move in Date:"+servletRequest.getParameter("moveInDate"));
        System.out.println("City:"+servletRequest.getParameter("city"));
        System.out.println("Additional requirements:"+servletRequest.getParameter("additional")+"\n");

        PrintWriter writer=servletResponse.getWriter();
        servletResponse.setContentType("text/html");

        writer.println("<h2>Buyer details submitted successfully<br></h2>");
        writer.println("<h3>Buyer details are:<br></h3>");
        writer.println("<p>Buyer Name:"+servletRequest.getParameter("buyerName")+"<br></p>");
        writer.println("<p>Contact number:"+servletRequest.getParameter("contactNo")+"<br></p>");
        writer.println("<p>Email:"+servletRequest.getParameter("email")+"<br></p>");
        writer.println("<p>Preferred location:"+servletRequest.getParameter("preferredLocation")+"<br></p>");
        writer.println("<p>Preferred size:"+servletRequest.getParameter("preferredSize")+"sq ft<br></p>");
        writer.println("<p>Property type:"+servletRequest.getParameter("propertyType")+"<br></p>");
        writer.println("<p>Budget:"+servletRequest.getParameter("budget")+"<br></p>");
        writer.println("<p>Move in Date:"+servletRequest.getParameter("moveInDate")+"<br></p>");
        writer.println("<p>City:"+servletRequest.getParameter("city")+"<br></p>");
        writer.println("<p>Additional requirements:"+servletRequest.getParameter("additional")+"<br></p>");

    }
}
