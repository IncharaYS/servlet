package com.xworkz.bookingapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1,urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    public ProductServlet(){
        System.out.println("Product servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String productName=req.getParameter("productName");
        String price=req.getParameter("price");
        String category=req.getParameter("category");
        String description=req.getParameter("description");
        String availability=req.getParameter("availability");

        double productPrice=Double.parseDouble(price);

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();

        writer.println("<html><body>");
        writer.println("<h1 style='color:green'>Details submitted successfully</h1>");
        writer.print("<p>Product Name: "+productName+"</p>");
        writer.print("<p>Price: "+productPrice+"</p>");
        writer.print("<p>Category: "+category+"</p>");
        writer.print("<p>Description: "+description+"</p>");
        writer.print("<p>Availability: "+availability+"</p>");
        writer.println("</body></html>");
    }
}
