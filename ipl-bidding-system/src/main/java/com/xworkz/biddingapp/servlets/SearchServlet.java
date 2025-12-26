package com.xworkz.biddingapp.servlets;

import com.xworkz.biddingapp.dto.PlayerDTO;
import com.xworkz.biddingapp.dto.PlayerSearchDTO;
import com.xworkz.biddingapp.exceptions.InvalidDataException;
import com.xworkz.biddingapp.service.IplBiddingService;
import com.xworkz.biddingapp.service.IplBiddingServiceImpl;
import com.xworkz.biddingapp.util.NumberFormatCheck;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/search",loadOnStartup = 2)
public class SearchServlet extends HttpServlet {

    private static final IplBiddingService iplBiddingService=new IplBiddingServiceImpl();


    public SearchServlet(){
        System.out.println("Search servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        String playerType = req.getParameter("playerType");

        double battingAverage = NumberFormatCheck.parseDoubleSafe(req.getParameter("battingAverage"));
        double bowlingAverage = NumberFormatCheck.parseDoubleSafe(req.getParameter("bowlingAverage"));
        double noOfStumps = NumberFormatCheck.parseDoubleSafe(req.getParameter("noOfStumps"));

        if ("Search".equalsIgnoreCase(action)) {
                    try {
                        PlayerSearchDTO searchDTO = new PlayerSearchDTO(null, playerType, battingAverage, bowlingAverage, noOfStumps);
                        List<PlayerDTO> searchList = iplBiddingService.validateAndSearch(searchDTO);

                        if (!searchList.isEmpty()) {
                            req.setAttribute("searchList", searchList);
                            req.setAttribute("selectedPlayerType", searchDTO.getPlayerType());

                            System.out.println("Player List:"+searchList);
                            System.out.println("No Of player found : " + searchList.size() + " based on the search");

                        } else {
                            req.setAttribute("errorMsg", "Players not found for the given requirement");
                        }
                    }

                    catch (InvalidDataException e){
                        System.out.println("Data entered is invalid");
                    }

                req.getRequestDispatcher("Search.jsp").forward(req,resp);
            }


        if ("Clear".equalsIgnoreCase(action)) {
            System.out.println("Clear logic");
            req.setAttribute("searchList", null);
        }


        req.getRequestDispatcher("Search.jsp").forward(req,resp);

    }
}
