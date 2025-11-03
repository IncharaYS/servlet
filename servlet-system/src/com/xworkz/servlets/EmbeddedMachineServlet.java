package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/embeddedmachine",loadOnStartup = 9)
public class EmbeddedMachineServlet extends GenericServlet {
    public EmbeddedMachineServlet(){
        System.out.println("Embedded machine servlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on embedded machine servlet");
    }
}
