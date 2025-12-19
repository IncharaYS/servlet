package com.xworkz.biddingapp.servlets;

import com.xworkz.biddingapp.dto.PlayerDTO;
import com.xworkz.biddingapp.dto.PlayerSearchDTO;
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

@WebServlet(urlPatterns = "/login",loadOnStartup = 2)
public class PlayerLoginServlet extends HttpServlet {

    private static IplBiddingService iplBiddingService=new IplBiddingServiceImpl();

    public PlayerLoginServlet(){
        System.out.println("Player login servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("PlayerLogin.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String playerName = req.getParameter("playerName");
        String password = req.getParameter("password");

        PlayerSearchDTO searchDTO = new PlayerSearchDTO( playerName,null, 0,0,0);

        Optional<PlayerDTO> playerInfo = iplBiddingService.validateAndSearchByName(searchDTO);

        if (playerInfo.isPresent()) {

            if (playerInfo.get().getPassword().equals(password)) {

                HttpSession session = req.getSession(true);
                session.setAttribute("playerName", playerInfo.get().getPlayerName());

                req.setAttribute("successMsg", "Player Logged In Successfully");
                req.setAttribute("playerInfo", playerInfo.get());

                req.getRequestDispatcher("PlayerInfo.jsp").forward(req, resp);

            } else {
                req.setAttribute("loginError", "Incorrect password");
                req.getRequestDispatcher("PlayerLogin.jsp").forward(req, resp);
            }

        } else {
            req.setAttribute("loginError", "Player not found");
            req.getRequestDispatcher("PlayerLogin.jsp").forward(req, resp);
        }

    }
}
