package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(value = "/trainer",loadOnStartup = 0,asyncSupported = true)
public class TrainerServlet extends GenericServlet {
    public TrainerServlet(){
        System.out.println("Trainer servlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on trainer servlet");
    }
}
