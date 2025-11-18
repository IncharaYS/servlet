package com.xworkz.coffeeApp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customer", loadOnStartup = 1)
public class CustomerServlet extends HttpServlet {


    public CustomerServlet() {
        System.out.println("Customer servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String mobile=req.getParameter("mobile");
        String flavour=req.getParameter("flavour");
        String quantity=req.getParameter("quantity");
        String paymentMode=req.getParameter("paymentMode");

        Long contactNoLong=Long.parseLong(mobile);
        Integer quantityInt=Integer.parseInt(quantity);

        req.setAttribute("name",name);
        req.setAttribute("mobile",contactNoLong);
        req.setAttribute("flavour",flavour);
        req.setAttribute("quantity",quantityInt);
        req.setAttribute("paymentMode",paymentMode);

        req.getRequestDispatcher("CustomerResponse.jsp").forward(req,resp);
    }
}
