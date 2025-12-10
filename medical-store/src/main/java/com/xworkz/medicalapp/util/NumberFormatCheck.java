package com.xworkz.medicalapp.util;

public class NumberFormatCheck {

    private NumberFormatCheck(){}

    public  static  double parseDoubleSafe(String name) {
        if (name==null||name.isEmpty()) {
            return -1;
        }
        return Double.parseDouble(name);
    }

    public  static  long parseLongSafe(String name) {
        if (name==null||name.isEmpty()) {
            return -1;
        }
        return Long.parseLong(name);
    }

    public  static  int parseIntSafe(String name) {
        if (name==null||name.isEmpty()) {
            return -1;
        }
        return Integer.parseInt(name);
    }
}
