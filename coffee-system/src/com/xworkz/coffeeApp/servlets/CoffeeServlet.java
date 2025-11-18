package com.xworkz.coffeeApp.servlets;

import com.xworkz.coffeeApp.DTO.CoffeeDTO;
import com.xworkz.coffeeApp.service.CoffeeService;
import com.xworkz.coffeeApp.service.CoffeeServiceImpl;

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

        double priceDouble=Double.parseDouble(price);
        int quantityInt=Integer.parseInt(quantity);
        Double totalPrice=priceDouble*quantityInt;

        req.setAttribute("type",type);
        req.setAttribute("price",totalPrice);
        req.setAttribute("quantity",quantity);
        req.setAttribute("farmer",farmer);
        req.setAttribute("location",location);

        CoffeeDTO coffeeDTO=new CoffeeDTO(type,priceDouble,quantityInt,farmer,location);
        CoffeeService coffeeService=new CoffeeServiceImpl();
        coffeeService.validateAndSave(coffeeDTO);

        req.getRequestDispatcher("CoffeeResponse.jsp").forward(req,resp);

    }
}
