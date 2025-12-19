package com.xworkz.travel_agency_app.servlets;

import com.xworkz.travel_agency_app.dto.SearchDTO;
import com.xworkz.travel_agency_app.dto.TravelAgencyDTO;
import com.xworkz.travel_agency_app.exceptions.DataInvalidException;
import com.xworkz.travel_agency_app.exceptions.DataNotUpdatedException;
import com.xworkz.travel_agency_app.service.TravelAgencyService;
import com.xworkz.travel_agency_app.service.TravelAgencyServiceImpl;
import com.xworkz.travel_agency_app.util.NumberFormatCheck;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


@WebServlet(urlPatterns = "/update",loadOnStartup = 4)
public class UpdateServlet extends HttpServlet {

    private final TravelAgencyService travelAgencyService=new TravelAgencyServiceImpl();

    public UpdateServlet(){
        System.out.println("Update Servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        SearchDTO searchDTO = new SearchDTO(email,null,null,null);

        Optional<TravelAgencyDTO> userInfo = travelAgencyService.validateAndSearchByEmail(searchDTO);

        if (userInfo.isPresent()) {
            req.setAttribute("userInfo",userInfo.get());
        } else req.setAttribute("failureMsg", "User with entered email not found!");

        req.getRequestDispatcher("Update.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fullName=req.getParameter("fullName");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        long phoneNo= NumberFormatCheck.parseLongSafe(req.getParameter("phoneNo"));
        String country=req.getParameter("country");

        TravelAgencyDTO travelAgencyDTO=new TravelAgencyDTO(fullName,email,password,phoneNo,country,(byte)0);

        try{
            TravelAgencyDTO updatedUser=travelAgencyService.updateUser(travelAgencyDTO);
            req.setAttribute("updatedSuccessfully","User information is updated successfully");
            req.setAttribute("userInfo",updatedUser);
            req.getRequestDispatcher("UpdateResponse.jsp").forward(req,resp);
        }
        catch (DataInvalidException die){
            System.err.println("Data is not valid");
            req.setAttribute("invalidData","Entered data is invalid");
            req.setAttribute("userInfo",travelAgencyDTO);
            req.getRequestDispatcher("Update.jsp").forward(req,resp);
        }
        catch (DataNotUpdatedException dnse) {
            System.err.println("Data is not updated");
            req.setAttribute("dataNotUpdated","Entered data is not updated");
            req.setAttribute("userInfo",travelAgencyDTO);
            req.getRequestDispatcher("Update.jsp").forward(req,resp);
        }

    }
}
