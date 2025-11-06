package com.xworkz.dataapp.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/drivingLicense",loadOnStartup = 1)
public class DrivingLicenseServlet extends GenericServlet {
    public DrivingLicenseServlet(){
        System.out.println("Driving license servlet created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on driving license servlet \n");

        System.out.println("Driving license details are:");
        System.out.println("First name:"+servletRequest.getParameter("firstName"));
        System.out.println("Last name:"+servletRequest.getParameter("lastName"));
        System.out.println("Age:"+servletRequest.getParameter("age"));
        System.out.println("Gender:"+servletRequest.getParameter("gender"));
        System.out.println("Date of birth:"+servletRequest.getParameter("dob"));
        System.out.println("Place of Birth:"+servletRequest.getParameter("placeOfBirth"));
        System.out.println("Permanent address:"+servletRequest.getParameter("permanentAddress"));
        System.out.println("Temporary address:"+servletRequest.getParameter("tempAddress"));
        System.out.println("Contact number:"+servletRequest.getParameter("contactNo"));
        System.out.println("Email:"+servletRequest.getParameter("email"));
        System.out.println("Blood group:"+servletRequest.getParameter("bloodGroup"));
        System.out.println("Aadhaar number:"+servletRequest.getParameter("aadhaarNo"));
        System.out.println("Had licence previously?:"+servletRequest.getParameter("previousLicense"));
        System.out.println("State:"+servletRequest.getParameter("state"));
        System.out.println("License type:"+servletRequest.getParameter("licenseType")+"\n");
    }
}
