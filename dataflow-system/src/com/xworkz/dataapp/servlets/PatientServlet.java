package com.xworkz.dataapp.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/patient",loadOnStartup = 0)
public class PatientServlet extends GenericServlet {
    public PatientServlet(){
        System.out.println("Patient servlet instance created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on patient servlet \n");

        System.out.println("Patient details are:");
        System.out.println("First name:"+servletRequest.getParameter("firstName"));
        System.out.println("Last name:"+servletRequest.getParameter("lastName"));
        System.out.println("Age:"+servletRequest.getParameter("age"));
        System.out.println("Gender:"+servletRequest.getParameter("gender"));
        System.out.println("Contact number:"+servletRequest.getParameter("contactNo"));
        System.out.println("Email:"+servletRequest.getParameter("email"));
        System.out.println("Blood group:"+servletRequest.getParameter("bloodGroup"));
        System.out.println("Diagnosis:"+servletRequest.getParameter("diagnosis"));
        System.out.println("Consulting doctor:"+servletRequest.getParameter("consultingDoctor"));
        System.out.println("Emergency contact:"+servletRequest.getParameter("emergencyContact")+"\n");
    }
}
