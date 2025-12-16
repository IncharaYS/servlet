package com.xworkz.travel_agency_app.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/logout",loadOnStartup=0)
public class LogoutServlet extends HttpServlet {
    public LogoutServlet(){
        System.out.println("Logout servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session!=null) {
            session.removeAttribute("userEmail");
            session.removeAttribute("userName");
            session.invalidate();
        }
        resp.sendRedirect("index.jsp");

    }
}
