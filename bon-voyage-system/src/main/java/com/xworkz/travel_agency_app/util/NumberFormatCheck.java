package com.xworkz.travel_agency_app.util;

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
    }
