package com.xworkz.servlets;

import sun.security.provider.ConfigFile;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/spices",loadOnStartup = 8)
public class SpicesServlet extends GenericServlet {
    public SpicesServlet(){
        System.out.println("Spices servlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on spices servlet");
    }
}
