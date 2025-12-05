package com.xworkz.travel_agency_app.dto;

import java.io.Serializable;
import java.util.Objects;

public class TravelAgencyDTO implements Serializable,Comparable<TravelAgencyDTO> {


    private String fullName;
    private String email;
    private String password;
    private long phoneNo;
    private String country;

    public TravelAgencyDTO( String fullName, String email,String password, long phoneNo,String country) {
        this.country = country;
        this.email = email;
        this.fullName = fullName;
        this.password = password;
        this.phoneNo = phoneNo;
    }

    public TravelAgencyDTO(){}

    @Override
    public String toString() {
        return "TravelAgencyDTO{" +
                "country='" + country + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TravelAgencyDTO that = (TravelAgencyDTO) o;
        return phoneNo == that.phoneNo && Objects.equals(fullName, that.fullName) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, email, password, phoneNo, country);
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int compareTo(TravelAgencyDTO o) {
        return this.fullName.compareTo(o.fullName);
    }
}
