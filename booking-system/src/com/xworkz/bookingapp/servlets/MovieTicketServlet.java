package com.xworkz.bookingapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1, urlPatterns = "/movie")
public class MovieTicketServlet extends HttpServlet {
    public MovieTicketServlet() {
        System.out.println("Movie servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String phoneNo = req.getParameter("phoneNo");
        String movieName = req.getParameter("movieName");
        String specialRequests = req.getParameter("specialRequests");
        String seatType = req.getParameter("seatType");

        long longPhoneNo = Long.parseLong(phoneNo);

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
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<meta charset='UTF-8'>");
        writer.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        writer.println("<title>Movie Ticket Details</title>");
        writer.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css'>");
        writer.println("</head>");
        writer.println("<body class='bg-success-subtle'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg border-success'>");
        writer.println("<div class='card-header bg-success text-white text-center'>");
        writer.println("<h2>Movie Ticket Details Submitted</h2>");
        writer.println("</div>");
        writer.println("<div class='card-body'>");

        writer.println("<p><strong>Name:</strong> " + name + "</p>");
        writer.println("<p><strong>Phone Number:</strong> " + longPhoneNo + "</p>");
        writer.println("<p><strong>Movie Name:</strong> " + movieName + "</p>");
        writer.println("<p><strong>Special Requests:</strong> " + specialRequests + "</p>");
        writer.println("<p><strong>Seat Type:</strong> " + seatType + "</p>");
        writer.println("</div>");

        writer.println("<div class='card-footer text-center'>");
        writer.println("<a href='movie-ticket-booking.html' class='btn btn-success'>Book Another Ticket</a>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("</div>");

        writer.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js'></script>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
