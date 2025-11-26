package com.xworkz.matrimonyapp.util;

public class NumberFormatCheck {
    public  static  double parseDoubleSafe(String name) {
        if (name==null||name.isEmpty()) {
            return -1;
        }
        return Double.parseDouble(name);
    }
}
