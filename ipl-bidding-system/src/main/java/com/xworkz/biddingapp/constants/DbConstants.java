package com.xworkz.biddingapp.constants;

public enum DbConstants {

    URL("jdbc:mysql://localhost:3306/ipl"),USERNAME("root"),PASSWORD("Root@123");

    final String properties;

    private DbConstants(String properties){
        this.properties=properties;
    }

    public String getProperties() {
        return properties;
    }
}
