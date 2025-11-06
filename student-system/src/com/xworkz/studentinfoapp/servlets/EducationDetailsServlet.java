package com.xworkz.studentinfoapp.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/educational",loadOnStartup = 1)
public class EducationDetailsServlet extends GenericServlet {
    public EducationDetailsServlet(){
        System.out.println("Education details servlet instance created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on education details servlet \n");

        System.out.println("Education details are:");
        System.out.println("School details:");
        System.out.println("Student name:"+servletRequest.getParameter("studentName1"));
        System.out.println("Year of passout:"+servletRequest.getParameter("yearOfPassoutSslc"));
        System.out.println("Percentage:"+servletRequest.getParameter("percentageSslc")+"% \n");

        System.out.println("PUC details:");
        System.out.println("Student name:"+servletRequest.getParameter("studentName2"));
        System.out.println("Year of passout:"+servletRequest.getParameter("yearOfPassoutPuc"));
        System.out.println("Percentage:"+servletRequest.getParameter("percentagePuc")+"% \n");

        System.out.println("Degree details:");
        System.out.println("Student name:"+servletRequest.getParameter("studentName3"));
        System.out.println("Year of passout:"+servletRequest.getParameter("yearOfPassoutDegree"));
        System.out.println("Stream:"+servletRequest.getParameter("stream"));
        System.out.println("Percentage:"+servletRequest.getParameter("percentageDegree")+"% \n");

        if(servletRequest.getParameter("haveMasters").equals("Yes")) {
            System.out.println("Masters degree details:");
            System.out.println("Student name:" + servletRequest.getParameter("studentName4"));
            System.out.println("Year of passout:" + servletRequest.getParameter("yearOfPassoutMastersDegree"));
            System.out.println("Percentage:" + servletRequest.getParameter("percentageMastersDegree") + "% \n");
        }
    }
}
