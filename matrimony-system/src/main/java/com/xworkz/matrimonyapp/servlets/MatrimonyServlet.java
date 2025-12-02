package com.xworkz.matrimonyapp.servlets;

import com.xworkz.matrimonyapp.dto.MatrimonyDTO;
import com.xworkz.matrimonyapp.exceptions.DataInvalidException;
import com.xworkz.matrimonyapp.exceptions.DataNotSavedException;
import com.xworkz.matrimonyapp.exceptions.DuplicateEmailException;
import com.xworkz.matrimonyapp.service.MatrimonyService;
import com.xworkz.matrimonyapp.service.MatrimonyServiceImpl;
import com.xworkz.matrimonyapp.util.NumberFormatCheck;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/matrimony",loadOnStartup = 1)
public class MatrimonyServlet extends HttpServlet {

    MatrimonyService matrimonyService=new MatrimonyServiceImpl();


    public MatrimonyServlet(){
        System.out.println("Matrimony servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Matrimony.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String email=req.getParameter("email");
        String createProfileFor=req.getParameter("for");
        String gender=req.getParameter("gender");
        String dateOfBirth=req.getParameter("dob");
        String motherTongue=req.getParameter("motherTongue");
        String religion=req.getParameter("religion");
        String maritalStatus=req.getParameter("maritalStatus");
        double height= NumberFormatCheck.parseDoubleSafe(req.getParameter("height"));

        MatrimonyDTO matrimonyDTO=new MatrimonyDTO(email,createProfileFor,gender,dateOfBirth,motherTongue,religion,maritalStatus,height);

        System.out.println(matrimonyDTO);
        try {

            matrimonyService.validateData(matrimonyDTO);

            req.setAttribute("successMsg","Data Saved Successfully");
            req.setAttribute("email", email);
            req.setAttribute("createProfileFor", createProfileFor);
            req.setAttribute("gender", gender);
            req.setAttribute("motherTongue", motherTongue);
            req.setAttribute("dateOfBirth", dateOfBirth);
            req.setAttribute("religion", religion);
            req.setAttribute("maritalStatus", maritalStatus);
            req.setAttribute("height", height);

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

        System.out.println(matrimonyDTO);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        req.getRequestDispatcher("MatrimonyResponse.jsp").forward(req,resp);

    }
}
