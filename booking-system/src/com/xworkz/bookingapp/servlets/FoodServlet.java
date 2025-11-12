package com.xworkz.bookingapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1,urlPatterns = "/food")
public class FoodServlet extends HttpServlet {
    public FoodServlet(){
        System.out.println("Food servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String customerName=req.getParameter("customerName");
        String contactNumber=req.getParameter("contactNumber");
        String foodItem=req.getParameter("foodItem");
        String instructions=req.getParameter("instructions");
        String orderType=req.getParameter("orderType");

        long longContactNo=Long.parseLong(contactNumber);

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();

        writer.println("<html><body>");
        writer.println("<h1 style='color:green'>Details submitted successfully</h1>");
        writer.print("<p>Customer Name: "+customerName+"</p>");
        writer.print("<p>Contact Number: "+longContactNo+"</p>");
        writer.print("<p>Food Item: "+foodItem+"</p>");
        writer.print("<p>Instructions: "+instructions+"</p>");
        writer.print("<p>Order Type: "+orderType+"</p>");
        writer.println("</body></html>");
    }
}
