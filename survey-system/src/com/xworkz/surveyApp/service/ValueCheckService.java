package com.xworkz.surveyApp.service;

public interface ValueCheckService {
    String checkValidTaxesPaidValues(String name);
    String checkValidIsDisabledValues(String name);
    String checkValidIsGovtEmpValues(String name);
}
