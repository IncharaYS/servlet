package com.xworkz.surveyApp.service;

public class ValueCheckServiceImpl implements ValueCheckService{
    @Override
    public String checkValidTaxesPaidValues(String name) {
        String[] validValues={"yes","no","True","false"};
        for (String values:validValues){
            if(name.equalsIgnoreCase(values)){
                return name;
            }
        }
        return null;
    }

    @Override
    public String checkValidIsDisabledValues(String name) {
        String[] validValues={"yes","no","True","false"};
        for (String values:validValues){
            if(name.equalsIgnoreCase(values)){
                return name;
            }
        }
        return null;
    }

    @Override
    public String checkValidIsGovtEmpValues(String name) {
        String[] validValues={"yes","no","True","false"};
        for (String values:validValues){
            if(name.equalsIgnoreCase(values)){
                return name;
            }
        }
        return null;
    }

}
