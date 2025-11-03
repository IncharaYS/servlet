package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/factory",loadOnStartup = 56)
public class FactoryServlet extends GenericServlet {
    public FactoryServlet(){
        System.out.println("Factory servlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running servlet on factory servlet");
    }
}
