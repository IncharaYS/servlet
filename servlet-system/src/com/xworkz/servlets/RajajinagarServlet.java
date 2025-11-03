package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/rajajinagar",loadOnStartup = 9)
public class RajajinagarServlet extends GenericServlet {
    public RajajinagarServlet(){
        System.out.println("Rajajinagar servlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on Rajajinagar servlet");
    }
}
