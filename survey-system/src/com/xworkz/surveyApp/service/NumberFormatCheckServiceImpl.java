package com.xworkz.surveyApp.service;

public class NumberFormatCheckServiceImpl implements NumberFormatCheckService{
    @Override
    public int parseIntSafe(String name) {
        if (name==null||name.isEmpty()) {
            return -1;
    }
        return Integer.parseInt(name);
}

    @Override
    public double parseDoubleSafe(String name) {
        if (name==null||name.isEmpty()) {
            return -1;
        }
        return Double.parseDouble(name);
    }

    @Override
    public long parseLongSafe(String name) {
        if (name==null||name.isEmpty()) {
            return -1;
        }
        return Long.parseLong(name);
    }

}

