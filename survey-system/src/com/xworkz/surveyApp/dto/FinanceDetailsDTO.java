package com.xworkz.surveyApp.dto;

import java.io.Serializable;
import java.util.Objects;

public class FinanceDetailsDTO implements Serializable,Comparable<FinanceDetailsDTO> {


    private double income;
    private String bankAccount;
    private String insuranceCompany;
    private String insuranceNo;
    private String taxesPaid;
    private String shareHolding;
    private double landInAcres;
    private int totalSites;
    private String rtcNo;
    private String buildingOwner;
    private String electricityBillNo;
    private String waterBillNo;

    public FinanceDetailsDTO(double income, String bankAccount, String insuranceCompany, String insuranceNo, String taxesPaid, String shareHolding, double landInAcres, int totalSites, String rtcNo, String builderOwner, String electricityBillNo, String waterBillNo) {
        this.bankAccount = bankAccount;
        this.buildingOwner = builderOwner;
        this.electricityBillNo = electricityBillNo;
        this.income = income;
        this.insuranceCompany = insuranceCompany;
        this.insuranceNo = insuranceNo;
        this.landInAcres = landInAcres;
        this.rtcNo = rtcNo;
        this.shareHolding = shareHolding;
        this.taxesPaid = taxesPaid;
        this.totalSites = totalSites;
        this.waterBillNo = waterBillNo;
    }

    @Override
    public String toString() {
        return "FinanceDetailsDTO{" +
                "bankAccount='" + bankAccount + '\'' +
                ", income=" + income +
                ", insuranceCompany='" + insuranceCompany + '\'' +
                ", insuranceNo='" + insuranceNo + '\'' +
                ", taxesPaid='" + taxesPaid + '\'' +
                ", shareHolding='" + shareHolding + '\'' +
                ", landInAcres=" + landInAcres +
                ", totalSites=" + totalSites +
                ", rtcNo='" + rtcNo + '\'' +
                ", buildingOwner='" + buildingOwner + '\'' +
                ", electricityBillNo='" + electricityBillNo + '\'' +
                ", waterBillNo='" + waterBillNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FinanceDetailsDTO that = (FinanceDetailsDTO) o;
        return Double.compare(income, that.income) == 0 && Double.compare(landInAcres, that.landInAcres) == 0 && totalSites == that.totalSites && Objects.equals(bankAccount, that.bankAccount) && Objects.equals(insuranceCompany, that.insuranceCompany) && Objects.equals(insuranceNo, that.insuranceNo) && Objects.equals(taxesPaid, that.taxesPaid) && Objects.equals(shareHolding, that.shareHolding) && Objects.equals(rtcNo, that.rtcNo) && Objects.equals(buildingOwner, that.buildingOwner) && Objects.equals(electricityBillNo, that.electricityBillNo) && Objects.equals(waterBillNo, that.waterBillNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(income, bankAccount, insuranceCompany, insuranceNo, taxesPaid, shareHolding, landInAcres, totalSites, rtcNo, buildingOwner, electricityBillNo, waterBillNo);
    }

    public String getWaterBillNo() {
        return waterBillNo;
    }

    public void setWaterBillNo(String waterBillNo) {
        this.waterBillNo = waterBillNo;
    }

    public int getTotalSites() {
        return totalSites;
    }

    public void setTotalSites(int totalSites) {
        this.totalSites = totalSites;
    }

    public String getTaxesPaid() {
        return taxesPaid;
    }

    public void setTaxesPaid(String taxesPaid) {
        this.taxesPaid = taxesPaid;
    }

    public String getShareHolding() {
        return shareHolding;
    }

    public void setShareHolding(String shareHolding) {
        this.shareHolding = shareHolding;
    }

    public String getRtcNo() {
        return rtcNo;
    }

    public void setRtcNo(String rtcNo) {
        this.rtcNo = rtcNo;
    }

    public double getLandInAcres() {
        return landInAcres;
    }

    public void setLandInAcres(double landInAcres) {
        this.landInAcres = landInAcres;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getElectricityBillNo() {
        return electricityBillNo;
    }

    public void setElectricityBillNo(String electricityBillNo) {
        this.electricityBillNo = electricityBillNo;
    }

    public String getBuildingOwner() {
        return buildingOwner;
    }

    public void setBuildingOwner(String buildingOwner) {
        this.buildingOwner = buildingOwner;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public int compareTo(FinanceDetailsDTO o) {
        return (int)(this.income-o.income);
    }
}
