package com.xworkz.bookingapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1,urlPatterns = "/blood")
public class BloodServlet extends HttpServlet {
    public BloodServlet(){
        System.out.println("Blood servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String donorName=req.getParameter("donorName");
        String donorNo=req.getParameter("donorNo");
        String bloodGroup=req.getParameter("bloodGroup");
        String healthInfo=req.getParameter("healthInfo");
        String donationType=req.getParameter("donationType");

        long longDonerNo=Long.parseLong(donorNo);

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();

        writer.println("<html><body>");
        writer.println("<h1 style='color:green'>Details submitted successfully</h1>");
        writer.print("<p>Doner name: "+donorName+"</p>");
        writer.print("<p>Doner number: "+longDonerNo+"</p>");
        writer.print("<p>Blood group: "+bloodGroup+"</p>");
        writer.print("<p>Health Info: "+healthInfo+"</p>");
        writer.print("<p>Donation type: "+donationType+"</p>");
        writer.println("</body></html>");
    }
}
