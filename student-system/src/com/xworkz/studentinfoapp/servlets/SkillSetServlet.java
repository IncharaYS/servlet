package com.xworkz.studentinfoapp.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(urlPatterns = "/skillset",loadOnStartup = 2)
public class SkillSetServlet extends GenericServlet {
    public SkillSetServlet(){
        System.out.println("Skill set servlet instance created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service on skill set servlet \n");

        System.out.println("Skill set details are:");
        System.out.println("Name:"+servletRequest.getParameter("name"));
        System.out.println("Email:"+servletRequest.getParameter("email"));
        System.out.println("Primary skills:"+ Arrays.toString(servletRequest.getParameterValues("primarySkill")));
        System.out.println("Secondary skills:"+servletRequest.getParameter("secondarySkill"));
        System.out.println("Databases:"+ Arrays.toString(servletRequest.getParameterValues("db")));
        System.out.println("IDE's:"+ Arrays.toString(servletRequest.getParameterValues("ide")));
        System.out.println("UI Technologies:"+ Arrays.toString(servletRequest.getParameterValues("uiTechnologies")));
        System.out.println("Frameworks:"+ Arrays.toString(servletRequest.getParameterValues("frameworks")));
        System.out.println("Other skills:"+servletRequest.getParameter("otherSkills")+"\n");
    }
}
