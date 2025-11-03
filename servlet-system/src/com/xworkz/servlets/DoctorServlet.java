package com.xworkz.servlets;

import javax.print.Doc;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/doctor",loadOnStartup = 0)
public class DoctorServlet extends GenericServlet {
    public DoctorServlet(){
        System.out.println("Doctor servlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on doctor servlet");
    }
}
