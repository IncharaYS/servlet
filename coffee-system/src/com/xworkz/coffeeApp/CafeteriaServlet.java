package com.xworkz.coffeeApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cafeteria",loadOnStartup = 2)
public class CafeteriaServlet extends HttpServlet {
    public CafeteriaServlet(){
        System.out.println("Cafeteria servlet instance created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
