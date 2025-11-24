package com.xworkz.surveyApp.dto;

import java.io.Serializable;
import java.util.Objects;

public class LoansAndAssetsDetailsDTO implements Serializable,Comparable<LoansAndAssetsDetailsDTO> {


    private String crop;
    private String loanNo;
    private double loanBalance;
    private String loanType;
    private double goldInGms;
    private double silverInGms;
    private int noOfCows;
    private String petName;
    private String knownDiseases;
    private String isDisabled;
    private String isGovernmentEmployee;
    private String occupation;
    private String education;

    public LoansAndAssetsDetailsDTO(String crop, String loanNo, double loanBalance, String loanType, double goldInGms, double silverInGms, int noOfCows, String petName, String knownDiseases, String isDisabled, String isGovernmentEmployee, String occupation, String education ) {
        this.crop = crop;
        this.education = education;
        this.goldInGms = goldInGms;
        this.isDisabled = isDisabled;
        this.isGovernmentEmployee = isGovernmentEmployee;
        this.knownDiseases = knownDiseases;
        this.loanBalance = loanBalance;
        this.loanNo = loanNo;
        this.loanType = loanType;
        this.noOfCows = noOfCows;
        this.occupation = occupation;
        this.petName = petName;
        this.silverInGms = silverInGms;
    }
    public LoansAndAssetsDetailsDTO(){}

    @Override
    public String toString() {
        return "LoansAndAssetsDetailsDTO{" +
                "crop='" + crop + '\'' +
                ", loanNo='" + loanNo + '\'' +
                ", loanBalance=" + loanBalance +
                ", loanType='" + loanType + '\'' +
                ", goldInGms=" + goldInGms +
                ", silverInGms=" + silverInGms +
                ", noOfCows=" + noOfCows +
                ", petName='" + petName + '\'' +
                ", knownDiseases='" + knownDiseases + '\'' +
                ", isDisabled='" + isDisabled + '\'' +
                ", isGovernmentEmployee='" + isGovernmentEmployee + '\'' +
                ", occupation='" + occupation + '\'' +
                ", education='" + education + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LoansAndAssetsDetailsDTO that = (LoansAndAssetsDetailsDTO) o;
        return Double.compare(loanBalance, that.loanBalance) == 0 && Double.compare(goldInGms, that.goldInGms) == 0 && Double.compare(silverInGms, that.silverInGms) == 0 && noOfCows == that.noOfCows && Objects.equals(crop, that.crop) && Objects.equals(loanNo, that.loanNo) && Objects.equals(loanType, that.loanType) && Objects.equals(petName, that.petName) && Objects.equals(knownDiseases, that.knownDiseases) && Objects.equals(isDisabled, that.isDisabled) && Objects.equals(isGovernmentEmployee, that.isGovernmentEmployee) && Objects.equals(occupation, that.occupation) && Objects.equals(education, that.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crop, loanNo, loanBalance, loanType, goldInGms, silverInGms, noOfCows, petName, knownDiseases, isDisabled, isGovernmentEmployee, occupation, education);
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public double getGoldInGms() {
        return goldInGms;
    }

    public void setGoldInGms(double goldInGms) {
        this.goldInGms = goldInGms;
    }

    public String getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(String isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getIsGovernmentEmployee() {
        return isGovernmentEmployee;
    }

    public void setIsGovernmentEmployee(String isGovernmentEmployee) {
        this.isGovernmentEmployee = isGovernmentEmployee;
    }

    public String getKnownDiseases() {
        return knownDiseases;
    }

    public void setKnownDiseases(String knownDiseases) {
        this.knownDiseases = knownDiseases;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(double loanBalance) {
        this.loanBalance = loanBalance;
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public int getNoOfCows() {
        return noOfCows;
    }

    public void setNoOfCows(int noOfCows) {
        this.noOfCows = noOfCows;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public double getSilverInGms() {
        return silverInGms;
    }

    public void setSilverInGms(double silverInGms) {
        this.silverInGms = silverInGms;
    }

    @Override
    public int compareTo(LoansAndAssetsDetailsDTO o) {
        return this.education.compareTo(o.education);
    }
}
