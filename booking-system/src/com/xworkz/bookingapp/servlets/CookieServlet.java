package com.xworkz.bookingapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(urlPatterns = "/cookie",loadOnStartup = 0)
public class CookieServlet extends HttpServlet {
    public CookieServlet(){
        System.out.println("Cookie servlet instance created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String value;

        String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWER = "abcdefghijklmnopqrstuvwxyz";
        String DIGIT = "0123456789";
        String SPECIAL = "!@#$%^&*()-_=+<>?";

        Random random = new Random();
        StringBuilder sb = new StringBuilder(20);

        for (int i=0;i<5;i++) sb.append(UPPER.charAt(random.nextInt(UPPER.length())));
        for (int i=0;i<5;i++) sb.append(LOWER.charAt(random.nextInt(LOWER.length())));
        for (int i=0;i<5;i++) sb.append(DIGIT.charAt(random.nextInt(DIGIT.length())));
        for (int i=0;i<5;i++) sb.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));

        value= sb.toString();

        Cookie cookie=new Cookie("X-workz",value);
        resp.addCookie(cookie);

            System.out.println("Cookie name:"+cookie.getName());
            System.out.println("Cookie value:"+cookie.getValue());

        cookie.setPath("/");
        resp.sendRedirect("index.html");
    }
}
