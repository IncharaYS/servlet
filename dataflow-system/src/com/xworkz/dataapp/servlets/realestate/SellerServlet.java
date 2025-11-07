package com.xworkz.dataapp.servlets.realestate;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(urlPatterns = "/seller",loadOnStartup = 2)
public class SellerServlet extends GenericServlet {
    public SellerServlet(){
        System.out.println("Seller servlet instance created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on seller servlet \n");

        System.out.println("Seller details are:");
        System.out.println("Seller Name:"+servletRequest.getParameter("sellerName"));
        System.out.println("Contact number:"+servletRequest.getParameter("contactNo"));
        System.out.println("Email:"+servletRequest.getParameter("email"));
        System.out.println("Property address:"+servletRequest.getParameter("propertyAddress"));
        System.out.println("Property type:"+servletRequest.getParameter("propertyType"));
        System.out.println("Property size:"+servletRequest.getParameter("size")+"sq ft");
        System.out.println("Price:"+servletRequest.getParameter("price"));
        System.out.println("City:"+servletRequest.getParameter("city"));
        System.out.println("Property age:"+servletRequest.getParameter("propertyAge"));
        System.out.println("Additional notes:"+servletRequest.getParameter("additional")+"\n");

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();

        writer.println("<h2>Seller details submitted successfully<br></h2>");
        writer.println("<h3>Seller details are:<br></h3>");
        writer.println("<p>Seller Name:"+servletRequest.getParameter("sellerName")+"<br></p>");
        writer.println("<p>Contact number:"+servletRequest.getParameter("contactNo")+"<br></p>");
        writer.println("<p>Email:"+servletRequest.getParameter("email")+"<br></p>");
        writer.println("<p>Property address:"+servletRequest.getParameter("propertyAddress")+"<br></p>");
        writer.println("<p>Property type:"+servletRequest.getParameter("propertyType")+"<br></p>");
        writer.println("<p>Property size:"+servletRequest.getParameter("size")+"sq ft<br></p>");
        writer.println("<p>Price:"+servletRequest.getParameter("price")+"<br></p>");
        writer.println("<p>City:"+servletRequest.getParameter("city")+"<br></p>");
        writer.println("<p>Property age:"+servletRequest.getParameter("propertyAge")+"<br></p>");
        writer.println("<p>Additional notes:"+servletRequest.getParameter("additional")+"<br></p>");


    }
}
