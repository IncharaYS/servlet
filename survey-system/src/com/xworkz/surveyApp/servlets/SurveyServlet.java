package com.xworkz.surveyApp.servlets;

import com.xworkz.surveyApp.DTO.SurveyDTO;
import com.xworkz.surveyApp.exceptions.DataInvalidException;
import com.xworkz.surveyApp.service.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/survey", loadOnStartup = 1)
public class SurveyServlet extends HttpServlet {




    public SurveyServlet() {
        System.out.println("SurveyServlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        NumberFormatCheckService numberFormatCheckService=new NumberFormatCheckServiceImpl();
        ValueCheckService valueCheckService=new ValueCheckServiceImpl();




        String name=req.getParameter("name");
        int age=numberFormatCheckService.parseIntSafe(req.getParameter("age"));
        String dateOfBirth=req.getParameter("dateOfBirth");
        String bloodGroup=req.getParameter("bloodGroup");
        double height=numberFormatCheckService.parseDoubleSafe(req.getParameter("height"));
        double weight=numberFormatCheckService.parseDoubleSafe(req.getParameter("weight"));
        String complexion=req.getParameter("complexion");
        String motherTongue=req.getParameter("motherTongue");
        String religion=req.getParameter("religion");
        String caste=req.getParameter("caste");


        String fathersName=req.getParameter("fathersName");
        String mothersName=req.getParameter("mothersName");
        String maritalStatus=req.getParameter("maritalStatus");
        String spouseName=req.getParameter("spouseName");
        int noOfChildren= numberFormatCheckService.parseIntSafe(req.getParameter("noOfChildren"));
        int noOfFamilyMembers=numberFormatCheckService.parseIntSafe(req.getParameter("noOfFamilyMembers"));
        String friendsName=req.getParameter("friendsName");
        String nativePlace=req.getParameter("nativePlace");


        long mobileNo=numberFormatCheckService.parseLongSafe(req.getParameter("mobileNo"));
        String aadhaarNo=req.getParameter("aadhaarNo");
        String panNo=req.getParameter("panNo");
        String voterId=req.getParameter("voterId");
        String passportNo=req.getParameter("passportNo");
        String rationCardNo= req.getParameter("rationCardNo");



        double income=numberFormatCheckService.parseDoubleSafe(req.getParameter("income"));
        String bankAccount=req.getParameter("bankAccount");
        String insuranceCompany=req.getParameter("insuranceCompany");
        String insuranceNo=req.getParameter("insuranceNo");
        String taxesPaid=valueCheckService.checkValidTaxesPaidValues(req.getParameter("taxesPaid"));
        String shareHolding=req.getParameter("shareHolding");
        double landInAcres=numberFormatCheckService.parseDoubleSafe(req.getParameter("landInAcres"));
        int totalSites= numberFormatCheckService.parseIntSafe(req.getParameter("totalSites"));
        String rtcNo=req.getParameter("rtcNo");
        String builderOwner=req.getParameter("builderOwner");
        String electricityBillNo=req.getParameter("electricityBillNo");
        String waterBillNo=req.getParameter("waterBillNo");


        String bikeNo=req.getParameter("bikeNo");
        String carNo=req.getParameter("carNo");
        int noOfCycles= numberFormatCheckService.parseIntSafe(req.getParameter("noOfCycles"));
        int shoeSize= numberFormatCheckService.parseIntSafe(req.getParameter("shoeSize"));
        int noOfShoes= numberFormatCheckService.parseIntSafe(req.getParameter("noOfShoes"));
        String laptopModel=req.getParameter("laptopModel");
        String tvModel=req.getParameter("tvModel");


        String crop=req.getParameter("crop");
        String loanNo=req.getParameter("loanNo");
        double loanBalance=numberFormatCheckService.parseDoubleSafe(req.getParameter("loanBalance"));
        String loanType=req.getParameter("loanType");
        double goldInGms=numberFormatCheckService.parseDoubleSafe(req.getParameter("goldInGms"));
        double silverInGms=numberFormatCheckService.parseDoubleSafe(req.getParameter("silverInGms"));
        int noOfCows= numberFormatCheckService.parseIntSafe(req.getParameter("noOfCows"));
        String petName=req.getParameter("petName");
        String knownDiseases=req.getParameter("knownDiseases");
        String isDisabled=valueCheckService.checkValidIsDisabledValues(req.getParameter("isDisabled"));
        String isGovernmentEmployee=valueCheckService.checkValidIsGovtEmpValues(req.getParameter("isGovernmentEmployee"));
        String occupation=req.getParameter("occupation");
        String education=req.getParameter("education");




        SurveyDTO surveyDTO = new SurveyDTO(name,age,dateOfBirth,bloodGroup,height,weight, complexion,motherTongue,religion,caste, fathersName,mothersName,maritalStatus,spouseName, noOfChildren,noOfFamilyMembers,friendsName,nativePlace,
                mobileNo,aadhaarNo,panNo,voterId,passportNo,rationCardNo, income,bankAccount,insuranceCompany,insuranceNo,taxesPaid, shareHolding,landInAcres,totalSites,rtcNo,builderOwner, electricityBillNo,waterBillNo,
                bikeNo,carNo,noOfCycles,shoeSize,noOfShoes, laptopModel,tvModel, crop,loanNo,loanBalance,loanType,goldInGms,silverInGms, noOfCows,petName,knownDiseases,isDisabled,isGovernmentEmployee, occupation,education);


        System.out.println(surveyDTO);

        SurveyService surveyService = new SurveyServiceImpl();

        try {
            surveyService.validateData(surveyDTO);

            req.setAttribute("successMsg","Entered data is Validated successfully");

            req.setAttribute("name",name);
            req.setAttribute("age",age);
            req.setAttribute("dateOfBirth",dateOfBirth);
            req.setAttribute("bloodGroup",bloodGroup);
            req.setAttribute("height",height);
            req.setAttribute("weight",weight);
            req.setAttribute("complexion",complexion);
            req.setAttribute("motherTongue",motherTongue);
            req.setAttribute("religion",religion);
            req.setAttribute("caste",caste);



            req.setAttribute("fathersName",fathersName);
            req.setAttribute("mothersName",mothersName);
            req.setAttribute("maritalStatus",maritalStatus);
            req.setAttribute("spouseName",spouseName);
            req.setAttribute("noOfChildren",noOfChildren);
            req.setAttribute("noOfFamilyMembers",noOfFamilyMembers);
            req.setAttribute("friendsName",friendsName);
            req.setAttribute("nativePlace",nativePlace);

            req.setAttribute("mobileNo",mobileNo);
            req.setAttribute("aadhaarNo",aadhaarNo);
            req.setAttribute("panNo",panNo);
            req.setAttribute("voterId",voterId);
            req.setAttribute("passportNo",passportNo);
            req.setAttribute("rationCardNo",rationCardNo);

            req.setAttribute("income",income);
            req.setAttribute("bankAccount",bankAccount);
            req.setAttribute("insuranceCompany",insuranceCompany);
            req.setAttribute("insuranceNo",insuranceNo);
            req.setAttribute("taxesPaid",taxesPaid);
            req.setAttribute("shareHolding",shareHolding);
            req.setAttribute("landInAcres",landInAcres);
            req.setAttribute("totalSites",totalSites);
            req.setAttribute("rtcNo",rtcNo);
            req.setAttribute("builderOwner",builderOwner);
            req.setAttribute("electricityBillNo",electricityBillNo);
            req.setAttribute("waterBillNo",waterBillNo);

            req.setAttribute("bikeNo",bikeNo);
            req.setAttribute("carNo",carNo);
            req.setAttribute("noOfCycles",noOfCycles);
            req.setAttribute("shoeSize",shoeSize);
            req.setAttribute("noOfShoes",noOfShoes);
            req.setAttribute("laptopModel",laptopModel);
            req.setAttribute("tvModel",tvModel);


            req.setAttribute("crop",crop);
            req.setAttribute("loanNo",loanNo);
            req.setAttribute("loanBalance",loanBalance);
            req.setAttribute("loanType",loanType);
            req.setAttribute("goldInGms",goldInGms);
            req.setAttribute("silverInGms",silverInGms);
            req.setAttribute("noOfCows",noOfCows);
            req.setAttribute("petName",petName);
            req.setAttribute("knownDiseases",knownDiseases);
            req.setAttribute("isDisabled",isDisabled);
            req.setAttribute("isGovernmentEmployee",surveyDTO.isGovernmentEmployee());
            req.setAttribute("occupation",occupation);
            req.setAttribute("education",education);


        } catch (DataInvalidException e) {
            System.err.println("Invalid data entered");
            req.setAttribute("failureMsg","Entered data is invalid");
        }


        req.getRequestDispatcher("SurveyResponse.jsp").forward(req,resp);

    }}

