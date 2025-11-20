package com.xworkz.surveyApp.service;

import com.xworkz.surveyApp.DTO.SurveyDTO;
import com.xworkz.surveyApp.exceptions.DataInvalidException;

public class SurveyServiceImpl implements SurveyService {

    @Override
    public void validateData(SurveyDTO surveyDTO) throws DataInvalidException {

        boolean isInvalid = false;
        System.out.println("Inside validateData");
        System.out.println(surveyDTO);
        if (surveyDTO!=null) {


            if (surveyDTO.getName()==null||surveyDTO.getName().length()<3) {
                System.err.println("Invalid Name entered");
                isInvalid = true;
            }
            else if (surveyDTO.getAge()==0||surveyDTO.getAge()>130) {
                System.err.println("Invalid Age entered");
                isInvalid = true;
            }

            else if (surveyDTO.getDateOfBirth()==null||surveyDTO.getDateOfBirth().length()<8) {
                System.err.println("Invalid Date Of Birth entered");
                isInvalid = true;
            }

            else if (surveyDTO.getBloodGroup()==null||surveyDTO.getBloodGroup().isEmpty()) {
                System.err.println("Invalid Blood Group entered");
                isInvalid = true;
            }

            else if (surveyDTO.getHeight()==0||surveyDTO.getHeight()>300) {
                System.err.println("Invalid Height entered");
                isInvalid = true;
            }

            else if (surveyDTO.getWeight()==0||surveyDTO.getWeight()>1000) {
                System.err.println("Invalid Weight entered");
                isInvalid = true;
            }

            else if (surveyDTO.getComplexion()==null||surveyDTO.getComplexion().isEmpty()) {
                System.err.println("Invalid Complexion entered");
                isInvalid = true;
            }
            else if (surveyDTO.getMotherTongue()==null||surveyDTO.getMotherTongue().length()<4) {
                System.err.println("Invalid Mother Tongue entered");
                isInvalid = true;
            }
            else if (surveyDTO.getReligion()==null||surveyDTO.getReligion().length()<5) {
                System.err.println("Invalid Religion entered");
                isInvalid = true;
            }
            else if (surveyDTO.getCaste()==null||surveyDTO.getCaste().length()<4) {
                System.err.println("Invalid Caste entered");
                isInvalid = true;
            }



            else if (surveyDTO.getFathersName()==null||surveyDTO.getFathersName().length()<3) {
                System.err.println("Invalid Fathers Name entered");
                isInvalid = true;
            }

            else if (surveyDTO.getMothersName()==null||surveyDTO.getMothersName().length()<3) {
                System.err.println("Invalid Mothers Name entered");
                isInvalid = true;
            }

            else if (surveyDTO.getMaritalStatus()==null||surveyDTO.getMaritalStatus().length()<6) {
                System.err.println("Invalid Marital Status entered");
                isInvalid = true;
            }

            else if (surveyDTO.getSpouseName()==null||surveyDTO.getSpouseName().length()<3) {
                System.err.println("Invalid Spouse Name entered");
                isInvalid = true;
            }
            else if (surveyDTO.getNoOfChildren()<0||surveyDTO.getNoOfChildren()>100) {
                System.err.println("Invalid Number Of Children entered");
                isInvalid = true;
            }

            else if (surveyDTO.getNoOfFamilyMembers()<0||surveyDTO.getNoOfFamilyMembers()>100) {
                System.err.println("Invalid Number Of Family Members entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFriendsName()==null||surveyDTO.getFriendsName().length()<3) {
                System.err.println("Invalid Friend Name entered");
                isInvalid = true;
            }

            else if (surveyDTO.getNativePlace()==null||surveyDTO.getNativePlace().length()<3) {
                System.err.println("Invalid Native Place entered");
                isInvalid = true;
            }



            else if (surveyDTO.getMobileNo() <= 0||surveyDTO.getNativePlace().length()<3) {
                System.err.println("Invalid Mobile Number entered");
                isInvalid = true;
            }

            else if (surveyDTO.getAadhaarNo()==null||surveyDTO.getAadhaarNo().length()<12) {
                System.err.println("Invalid Aadhaar Number entered");
                isInvalid = true;
            }
            else if (surveyDTO.getPanNo()==null|| surveyDTO.getPanNo().length()<10) {
                System.err.println("Invalid PAN Number entered");
                isInvalid = true;
            }

            else if (surveyDTO.getVoterId()==null||surveyDTO.getVoterId().length()<10) {
                System.err.println("Invalid Voter ID entered");
                isInvalid = true;
            }

            else if (surveyDTO.getPassportNo()==null||surveyDTO.getPassportNo().length()<8) {
                System.err.println("Invalid Passport Number entered");
                isInvalid = true;
            }

            else if (surveyDTO.getRationCardNo()==null|| surveyDTO.getRationCardNo().length()<10) {
                System.err.println("Invalid Ration Card Number entered");
                isInvalid = true;
            }


            else if (surveyDTO.getIncome()<0) {
                System.err.println("Invalid Income entered");
                isInvalid = true;
            }

            else if (surveyDTO.getBankAccount()==null||surveyDTO.getBankAccount().length()<3) {
                System.err.println("Invalid Bank Account entered");
                isInvalid = true;
            }

            else if (surveyDTO.getInsuranceCompany() == null || surveyDTO.getInsuranceCompany().length() <3) {
                System.err.println("Invalid Insurance Company entered");
                isInvalid = true;
            }

            else if (surveyDTO.getInsuranceNo() == null || surveyDTO.getInsuranceNo().length() < 3) {
                System.err.println("Invalid Insurance Number entered");
                isInvalid = true;
            }

            else if (!(surveyDTO.isTaxesPaid()==true||surveyDTO.isTaxesPaid()==false)) {
                System.err.println("Invalid status");
                isInvalid = true;
            }

            else if (surveyDTO.getShareHolding()==null||surveyDTO.getShareHolding().length()<0) {
                System.err.println("Invalid Share Holding entered");
                isInvalid = true;
            }

            else if (surveyDTO.getLandInAcres()<0||surveyDTO.getLandInAcres()>999999999) {
                System.err.println("Invalid Land In Acres entered");
                isInvalid = true;
            }

            else if (surveyDTO.getTotalSites()<0||surveyDTO.getTotalSites()>999999999) {
                System.err.println("Invalid Total Sites entered");
                isInvalid = true;
            }

            else if (surveyDTO.getRtcNo()==null||surveyDTO.getRtcNo().length()<3) {
                System.err.println("Invalid RTC Number entered");
                isInvalid = true;
            }
            else if (surveyDTO.getBuilderOwner()==null||surveyDTO.getBuilderOwner().length()<3) {
                System.err.println("Invalid Builder/Owner entered");
                isInvalid = true;
            }
            else if (surveyDTO.getElectricityBillNo() == null || surveyDTO.getElectricityBillNo().length() < 3) {
                System.err.println("Invalid Electricity Bill Number entered");
                isInvalid = true;
            }
            else if (surveyDTO.getWaterBillNo() == null || surveyDTO.getWaterBillNo().length() < 3) {
                System.err.println("Invalid Water Bill Number entered");
                isInvalid = true;
            }


            else if (surveyDTO.getBikeNo() == null || surveyDTO.getBikeNo().length() < 3) {
                System.err.println("Invalid Bike Number entered");
                isInvalid = true;
            }

            else if (surveyDTO.getCarNo() == null || surveyDTO.getCarNo().length() < 3) {
                System.err.println("Invalid Car Number entered");
                isInvalid = true;
            }
            else if (surveyDTO.getNoOfCycles() < 0 || surveyDTO.getNoOfCycles() > 999999999) {
                System.err.println("Invalid Number Of Cycles entered");
                isInvalid = true;
            }
            else if (surveyDTO.getShoeSize() < 0 || surveyDTO.getShoeSize() > 999999999) {
                System.err.println("Invalid Shoe Size entered");
                isInvalid = true;
            }
            else if (surveyDTO.getNoOfShoes() < 0 || surveyDTO.getNoOfShoes() > 999999999) {
                System.err.println("Invalid Number Of Shoes entered");
                isInvalid = true;
            }
            else if (surveyDTO.getLaptopModel() == null || surveyDTO.getLaptopModel().length() < 3) {
                System.err.println("Invalid Laptop Model entered");
                isInvalid = true;
            }
            else if (surveyDTO.getTvModel() == null || surveyDTO.getTvModel().length() < 3) {
                System.err.println("Invalid TV Model entered");
                isInvalid = true;
            }

            // Loans & Other
            else if (surveyDTO.getCrop() == null || surveyDTO.getCrop().length() < 3) {
                System.err.println("Invalid Crop entered");
                isInvalid = true;
            }
            else if (surveyDTO.getLoanNo() == null || surveyDTO.getLoanNo().length() < 3) {
                System.err.println("Invalid Loan Number entered");
                isInvalid = true;
            }
            else if (surveyDTO.getLoanBalance() < 0 || surveyDTO.getLoanBalance() > 999999999) {
                System.err.println("Invalid Loan Balance entered");
                isInvalid = true;
            }
            else if (surveyDTO.getLoanType() == null || surveyDTO.getLoanType().length() < 3) {
                System.err.println("Invalid Loan Type entered");
                isInvalid = true;
            }
            else if (surveyDTO.getGoldInGms() < 0 || surveyDTO.getGoldInGms() > 999999999) {
                System.err.println("Invalid Gold In Grams entered");
                isInvalid = true;
            }
            else if (surveyDTO.getSilverInGms() < 0 || surveyDTO.getSilverInGms() > 999999999) {
                System.err.println("Invalid Silver In Grams entered");
                isInvalid = true;
            }
            else if (surveyDTO.getNoOfCows() < 0 || surveyDTO.getNoOfCows() > 999999999) {
                System.err.println("Invalid Number Of Cows entered");
                isInvalid = true;
            }

            else if (surveyDTO.getPetName() == null || surveyDTO.getPetName().length() < 3) {
                System.err.println("Invalid Pet Name entered");
                isInvalid = true;
            }

            else if (surveyDTO.getKnownDiseases() == null || surveyDTO.getKnownDiseases().length() < 3) {
                System.err.println("Invalid Known Diseases entered");
                isInvalid = true;
            }

            else if (surveyDTO.isGovernmentEmployee()==true||surveyDTO.isGovernmentEmployee()==false) {
                System.err.println("Invalid data entered");
                isInvalid = true;
            }
            else if (surveyDTO.getOccupation()==null||surveyDTO.getOccupation().length()<3) {
                System.err.println("Invalid Occupation entered");
                isInvalid = true;
            }
            else if (surveyDTO.getEducation()==null||surveyDTO.getEducation().length()<3) {
                System.err.println("Invalid Education entered");
                isInvalid = true;
            }

            else{


            if (isInvalid) {
                throw new DataInvalidException("Data must be valid");
            } else {
                System.out.println("Data is valid");
                System.out.println(surveyDTO);
            }
            }
        }
    }
}
