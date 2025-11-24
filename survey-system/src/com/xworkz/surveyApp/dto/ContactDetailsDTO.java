package com.xworkz.surveyApp.dto;

import java.io.Serializable;
import java.util.Objects;

public class ContactDetailsDTO implements Serializable,Comparable<ContactDetailsDTO> {


    private long mobileNo;
    private String aadhaarNo;
    private String panNo;
    private String voterId;
    private String passportNo;
    private String rationCardNo;

    public ContactDetailsDTO(long mobileNo,String aadhaarNo,  String panNo, String voterId,String passportNo, String rationCardNo ) {
        this.aadhaarNo = aadhaarNo;
        this.mobileNo = mobileNo;
        this.panNo = panNo;
        this.passportNo = passportNo;
        this.rationCardNo = rationCardNo;
        this.voterId = voterId;
    }

    @Override
    public String toString() {
        return "ContactDetailsDTO{" +
                "aadhaarNo='" + aadhaarNo + '\'' +
                ", mobileNo=" + mobileNo +
                ", panNo='" + panNo + '\'' +
                ", voterId='" + voterId + '\'' +
                ", passportNo='" + passportNo + '\'' +
                ", rationCardNo='" + rationCardNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContactDetailsDTO that = (ContactDetailsDTO) o;
        return mobileNo == that.mobileNo && Objects.equals(aadhaarNo, that.aadhaarNo) && Objects.equals(panNo, that.panNo) && Objects.equals(voterId, that.voterId) && Objects.equals(passportNo, that.passportNo) && Objects.equals(rationCardNo, that.rationCardNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobileNo, aadhaarNo, panNo, voterId, passportNo, rationCardNo);
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getRationCardNo() {
        return rationCardNo;
    }

    public void setRationCardNo(String rationCardNo) {
        this.rationCardNo = rationCardNo;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    @Override
    public int compareTo(ContactDetailsDTO o) {
        return this.aadhaarNo.compareTo(o.aadhaarNo);
    }
}
