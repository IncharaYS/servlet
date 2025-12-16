package com.xworkz.travel_agency_app.filter;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        HttpSession session = request.getSession(false);

        boolean loggedIn=(session!= null
                && session.getAttribute("userName") != null
                && session.getAttribute("userEmail") != null);

        String uri=request.getRequestURI();

        boolean loginPage = uri.endsWith("Login.jsp");
        boolean indexPage = uri.endsWith("index.jsp");
        boolean logoutPage = uri.endsWith("logout");
        boolean checkEmail = uri.endsWith("checkEmail");
        boolean loginServlet = uri.endsWith("/login");
        boolean registerServlet = uri.endsWith("/travelagency");
        boolean resourceRequest = uri.contains("/css/") || uri.contains("/js/") || uri.contains("/images/")||uri.contains("/bg.png");

        if (loggedIn || loginPage || indexPage || logoutPage || loginServlet || resourceRequest||registerServlet || checkEmail) {
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            chain.doFilter(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }


    @Override
    public void destroy() {
    }
}
