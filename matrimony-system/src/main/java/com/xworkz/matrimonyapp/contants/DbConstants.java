package com.xworkz.matrimonyapp.contants;

public enum DbConstants {
    URL("jdbc:mysql://localhost:3306/matrimony"),USERNAME("root"),PASSWORD("Root@123");

    final String properties;


    private DbConstants(String properties){
        this.properties=properties;
    }

    public String getProperties() {
        return properties;
    }
}
