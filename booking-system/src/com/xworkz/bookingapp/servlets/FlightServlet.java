package com.xworkz.bookingapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1,urlPatterns = "/flight")
public class FlightServlet extends HttpServlet {
    public FlightServlet(){
        System.out.println("Flight servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String passengerName=req.getParameter("passengerName");
        String passportNo=req.getParameter("passportNo");
        String destination=req.getParameter("destination");
        String specialAssistance=req.getParameter("specialAssistance");
        String seatPreference=req.getParameter("seatPreference");

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();

        writer.println("<html><body>");
        writer.println("<h1 style='color:green'>Details submitted successfully</h1>");
        writer.print("<p>Passenger Name: "+passengerName+"</p>");
        writer.print("<p>Passport / ID Number: "+passportNo+"</p>");
        writer.print("<p>Destination: "+destination+"</p>");
        writer.print("<p>Special Assistance: "+specialAssistance+"</p>");
        writer.print("<p>Seat Preference: "+seatPreference+"</p>");
        writer.println("</body></html>");
    }
}
