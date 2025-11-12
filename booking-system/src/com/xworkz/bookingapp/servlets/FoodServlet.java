package com.xworkz.bookingapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1, urlPatterns = "/food")
public class FoodServlet extends HttpServlet {
    public FoodServlet() {
        System.out.println("Food servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String customerName = req.getParameter("customerName");
        String contactNumber = req.getParameter("contactNumber");
        String foodItem = req.getParameter("foodItem");
        String instructions = req.getParameter("instructions");
        String orderType = req.getParameter("orderType");

        long longContactNo = Long.parseLong(contactNumber);


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
        writer.println("<title>Food Order Details</title>");
        writer.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css'>");
        writer.println("</head>");
        writer.println("<body class='bg-success-subtle'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg border-warning'>");
        writer.println("<div class='card-header bg-success text-white text-center'>");
        writer.println("<h2>Food Order Details Submitted</h2>");
        writer.println("</div>");
        writer.println("<div class='card-body'>");

        writer.println("<p><strong>Customer Name:</strong> " + customerName + "</p>");
        writer.println("<p><strong>Contact Number:</strong> " + longContactNo + "</p>");
        writer.println("<p><strong>Food Item:</strong> " + foodItem + "</p>");
        writer.println("<p><strong>Special Instructions:</strong> " + instructions + "</p>");
        writer.println("<p><strong>Order Type:</strong> " + orderType + "</p>");
        writer.println("</div>");

        writer.println("<div class='card-footer text-center'>");
        writer.println("<a href='food-order.html' class='btn btn-secondary'>Order Again</a>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("</div>");

        writer.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js'></script>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
