package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/hairproducts",loadOnStartup = 9)
public class HairProductsServlet extends GenericServlet {
    public HairProductsServlet(){
        System.out.println("Hair Products servlet constructor ");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on hair products servlet");
    }
}
