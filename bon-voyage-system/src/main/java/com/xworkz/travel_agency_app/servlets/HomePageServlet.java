package com.xworkz.travel_agency_app.servlets;

import com.mysql.cj.Session;
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
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = "/home",loadOnStartup = 1)
public class HomePageServlet extends HttpServlet {
    private static TravelAgencyService travelAgencyService=new TravelAgencyServiceImpl();
    public HomePageServlet(){
        System.out.println("Home page servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email=req.getSession().getAttribute("userEmail").toString();
        SearchDTO searchDTO=new SearchDTO(email,null,null,null);

         Optional<TravelAgencyDTO> userInfo=travelAgencyService.validateAndSearchByEmail(searchDTO);

         if(userInfo.isPresent()) req.setAttribute("userInfo",userInfo.get());
         else {
             req.setAttribute("userInfo",null);
             req.setAttribute("userNotFound","User Info is deleted");
         }


        req.getRequestDispatcher("HomePage.jsp").forward(req,resp);
    }
}
