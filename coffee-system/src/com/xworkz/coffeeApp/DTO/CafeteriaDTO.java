package com.xworkz.coffeeApp.DTO;

import java.io.Serializable;
import java.util.Objects;

public class CafeteriaDTO implements Serializable,Comparable<CafeteriaDTO> {
    private String name;
    private String location;
    private String franchiseName;
    private String ownerName;
    private String gstNo;

    public CafeteriaDTO(){

    }

    public CafeteriaDTO(String name,  String location,String franchiseName, String ownerName, String gstNo) {
        this.franchiseName = franchiseName;
        this.ownerName = ownerName;
        this.name = name;
        this.location = location;
        this.gstNo = gstNo;
    }

    public String getFranchiseName() {
        return franchiseName;
    }

    public void setFranchiseName(String franchiseName) {
        this.franchiseName = franchiseName;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    @Override
    public String toString() {
        return "CafeteriaDTO{" +
                "franchiseName=" + franchiseName +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", gstNo='" + gstNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CafeteriaDTO that = (CafeteriaDTO) o;
        return Objects.equals(franchiseName, that.franchiseName)&& Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(ownerName, that.ownerName) && Objects.equals(gstNo, that.gstNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, franchiseName, ownerName, gstNo);
    }

    @Override
    public int compareTo(CafeteriaDTO o) {
        return this.getName().compareTo(o.getName());
    }
}
