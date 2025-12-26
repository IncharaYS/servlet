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

@WebServlet(urlPatterns = "/bid",loadOnStartup = 5)
public class BidServlet extends HttpServlet {

    private  static final IplBiddingService iplBiddingService=new IplBiddingServiceImpl();

    public BidServlet(){
        System.out.println("Bid servlet instance created");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String playerName=req.getParameter("playerName");
        double bidAmount= NumberFormatCheck.parseDoubleSafe(req.getParameter("bidAmount"));
        String company=req.getParameter("company");
        String action=req.getParameter("action");

        Optional<PlayerDTO> playerDTO =iplBiddingService.validateAndSearchByName(new PlayerSearchDTO(playerName,null,0,0,0));

        int currentBidCount = playerDTO.get().getBidCount();

        if (currentBidCount >= 3) {
            req.setAttribute("limitReached","Bidding limit for the player reached");
            req.getRequestDispatcher("Search.jsp").forward(req,resp);
        }
        else {
            if (playerDTO.isPresent()) {
                System.out.println("Player to bid on:" + playerDTO.get());
                req.setAttribute("player", playerDTO.get());
            } else {
                System.out.println("No player found to bid");
            }

            if ("Bid".equalsIgnoreCase(action) && playerDTO.isPresent()) {
                System.out.println("Indide if:" + playerDTO.get());
                boolean success = iplBiddingService.validateAndUpdateBid(new PlayerDTO(playerDTO.get().getPlayerName(), playerDTO.get().getPassword(), playerDTO.get().getAge(), playerDTO.get().getPlayerType(), playerDTO.get().getState(), playerDTO.get().getBattingAverage(), playerDTO.get().getBowlingAverage(), playerDTO.get().getNoOfStumps(), bidAmount, company, playerDTO.get().getBidCount()));

                if (success) {
                    req.setAttribute("player",playerDTO.get());
                    req.setAttribute("successMsg", "Bid Successfully");
                    req.getRequestDispatcher("Search.jsp").forward(req,resp);
                }
            }
            req.getRequestDispatcher("BiddingPage.jsp").forward(req,resp);
        }

    }
}
