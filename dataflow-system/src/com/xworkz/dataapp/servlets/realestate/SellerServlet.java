package com.xworkz.dataapp.servlets.realestate;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

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
    }
}
