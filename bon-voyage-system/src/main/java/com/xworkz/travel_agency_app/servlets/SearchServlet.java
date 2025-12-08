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
import java.util.Optional;

@WebServlet(urlPatterns = "/search",loadOnStartup = 3)
public class SearchServlet extends HttpServlet {

    TravelAgencyService travelAgencyService=new TravelAgencyServiceImpl();

    public SearchServlet(){
        System.out.println("Search servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("Search.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email=req.getParameter("email");
        SearchDTO searchDTO=new SearchDTO(email);

        Optional<TravelAgencyDTO> userInfo=travelAgencyService.validateAndSearchByEmail(searchDTO);

        if(userInfo.isPresent()){
            req.setAttribute("userInfo",userInfo.get());
        }
        else req.setAttribute("failureMsg","User with entered email not found!");

        req.getRequestDispatcher("Search.jsp").forward(req,resp);
    }
}
