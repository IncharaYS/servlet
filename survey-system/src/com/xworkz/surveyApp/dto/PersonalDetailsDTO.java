package com.xworkz.surveyApp.dto;

import java.io.Serializable;
import java.util.Objects;

public class PersonalDetailsDTO implements Serializable,Comparable<PersonalDetailsDTO> {
    private String name;
    private int age;
    private String dateOfBirth;
    private String bloodGroup;
    private double height;
    private double weight;
    private String complexion;
    private String motherTongue;
    private String religion;
    private String caste;

    public PersonalDetailsDTO(String name,int age, String dateOfBirth,String bloodGroup,double height,double weight,  String complexion,   String motherTongue,  String religion,String caste) {
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.caste = caste;
        this.complexion = complexion;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.motherTongue = motherTongue;
        this.name = name;
        this.religion = religion;
        this.weight = weight;
    }
    public PersonalDetailsDTO(){}

    @Override
    public String toString() {
        return "PersonalDetailsDTO{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", complexion='" + complexion + '\'' +
                ", motherTongue='" + motherTongue + '\'' +
                ", religion='" + religion + '\'' +
                ", caste='" + caste + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonalDetailsDTO that = (PersonalDetailsDTO) o;
        return age == that.age && Double.compare(height, that.height) == 0 && Double.compare(weight, that.weight) == 0 && Objects.equals(name, that.name) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(bloodGroup, that.bloodGroup) && Objects.equals(complexion, that.complexion) && Objects.equals(motherTongue, that.motherTongue) && Objects.equals(religion, that.religion) && Objects.equals(caste, that.caste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dateOfBirth, bloodGroup, height, weight, complexion, motherTongue, religion, caste);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public int compareTo(PersonalDetailsDTO o) {
        return this.name.compareTo(o.name);
    }
}
