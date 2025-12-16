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
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = "/search",loadOnStartup = 3)
public class SearchServlet extends HttpServlet {

    private TravelAgencyService travelAgencyService = new TravelAgencyServiceImpl();

    public SearchServlet() {
        System.out.println("Search servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        String searchBy = req.getParameter("searchBy");
        String searchByValue = req.getParameter("searchByValue");
        if ("Submit".equalsIgnoreCase(action)) {

            if ("email".equalsIgnoreCase(searchBy)) {
                SearchDTO searchDTO = new SearchDTO(searchByValue, null, null, null);
                Optional<TravelAgencyDTO> userInfo = travelAgencyService.validateAndSearchByEmail(searchDTO);
                if (userInfo.isPresent()) {
                    req.setAttribute("userInfo",
                            Collections.singletonList(userInfo.get()));
                } else {
                    req.setAttribute("failureMsg", "User with entered email not found!");
                    req.setAttribute("userInfo", Collections.emptyList());
                }
            }

            if ("name".equalsIgnoreCase(searchBy)) {
                SearchDTO searchDTO = new SearchDTO(null, searchByValue, null, null);
                List<TravelAgencyDTO> userInfo = travelAgencyService.validateAndSearchByName(searchDTO);

                if (!userInfo.isEmpty())
                {
                    req.setAttribute("userInfo", userInfo);
                } else req.setAttribute("failureMsg", "User with entered name not found!");

            }

            if ("phoneNo".equalsIgnoreCase(searchBy)) {
                SearchDTO searchDTO = new SearchDTO(null, null  , searchByValue, null);
                List<TravelAgencyDTO> userInfo = travelAgencyService.validateAndSearchByPhoneNo(searchDTO);

                if (!userInfo.isEmpty())
                {
                    req.setAttribute("userInfo", userInfo);
                } else req.setAttribute("failureMsg", "User with entered phone number not found!");

            }


            if ("country".equalsIgnoreCase(searchBy)) {
                SearchDTO searchDTO = new SearchDTO(null, null, null, searchByValue);
                List<TravelAgencyDTO> userInfo = travelAgencyService.validateAndSearchByCountry(searchDTO);

                if (!userInfo.isEmpty())
                {
                    System.out.println(userInfo);
                    req.setAttribute("userInfo", userInfo);
                } else req.setAttribute("failureMsg", "User with country name not found!");

            }


            if ("Clear".equalsIgnoreCase(action)) {
                System.out.println("Clear logic");
                req.setAttribute("userInfo", null);
            }

        }
        req.getRequestDispatcher("Search.jsp").forward(req, resp);
    }
}
