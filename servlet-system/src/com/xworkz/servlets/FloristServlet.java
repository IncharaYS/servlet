package com.xworkz.servlets;

import sun.java2d.loops.FillRect;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/florist",loadOnStartup = 0)
public class FloristServlet extends GenericServlet {
    public FloristServlet(){
        System.out.println("Florist servlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on florist servlet");
    }
}
