package com.xworkz.coffeeApp.servlets;

import com.xworkz.coffeeApp.DTO.CustomerFeedbackDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback", loadOnStartup = 1)
public class CustomerFeedbackServlet extends HttpServlet {


    public CustomerFeedbackServlet() {
        System.out.println("Customer feedback servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String comments=req.getParameter("comments");
        String rating=req.getParameter("rating");

        Double ratingDouble=Double.parseDouble(rating);

        req.setAttribute("name",name);
        req.setAttribute("email",email);
        req.setAttribute("comments",comments);
        req.setAttribute("rating",ratingDouble);


        CustomerFeedbackDTO customerFeedbackDTO=new CustomerFeedbackDTO(name,email,comments,ratingDouble);


        req.getRequestDispatcher("CustomerFeedbackResponse.jsp").forward(req,resp);
    }
}
