package com.xworkz.matrimonyapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class MatrimonyDTO implements Serializable,Comparable<MatrimonyDTO> {


    private String email;
    private String createProfileFor;
    private String gender;
    private String dateOfBirth;
    private String motherTongue;
    private String religion;
    private String maritalStatus;
    private double height;


    public MatrimonyDTO(){}


    public MatrimonyDTO(String email,String createProfileFor, String gender,String dateOfBirth,String motherTongue, String religion,String maritalStatus,   double height ) {
        this.createProfileFor = createProfileFor;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.gender = gender;
        this.height = height;
        this.maritalStatus = maritalStatus;
        this.motherTongue = motherTongue;
        this.religion = religion;
    }

    @Override
    public String toString() {
        return "MatrimonyDTO{" +
                "createProfileFor='" + createProfileFor + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", motherTongue='" + motherTongue + '\'' +
                ", religion='" + religion + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MatrimonyDTO that = (MatrimonyDTO) o;
        return Double.compare(height, that.height) == 0 && Objects.equals(email, that.email) && Objects.equals(createProfileFor, that.createProfileFor) && Objects.equals(gender, that.gender) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(motherTongue, that.motherTongue) && Objects.equals(religion, that.religion) && Objects.equals(maritalStatus, that.maritalStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, createProfileFor, gender, dateOfBirth, motherTongue, religion, maritalStatus, height);
    }

    public String getCreateProfileFor() {
        return createProfileFor;
    }

    public void setCreateProfileFor(String createProfileFor) {
        this.createProfileFor = createProfileFor;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public int compareTo(MatrimonyDTO o) {
        return this.email.compareTo(o.email);
    }
}
