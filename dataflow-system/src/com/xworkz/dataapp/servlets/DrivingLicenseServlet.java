package com.xworkz.dataapp.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

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

        PrintWriter writer=servletResponse.getWriter();
        servletResponse.setContentType("text/html");

        writer.println("<h2>Driving license response submitted successfully<br></h2>");
        writer.println("<h3>Driving license details are:<br></h3>");
        writer.println("<p>First name:"+servletRequest.getParameter("firstName")+"<br></p>");
        writer.println("<p>Last name:"+servletRequest.getParameter("lastName")+"<br></p>");
        writer.println("<p>Age:"+servletRequest.getParameter("age")+"<br></p>");
        writer.println("<p>Gender:"+servletRequest.getParameter("gender")+"<br></p>");
        writer.println("<p>Date of birth:"+servletRequest.getParameter("dob")+"<br></p>");
        writer.println("<p>Place of Birth:"+servletRequest.getParameter("placeOfBirth")+"<br></p>");
        writer.println("<p>Permanent address:"+servletRequest.getParameter("permanentAddress")+"<br></p>");
        writer.println("<p>Temporary address:"+servletRequest.getParameter("tempAddress")+"<br></p>");
        writer.println("<p>Contact number:"+servletRequest.getParameter("contactNo")+"<br></p>");
        writer.println("<p>Email:"+servletRequest.getParameter("email")+"<br></p>");
        writer.println("<p>Blood group:"+servletRequest.getParameter("bloodGroup")+"<br></p>");
        writer.println("<p>Aadhaar number:"+servletRequest.getParameter("aadhaarNo")+"<br></p>");
        writer.println("<p>Had licence previously?:"+servletRequest.getParameter("previousLicense")+"<br></p>");
        writer.println("<p>State:"+servletRequest.getParameter("state")+"<br></p>");
        writer.println("<p>License type:"+servletRequest.getParameter("licenseType")+"<br></p>");


    }
}
