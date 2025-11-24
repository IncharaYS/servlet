package com.xworkz.surveyApp.dto;

import java.io.Serializable;
import java.util.Objects;

public class VehiclesAndAppliancesDTO implements Serializable,Comparable<VehiclesAndAppliancesDTO> {


    private String bikeNo;
    private String carNo;
    private int noOfCycles;
    private int shoeSize;
    private int noOfShoes;
    private String laptopModel;
    private String tvModel;

    public VehiclesAndAppliancesDTO(String bikeNo, String carNo, int noOfCycles,int shoeSize,int noOfShoes,String laptopModel,    String tvModel) {
        this.bikeNo = bikeNo;
        this.carNo = carNo;
        this.laptopModel = laptopModel;
        this.noOfCycles = noOfCycles;
        this.noOfShoes = noOfShoes;
        this.shoeSize = shoeSize;
        this.tvModel = tvModel;
    }

    public VehiclesAndAppliancesDTO(){

    }

    @Override
    public String toString() {
        return "VehiclesAndAppliancesDTO{" +
                "bikeNo='" + bikeNo + '\'' +
                ", carNo='" + carNo + '\'' +
                ", noOfCycles=" + noOfCycles +
                ", shoeSize=" + shoeSize +
                ", noOfShoes=" + noOfShoes +
                ", laptopModel='" + laptopModel + '\'' +
                ", tvModel='" + tvModel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VehiclesAndAppliancesDTO that = (VehiclesAndAppliancesDTO) o;
        return noOfCycles == that.noOfCycles && shoeSize == that.shoeSize && noOfShoes == that.noOfShoes && Objects.equals(bikeNo, that.bikeNo) && Objects.equals(carNo, that.carNo) && Objects.equals(laptopModel, that.laptopModel) && Objects.equals(tvModel, that.tvModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bikeNo, carNo, noOfCycles, shoeSize, noOfShoes, laptopModel, tvModel);
    }

    public String getBikeNo() {
        return bikeNo;
    }

    public void setBikeNo(String bikeNo) {
        this.bikeNo = bikeNo;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
    }

    public int getNoOfCycles() {
        return noOfCycles;
    }

    public void setNoOfCycles(int noOfCycles) {
        this.noOfCycles = noOfCycles;
    }

    public int getNoOfShoes() {
        return noOfShoes;
    }

    public void setNoOfShoes(int noOfShoes) {
        this.noOfShoes = noOfShoes;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public String getTvModel() {
        return tvModel;
    }

    public void setTvModel(String tvModel) {
        this.tvModel = tvModel;
    }

    @Override
    public int compareTo(VehiclesAndAppliancesDTO o) {
        return this.carNo.compareTo(o.carNo);
    }
}
