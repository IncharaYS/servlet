package com.xworkz.medicalapp.servlets;

import com.xworkz.medicalapp.dto.CustomerDTO;
import com.xworkz.medicalapp.exceptions.DataInvalidException;
import com.xworkz.medicalapp.exceptions.DataNotSavedException;
import com.xworkz.medicalapp.exceptions.DuplicateEmailException;
import com.xworkz.medicalapp.service.MedicalStoreService;
import com.xworkz.medicalapp.service.MedicalStoreServiceImpl;
import com.xworkz.medicalapp.util.NumberFormatCheck;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register",loadOnStartup = 0)
public class RegisterServlet extends HttpServlet {

    static final MedicalStoreService medicalStoreService=new MedicalStoreServiceImpl();


    public RegisterServlet(){
        System.out.println("Register servlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fullName=req.getParameter("fullName");
        String email=req.getParameter("email");
        long phoneNo= NumberFormatCheck.parseLongSafe(req.getParameter("phoneNo"));
        String password=req.getParameter("password");
        int age=NumberFormatCheck.parseIntSafe( req.getParameter("age"));

        CustomerDTO customerDTO=new CustomerDTO(fullName,email,password,phoneNo,age);
        boolean isSaved=false;
        try {
           isSaved= medicalStoreService.validateAndSave(customerDTO);
        }
        catch (DataNotSavedException dnse){

            System.err.println("Data not saved successfully");
            req.setAttribute("failureMsg","Entered data is not saved");
            req.setAttribute("dto",customerDTO);
            req.getRequestDispatcher("Register.jsp").forward(req,resp);
        }

        catch (DataInvalidException eie){
            System.err.println("Invalid data entered");
            req.setAttribute("invalidData","Entered data is invalid");
            req.setAttribute("dto",customerDTO);
            req.getRequestDispatcher("Register.jsp").forward(req,resp);
        }
        catch (DuplicateEmailException dee){
            System.err.println("Data not saved successfully as email is duplicate value");
            req.setAttribute("dupEmail","Entered email is already registered");
            req.setAttribute("dto",customerDTO);
            req.getRequestDispatcher("Register.jsp").forward(req,resp);
        }


        System.out.println(customerDTO);
        req.setAttribute("dto",customerDTO);
        req.setAttribute("successMsg","Customer registered successfully");
        req.getRequestDispatcher("ResponsePage.jsp").forward(req,resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Register.jsp").forward(req,resp);
    }
}
