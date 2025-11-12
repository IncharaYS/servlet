package com.xworkz.bookingapp.servlets;

import com.sun.javaws.exceptions.CouldNotLoadArgumentException;

import javax.naming.directory.NoSuchAttributeException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static javafx.application.Platform.exit;

@WebServlet(loadOnStartup = 1, urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    public ProductServlet() {
        System.out.println("Product servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String productName = req.getParameter("productName");
        String price = req.getParameter("price");
        String category = req.getParameter("category");
        String description = req.getParameter("description");
        String availability = req.getParameter("availability");

        double productPrice = Double.parseDouble(price);

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
        writer.println("<title>Product Details</title>");
        writer.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css'>");
        writer.println("</head>");
        writer.println("<body class='bg-success-subtle'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg border-success'>");
        writer.println("<div class='card-header bg-success text-white text-center'>");
        writer.println("<h2>Product Details Submitted</h2>");
        writer.println("</div>");
        writer.println("<div class='card-body'>");

        writer.println("<p><strong>Product Name:</strong> " + productName + "</p>");
        writer.println("<p><strong>Price:</strong>" + productPrice + "</p>");
        writer.println("<p><strong>Category:</strong> " + category + "</p>");
        writer.println("<p><strong>Description:</strong> " + description + "</p>");
        writer.println("<p><strong>Availability:</strong> " + availability + "</p>");
        writer.println("</div>");

        writer.println("<div class='card-footer text-center'>");
        writer.println("<a href='product-booking.html' class='btn btn-success'>Add Another Product</a>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("</div>");

        writer.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js'></script>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
