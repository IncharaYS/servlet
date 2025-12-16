package com.xworkz.travel_agency_app.servlets;

import com.xworkz.travel_agency_app.service.TravelAgencyService;
import com.xworkz.travel_agency_app.service.TravelAgencyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/checkEmail",loadOnStartup = 3)
public class EmailCheckServlet extends HttpServlet {

    private static TravelAgencyService travelAgencyService=new TravelAgencyServiceImpl();

    public EmailCheckServlet(){
        System.out.println("Email check servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        boolean exists=travelAgencyService.checkDuplicateEmail(email);
        resp.setContentType("text/plain");
        resp.getWriter().write(String.valueOf(exists));
    }
}
