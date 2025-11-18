package com.xworkz.coffeeApp.servlets;

import com.xworkz.coffeeApp.DTO.CafeteriaDTO;
import com.xworkz.coffeeApp.service.CafeteriaService;
import com.xworkz.coffeeApp.service.CafeteriaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cafeteria", loadOnStartup = 1)
public class CafeteriaServlet extends HttpServlet {



    public CafeteriaServlet() {
        System.out.println("Cafeteria servlet instance created");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cafeteriaName=req.getParameter("cafeteriaName");
        String location=req.getParameter("location");
        String franchiseName=req.getParameter("franchiseName");
        String ownerName=req.getParameter("ownerName");
        String gstNo=req.getParameter("gstNo");

        req.setAttribute("cafeteriaName",cafeteriaName);
        req.setAttribute("location",location);
        req.setAttribute("franchiseName",franchiseName);
        req.setAttribute("ownerName",ownerName);
        req.setAttribute("gstNo",gstNo);

        CafeteriaDTO cafeteriaDTO=new CafeteriaDTO(cafeteriaName,location,franchiseName,ownerName,gstNo);
        CafeteriaService cafeteriaService=new CafeteriaServiceImpl();
        cafeteriaService.validateAndSave(cafeteriaDTO);

        req.getRequestDispatcher("CafeteriaResponse.jsp").forward(req,resp);
    }
}
