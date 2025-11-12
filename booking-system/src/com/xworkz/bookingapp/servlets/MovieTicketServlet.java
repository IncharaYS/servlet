package com.xworkz.bookingapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1,urlPatterns = "/movie")
public class MovieTicketServlet extends HttpServlet {
    public MovieTicketServlet(){
        System.out.println("Movie servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String phoneNo=req.getParameter("phoneNo");
        String movieName=req.getParameter("movieName");
        String specialRequests=req.getParameter("specialRequests");
        String seatType=req.getParameter("seatType");

        long longPhoneNo=Long.parseLong(phoneNo);

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();

        writer.println("<html><body>");
        writer.println("<h1 style='color:green'>Details submitted successfully</h1>");
        writer.print("<p>Name: "+name+"</p>");
        writer.print("<p>Phone Number: "+longPhoneNo+"</p>");
        writer.print("<p>Movie Name: "+movieName+"</p>");
        writer.print("<p>Special Requests: "+specialRequests+"</p>");
        writer.print("<p>Seat Type: "+seatType+"</p>");
        writer.println("</body></html>");
    }
}
