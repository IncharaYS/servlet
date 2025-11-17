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

        Double sizeDouble=Double.parseDouble(size);
        Integer totalPlantsInt=Integer.parseInt(totalPlants);
        Long yeildLong=Long.parseLong(yield);
        Double profitDouble=Double.parseDouble(profit);
        Double expenditureDouble=Double.parseDouble(expenditure);
        Double fertilizerQuantity=Double.parseDouble(fertilizer);

        req.setAttribute("size",sizeDouble);
        req.setAttribute("totalPlants",totalPlantsInt);
        req.setAttribute("yield",yeildLong);
        req.setAttribute("expenditure",expenditureDouble);
        req.setAttribute("profit",profitDouble);
        req.setAttribute("fertilizer",fertilizerQuantity);

        req.getRequestDispatcher("CoffeeLandResponse.jsp").forward(req,resp);
    }
}
