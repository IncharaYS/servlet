package com.xworkz.travelAgencyApp.exceptions;

public class DuplicateEmailException extends RuntimeException{
    public DuplicateEmailException(String msg){
        super(msg);
    }
}
