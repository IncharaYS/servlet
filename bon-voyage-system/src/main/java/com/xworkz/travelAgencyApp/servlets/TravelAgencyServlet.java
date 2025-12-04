package com.xworkz.travelAgencyApp.servlets;

import com.xworkz.travelAgencyApp.dto.TravelAgencyDTO;
import com.xworkz.travelAgencyApp.exceptions.DataInvalidException;
import com.xworkz.travelAgencyApp.exceptions.DataNotSavedException;
import com.xworkz.travelAgencyApp.exceptions.DuplicateEmailException;
import com.xworkz.travelAgencyApp.service.TravelAgencyService;
import com.xworkz.travelAgencyApp.service.TravelAgencyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/travelagency",loadOnStartup = 1)
public class TravelAgencyServlet extends HttpServlet {

    TravelAgencyService travelAgencyService=new TravelAgencyServiceImpl();


    public TravelAgencyServlet(){
        System.out.println("Travel Agency Servlet created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("TravelAgency.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String fullName=req.getParameter("fullName");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        long phoneNo=Long.parseLong(req.getParameter("phoneNo"));
        String country=req.getParameter("country");

        TravelAgencyDTO travelAgencyDTO=new TravelAgencyDTO(fullName,email,password,phoneNo,country);

        System.out.println(travelAgencyDTO);

        try{
            travelAgencyService.validateAndSave(travelAgencyDTO);
            req.setAttribute("successMsg","Data Saved Successfully");
            req.setAttribute("dto",travelAgencyDTO);

        }
        catch(DataInvalidException die){
            System.err.println("Invalid data entered");
            req.setAttribute("failureMsg","Entered data is invalid");
        }
        catch (DataNotSavedException dnse){
            System.err.println("Data not saved successfully");
            req.setAttribute("failureMsg","Entered data is not saved");
        }
        catch (DuplicateEmailException dee){
            System.err.println("Data not saved successfully as email is duplicate value");
            req.setAttribute("failureMsg","Entered email is already registered");
        }

        System.out.println(travelAgencyDTO);
        req.getRequestDispatcher("TravelAgencyResponse.jsp").forward(req,resp);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }
}
