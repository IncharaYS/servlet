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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = "/login",loadOnStartup = 6)
public class LoginServlet extends HttpServlet {

    private TravelAgencyService travelAgencyService=new TravelAgencyServiceImpl();

    public LoginServlet(){
        System.out.println("Login servlet instance created");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action=req.getParameter("SuccessfullLogin");
        if("Login".equalsIgnoreCase(action)) {
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            SearchDTO searchDTO = new SearchDTO(email,null,null,null);

            Optional<TravelAgencyDTO> userInfo = travelAgencyService.validateAndSearchByEmail(searchDTO);


            if (userInfo.isPresent()) {
                if(userInfo.get().getPassword().equals(password)) {
                    req.setAttribute("userInfo", userInfo.get());
                    HttpSession httpSession = req.getSession(true);

                    httpSession.setAttribute("userName", userInfo.get().getFullName());
                    httpSession.setAttribute("userEmail", userInfo.get().getEmail());

                    System.out.println("After setting attribute");
                    req.setAttribute("successMsg", "Logged In Successfully");
                    req.getRequestDispatcher("HomePage.jsp").forward(req, resp);
                }
                else {
                    req.setAttribute("userInfo", userInfo);
                    req.setAttribute("wrongPwd","Entered password is incorrect");
                    req.getRequestDispatcher("Login.jsp").forward(req, resp);
                }
            }
            else {
                req.setAttribute("failureMsg", "User with entered email not found: ");
                req.getRequestDispatcher("Login.jsp").forward(req, resp);
            }
        }
        else req.getRequestDispatcher("Login.jsp").forward(req,resp);


    }
}
