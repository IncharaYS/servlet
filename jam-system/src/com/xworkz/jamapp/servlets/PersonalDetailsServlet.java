package com.xworkz.jamapp.servlets;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 0,urlPatterns = "/personalDetails")
public class PersonalDetailsServlet extends HttpServlet {


    public PersonalDetailsServlet(){
        System.out.println("Personal details servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String phoneNo=req.getParameter("phoneNo");
        String email=req.getParameter("email");
        String gender=req.getParameter("gender");

        long phoneNoLong=Long.parseLong(phoneNo);

        req.setAttribute("name",name);
        req.setAttribute("phoneNo",phoneNoLong);
        req.setAttribute("email",email);
        req.setAttribute("gender",gender);


        //servlet chaining,request dispatching,forwarding
        RequestDispatcher requestDispatcher =req.getRequestDispatcher("ContactDetails.jsp");
        requestDispatcher.forward(req,resp);
    }
}
