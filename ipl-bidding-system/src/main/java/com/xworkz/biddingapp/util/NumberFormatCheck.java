package com.xworkz.biddingapp.util;

public class NumberFormatCheck {
    private NumberFormatCheck(){}

    public  static  double parseDoubleSafe(String name) {
        if (name==null||name.isEmpty()) {
            return 0;
        }
        return Double.parseDouble(name);
    }

    public  static  long parseLongSafe(String name) {
        if (name==null||name.isEmpty()) {
            return 0;
        }
        return Long.parseLong(name);
    }

    public  static  int  parseIntSafe(String name) {
        if (name==null||name.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(name);
    }
}
