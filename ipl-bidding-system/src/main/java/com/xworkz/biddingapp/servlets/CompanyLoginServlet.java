package com.xworkz.biddingapp.servlets;

import com.xworkz.biddingapp.dto.CompanyDTO;
import com.xworkz.biddingapp.dto.CompanySearchDTO;
import com.xworkz.biddingapp.service.IplBiddingService;
import com.xworkz.biddingapp.service.IplBiddingServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/companylogin",loadOnStartup = 2)
public class CompanyLoginServlet extends HttpServlet {

    private static IplBiddingService iplBiddingService=new IplBiddingServiceImpl();

    public CompanyLoginServlet(){
        System.out.println("Company login servlet created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("CompanyLogin.jsp").forward(req,resp);
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        CompanySearchDTO searchDTO = new CompanySearchDTO(email);

        Optional<CompanyDTO> companyInfo = iplBiddingService.validateAndSearchByEmail(searchDTO);

        if (companyInfo.isPresent()) {

            if (companyInfo.get().getPassword().equals(password)) {

                HttpSession session = req.getSession(true);
                session.setAttribute("companyName", companyInfo.get().getCompanyName());

                req.setAttribute("successMsg", "Company Logged In Successfully");
                req.setAttribute("companyInfo", companyInfo.get());

                req.getRequestDispatcher("BiddingPage.jsp").forward(req, resp);

            } else {
                req.setAttribute("loginError", "Incorrect password");
                req.getRequestDispatcher("CompanyLogin.jsp").forward(req, resp);
            }

        } else {
            req.setAttribute("loginError", "Company with entered email not found");
            req.getRequestDispatcher("CompanyLogin.jsp").forward(req, resp);
        }

    }
}
