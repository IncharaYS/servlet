package com.xworkz.surveyApp.service;

import java.util.Objects;

public interface NumberFormatCheckService {
    int parseIntSafe(String name);
    double parseDoubleSafe(String name);
    long parseLongSafe(String name);

}
