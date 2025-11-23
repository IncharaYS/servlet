package com.xworkz.surveyApp.util;

public class ValueCheck {
    public static String checkValidTaxesPaidValues(String name) {
        String[] validValues={"yes","no","True","false"};
        for (String values:validValues){
            if(name.equalsIgnoreCase(values)){
                return name;
            }
        }
        return null;
    }

    public static String checkValidIsDisabledValues(String name) {
        String[] validValues={"yes","no","True","false"};
        for (String values:validValues){
            if(name.equalsIgnoreCase(values)){
                return name;
            }
        }
        return null;
    }

    public static String checkValidIsGovtEmpValues(String name) {
        String[] validValues={"yes","no","True","false"};
        for (String values:validValues){
            if(name.equalsIgnoreCase(values)){
                return name;
            }
        }
        return null;
    }

}
