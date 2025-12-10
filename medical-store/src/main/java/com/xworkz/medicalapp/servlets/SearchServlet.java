package com.xworkz.medicalapp.servlets;

import com.xworkz.medicalapp.dto.CustomerDTO;
import com.xworkz.medicalapp.dto.SearchDTO;
import com.xworkz.medicalapp.service.MedicalStoreService;
import com.xworkz.medicalapp.service.MedicalStoreServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/search",loadOnStartup = 3)

public class SearchServlet extends HttpServlet {


    MedicalStoreService medicalStoreService=new MedicalStoreServiceImpl();

    public SearchServlet(){
        System.out.println("Search servlet instance created");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String action=req.getParameter("action");


            if("Submit".equalsIgnoreCase(action)) {
                String email = req.getParameter("email");
                SearchDTO searchDTO = new SearchDTO(email);

                Optional<CustomerDTO> dto = medicalStoreService.validateAndSearchByEmail(searchDTO);

                if (dto.isPresent()) {
                    req.setAttribute("dto", dto.get());
                } else req.setAttribute("failureMsg", "User with entered email not found!");
            }

            if("Clear".equalsIgnoreCase(action)){
                System.out.println("Cleared");
                req.setAttribute("dto",null );
            }
            req.getRequestDispatcher("Search.jsp").forward(req,resp);
        }

    }

