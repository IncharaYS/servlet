package com.xworkz.coffeeApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/coffee",loadOnStartup = 0)
public class CoffeeServlet extends HttpServlet {
    public CoffeeServlet(){
        System.out.println("Coffee servlet instance created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String type=req.getParameter("coffeeType");
        String price=req.getParameter("price");
        String quantity=req.getParameter("quantity");
        String farmer=req.getParameter("farmer");
        String location=req.getParameter("location");

        Long priceLong=Long.parseLong(price);

        req.setAttribute("type",type);
        req.setAttribute("price",priceLong);
        req.setAttribute("quantity",quantity);
        req.setAttribute("farmer",farmer);
        req.setAttribute("location",location);

        req.getRequestDispatcher("CoffeeResponse.jsp").forward(req,resp);

    }
}
