package com.xworkz.studentinfoapp.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/personal",loadOnStartup = 0)
public class PersonalInfoServlet extends GenericServlet {
    public PersonalInfoServlet(){
        System.out.println("PersonalInfo servlet instance created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in personal info servlet \n");

        System.out.println("Personal details are:");
        System.out.println("Name:"+servletRequest.getParameter("name"));
        System.out.println("Email:"+servletRequest.getParameter("email"));
        System.out.println("Mobile number:"+servletRequest.getParameter("mobileNo"));
        System.out.println("Age:"+servletRequest.getParameter("age"));
        System.out.println("Address:"+servletRequest.getParameter("address"));
        System.out.println("Gender:"+servletRequest.getParameter("gender"));
        System.out.println("Date of birth:"+servletRequest.getParameter("dateOfBirth"));
        System.out.println("Marital status:"+servletRequest.getParameter("status"));
    }
}
