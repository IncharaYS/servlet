package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/metro",loadOnStartup = 8)
public class MetroServlet extends GenericServlet {
    public MetroServlet(){
        System.out.println("Metro servlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running servlet on metro servlet");
    }
}
