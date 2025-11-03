package com.xworkz.servlets;

import sun.security.krb5.internal.crypto.Des;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/desert",loadOnStartup = 9)
public class DesertServlet extends GenericServlet {
    public DesertServlet(){
        System.out.println("Desert servlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on desert servlet");
    }
}
