package com.xworkz.travel_agency_app.servlets;

import com.xworkz.travel_agency_app.dto.SearchDTO;
import com.xworkz.travel_agency_app.dto.TravelAgencyDTO;
import com.xworkz.travel_agency_app.service.TravelAgencyService;
import com.xworkz.travel_agency_app.service.TravelAgencyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Optional;

@WebServlet(urlPatterns = "/delete",loadOnStartup = 2)
public class DeleteServlet extends HttpServlet {

    private static   TravelAgencyService travelAgencyService=new TravelAgencyServiceImpl();
    public DeleteServlet(){
        System.out.println("Delete servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");

        if (email == null || email.isEmpty()) {
            req.setAttribute("deleteFail", "Invalid email");
            req.getRequestDispatcher("Search.jsp").forward(req, resp);
            return;
        }

        boolean isDeleted=travelAgencyService.delete(email);

            if(isDeleted){
                System.out.println("User deleted successfully");
                req.setAttribute("deleteSuccess","User deleted successfully");
            }
            else {
                System.out.println("User not deleted successfully");
                req.setAttribute("deleteFail","User not deleted successfully");
            }

        req.setAttribute("userInfo", Collections.emptyList());
        req.getRequestDispatcher("Search.jsp").forward(req,resp);
    }
}
