package com.xworkz.dataapp.servlets.realestate;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

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
    }
}
