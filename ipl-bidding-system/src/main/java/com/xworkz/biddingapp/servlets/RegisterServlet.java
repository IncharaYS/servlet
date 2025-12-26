package com.xworkz.biddingapp.servlets;

import com.xworkz.biddingapp.dto.PlayerDTO;
import com.xworkz.biddingapp.dto.PlayerSearchDTO;
import com.xworkz.biddingapp.service.IplBiddingService;
import com.xworkz.biddingapp.service.IplBiddingServiceImpl;
import com.xworkz.biddingapp.util.NumberFormatCheck;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/register",loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {

    private static IplBiddingService iplBiddingService=new IplBiddingServiceImpl();

    public RegisterServlet(){
        System.out.println("Register servlet instance created");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Register.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String playerName=req.getParameter("playerName");
        String password=req.getParameter("password");
        int age=NumberFormatCheck.parseIntSafe(req.getParameter("age"));
        String state=req.getParameter("state");
        String playerType=req.getParameter("playerType");
        double battingAverage=NumberFormatCheck.parseDoubleSafe(req.getParameter("battingAverage"));
        double bowlingAverage=NumberFormatCheck.parseDoubleSafe(req.getParameter("bowlingAverage"));
        int noOfStumps=NumberFormatCheck.parseIntSafe(req.getParameter("noOfStumps"));


        PlayerDTO playerDTO=new PlayerDTO(playerName,password,age,playerType,state,battingAverage,bowlingAverage,noOfStumps,0,null,0);

        System.out.println(playerDTO);



        Optional<PlayerDTO> exists=iplBiddingService.validateAndSearchByName(new PlayerSearchDTO(playerDTO.getPlayerName(),null,0,0,0));
        if(exists.isPresent()){
            System.out.println("Player is already registered");
            req.setAttribute("exists","Player is already registered,Login");
            req.getRequestDispatcher("Register.jsp").forward(req,resp);
        }
        else {
            boolean success=iplBiddingService.validateAndSave(playerDTO);
            if (success) {
                System.out.println("Validated and saved successfully");
                req.setAttribute("playerInfo", playerDTO);
                req.setAttribute("successMsg", "Logged in successfully");
                req.getRequestDispatcher("PlayerLogin.jsp").forward(req, resp);
            } else {
                System.err.println("Failed to validate and save");
                req.setAttribute("failureMsg", "Failed to save data");
                req.getRequestDispatcher("PlayerInfo.jsp").forward(req, resp);
            }
        }
    }
}
