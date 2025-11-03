package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/bank",loadOnStartup = 98)
public class BankServlet extends GenericServlet {
    public BankServlet(){
        System.out.println("Bank servlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on bank servlet");
    }
}
