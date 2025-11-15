package com.xworkz.registrationApp.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1,urlPatterns = "/passportseva")
public class PassportSevaServlet extends HttpServlet {
    public PassportSevaServlet(){
        System.out.println("Passport seva servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();

        String applyAt=req.getParameter("applyAt");
        String passportOffice=req.getParameter("passportOffice");
        String givenName=req.getParameter("givenName");
        String surName=req.getParameter("surName");
        String dateOfBirth=req.getParameter("dateOfBirth");
        String email=req.getParameter("email");
        String sameLoginId=req.getParameter("sameLoginId");

        String loginId;
        if (sameLoginId.equals("Yes")) loginId=email;
        else loginId=req.getParameter("loginId");

        String password=req.getParameter("password");
        String confirmPassword=req.getParameter("confirmPassword");
        String hintQuestion=req.getParameter("hintQuestion");
        String hintAnswer=req.getParameter("hintAnswer");
        String captcha=req.getParameter("captcha");

        writer.println("<html><body>");
        writer.println("<h1 style='color:green'>Details submitted successfully</h1>");
        writer.print("<p>Apply at: "+applyAt+"</p>");
        writer.print("<p>Passport office: "+passportOffice+"</p>");
        writer.println("<p>Given name: "+givenName+"</p>");
        writer.println("<p>Sur name: "+surName+"</p>");
        writer.println("<p>Date of birth: "+dateOfBirth+"</p>");
        writer.println("<p>Email: "+email+"</p>");
        writer.println("<p>Login Id: "+loginId+"</p>");
        writer.println("<p>Password: "+password+"</p>");
        writer.println("<p>Hint question: "+hintQuestion+"</p>");
        writer.println("<p>Hint answer: "+hintAnswer+"</p>");
        writer.println("</body></html>");
    }
}

