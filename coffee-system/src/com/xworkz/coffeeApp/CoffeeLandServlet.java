package com.xworkz.coffeeApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/coffeeLand", loadOnStartup = 1)
public class CoffeeLandServlet extends HttpServlet {

    public CoffeeLandServlet() {
        System.out.println("Coffee land servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String size=req.getParameter("size");
        String totalPlants=req.getParameter("totalPlants");
        String yield=req.getParameter("yield");
        String expenditure=req.getParameter("expenditure");
        String profit=req.getParameter("profit");
        String fertilizer=req.getParameter("fertilizer");

        Long sizeLong=Long.parseLong(size);
        Integer totalPlantsInt=Integer.parseInt(totalPlants);
        Long yeildLong=Long.parseLong(yield);
        Long profitLong=Long.parseLong(profit);
        Long expenditureLong=Long.parseLong(expenditure);
        Long fertilizerQuantity=Long.parseLong(fertilizer);

        req.setAttribute("size",sizeLong);
        req.setAttribute("totalPlants",totalPlantsInt);
        req.setAttribute("yield",yeildLong);
        req.setAttribute("expenditure",expenditureLong);
        req.setAttribute("profit",profitLong);
        req.setAttribute("fertilizer",fertilizerQuantity);

        req.getRequestDispatcher("CoffeeLandResponse.jsp").forward(req,resp);
    }
}
