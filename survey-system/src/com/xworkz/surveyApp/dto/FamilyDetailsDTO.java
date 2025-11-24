package com.xworkz.surveyApp.dto;

import java.io.Serializable;
import java.util.Objects;

public class FamilyDetailsDTO implements Serializable,Comparable<FamilyDetailsDTO> {

    private String fathersName;
    private String mothersName;
    private String maritalStatus;
    private String spouseName;
    private int noOfChildren;
    private int noOfFamilyMembers;
    private String friendsName;
    private String nativePlace;

    public FamilyDetailsDTO(String fathersName, String mothersName,String maritalStatus,String spouseName,int noOfChildren, int noOfFamilyMembers,String friendsName,   String nativePlace) {
        this.fathersName = fathersName;
        this.friendsName = friendsName;
        this.maritalStatus = maritalStatus;
        this.mothersName = mothersName;
        this.nativePlace = nativePlace;
        this.noOfChildren = noOfChildren;
        this.noOfFamilyMembers = noOfFamilyMembers;
        this.spouseName = spouseName;
    }

    public FamilyDetailsDTO(){

    }

    @Override
    public String toString() {
        return "FamilyDetailsDTO{" +
                "fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", spouseName='" + spouseName + '\'' +
                ", noOfChildren=" + noOfChildren +
                ", noOfFamilyMembers=" + noOfFamilyMembers +
                ", friendsName='" + friendsName + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FamilyDetailsDTO that = (FamilyDetailsDTO) o;
        return noOfChildren == that.noOfChildren && noOfFamilyMembers == that.noOfFamilyMembers && Objects.equals(fathersName, that.fathersName) && Objects.equals(mothersName, that.mothersName) && Objects.equals(maritalStatus, that.maritalStatus) && Objects.equals(spouseName, that.spouseName) && Objects.equals(friendsName, that.friendsName) && Objects.equals(nativePlace, that.nativePlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fathersName, mothersName, maritalStatus, spouseName, noOfChildren, noOfFamilyMembers, friendsName, nativePlace);
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getFriendsName() {
        return friendsName;
    }

    public void setFriendsName(String friendsName) {
        this.friendsName = friendsName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public int getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(int noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public int getNoOfFamilyMembers() {
        return noOfFamilyMembers;
    }

    public void setNoOfFamilyMembers(int noOfFamilyMembers) {
        this.noOfFamilyMembers = noOfFamilyMembers;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    @Override
    public int compareTo(FamilyDetailsDTO o) {
        return this.noOfFamilyMembers-o.noOfFamilyMembers;
    }
}
