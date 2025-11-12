package com.xworkz.bookingapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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

        Cookie[] cookies=req.getCookies();
        if (cookies==null || cookies.length==0){
            System.out.println("Add product cookie before request");
            throw new IllegalArgumentException("Missing cookie");
        }
        else {
            for (Cookie cookie:cookies){
                System.out.println("Cookie name:"+cookie.getName());
                System.out.println("Cookie value:"+cookie.getValue());
            }
        }

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<meta charset='UTF-8'>");
        writer.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        writer.println("<title>Flight Booking Details</title>");
        writer.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css'>");
        writer.println("</head>");
        writer.println("<body class='bg-success-subtle'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg border-info'>");
        writer.println("<div class='card-header bg-success text-white text-center'>");
        writer.println("<h2>Flight Booking Details Submitted</h2>");
        writer.println("</div>");
        writer.println("<div class='card-body'>");

        writer.println("<p><strong>Passenger Name:</strong> " + passengerName + "</p>");
        writer.println("<p><strong>Passport / ID Number:</strong> " + passportNo + "</p>");
        writer.println("<p><strong>Destination:</strong> " + destination + "</p>");
        writer.println("<p><strong>Special Assistance:</strong> " + specialAssistance + "</p>");
        writer.println("<p><strong>Seat Preference:</strong> " + seatPreference + "</p>");
        writer.println("</div>");

        writer.println("<div class='card-footer text-center'>");
        writer.println("<a href='flight-booking.html' class='btn btn-secondary'>Book Another Flight</a>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("</div>");

        writer.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js'></script>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
