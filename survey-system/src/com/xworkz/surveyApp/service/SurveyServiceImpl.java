package com.xworkz.surveyApp.service;

import com.xworkz.surveyApp.dto.SurveyDTO;
import com.xworkz.surveyApp.exceptions.DataInvalidException;

public class SurveyServiceImpl implements SurveyService {

    @Override
    public void validateData(SurveyDTO surveyDTO) throws DataInvalidException {

        boolean isInvalid = false;
        System.out.println("Inside validateData");
        System.out.println(surveyDTO);
        if (surveyDTO!=null) {


            if (surveyDTO.getPersonalDetails().getName()==null||surveyDTO.getPersonalDetails().getName().length()<3) {
                System.err.println("Invalid Name entered");
                isInvalid = true;
            }
            else if (surveyDTO.getPersonalDetails().getAge()<0||surveyDTO.getPersonalDetails().getAge()>130) {
                System.err.println("Invalid Age entered");
                isInvalid = true;
            }

            else if (surveyDTO.getPersonalDetails().getDateOfBirth()==null||surveyDTO.getPersonalDetails().getDateOfBirth().length()<8) {
                System.err.println("Invalid Date Of Birth entered");
                isInvalid = true;
            }

            else if (surveyDTO.getPersonalDetails().getBloodGroup()==null||surveyDTO.getPersonalDetails().getBloodGroup().isEmpty()) {
                System.err.println("Invalid Blood Group entered");
                isInvalid = true;
            }

            else if (surveyDTO.getPersonalDetails().getHeight()<0||surveyDTO.getPersonalDetails().getHeight()>300) {
                System.err.println("Invalid Height entered");
                isInvalid = true;
            }

            else if (surveyDTO.getPersonalDetails().getWeight()<0||surveyDTO.getPersonalDetails().getWeight()>1000) {
                System.err.println("Invalid Weight entered");
                isInvalid = true;
            }

            else if (surveyDTO.getPersonalDetails().getComplexion()==null||surveyDTO.getPersonalDetails().getComplexion().isEmpty()) {
                System.err.println("Invalid Complexion entered");
                isInvalid = true;
            }
            else if (surveyDTO.getPersonalDetails().getMotherTongue()==null||surveyDTO.getPersonalDetails().getMotherTongue().length()<4) {
                System.err.println("Invalid Mother Tongue entered");
                isInvalid = true;
            }
            else if (surveyDTO.getPersonalDetails().getReligion()==null||surveyDTO.getPersonalDetails().getReligion().length()<5) {
                System.err.println("Invalid Religion entered");
                isInvalid = true;
            }
            else if (surveyDTO.getPersonalDetails().getCaste()==null||surveyDTO.getPersonalDetails().getCaste().length()<4) {
                System.err.println("Invalid Caste entered");
                isInvalid = true;
            }





            else if (surveyDTO.getFamilyDetails().getFathersName()==null||surveyDTO.getFamilyDetails().getFathersName().length()<3) {
                System.err.println("Invalid Fathers Name entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFamilyDetails().getMothersName()==null||surveyDTO.getFamilyDetails().getMothersName().length()<3) {
                System.err.println("Invalid Mothers Name entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFamilyDetails().getMaritalStatus()==null||surveyDTO.getFamilyDetails().getMaritalStatus().length()<6) {
                System.err.println("Invalid Marital Status entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFamilyDetails().getSpouseName()==null||surveyDTO.getFamilyDetails().getSpouseName().length()<3) {
                System.err.println("Invalid Spouse Name entered");
                isInvalid = true;
            }
            else if (surveyDTO.getFamilyDetails().getNoOfChildren()<0||surveyDTO.getFamilyDetails().getNoOfChildren()>100) {
                System.err.println("Invalid Number Of Children entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFamilyDetails().getNoOfFamilyMembers()<0||surveyDTO.getFamilyDetails().getNoOfFamilyMembers()>100) {
                System.err.println("Invalid Number Of Family Members entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFamilyDetails().getFriendsName()==null||surveyDTO.getFamilyDetails().getFriendsName().length()<3) {
                System.err.println("Invalid Friend Name entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFamilyDetails().getNativePlace()==null||surveyDTO.getFamilyDetails().getNativePlace().length()<3) {
                System.err.println("Invalid Native Place entered");
                isInvalid = true;
            }





            else if (surveyDTO.getContactDetails().getMobileNo()<0) {
                System.err.println("Invalid Mobile Number entered");
                isInvalid = true;
            }

            else if (surveyDTO.getContactDetails().getAadhaarNo()==null||surveyDTO.getContactDetails().getAadhaarNo().length()<12) {
                System.err.println("Invalid Aadhaar Number entered");
                isInvalid = true;
            }
            else if (surveyDTO.getContactDetails().getPanNo()==null|| surveyDTO.getContactDetails().getPanNo().length()<10) {
                System.err.println("Invalid PAN Number entered");
                isInvalid = true;
            }

            else if (surveyDTO.getContactDetails().getVoterId()==null||surveyDTO.getContactDetails().getVoterId().length()<10) {
                System.err.println("Invalid Voter ID entered");
                isInvalid = true;
            }

            else if (surveyDTO.getContactDetails().getPassportNo()==null||surveyDTO.getContactDetails().getPassportNo().length()<8) {
                System.err.println("Invalid Passport Number entered");
                isInvalid = true;
            }

            else if (surveyDTO.getContactDetails().getRationCardNo()==null|| surveyDTO.getContactDetails().getRationCardNo().length()<10) {
                System.err.println("Invalid Ration Card Number entered");
                isInvalid = true;
            }


            else if (surveyDTO.getFinanceDetails().getIncome()<0) {
                System.err.println("Invalid Income entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFinanceDetails().getBankAccount()==null||surveyDTO.getFinanceDetails().getBankAccount().length()<3) {
                System.err.println("Invalid Bank Account entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFinanceDetails().getInsuranceCompany() == null || surveyDTO.getFinanceDetails().getInsuranceCompany().length() <3) {
                System.err.println("Invalid Insurance Company entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFinanceDetails().getInsuranceNo() == null || surveyDTO.getFinanceDetails().getInsuranceNo().length() < 3) {
                System.err.println("Invalid Insurance Number entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFinanceDetails().getTaxesPaid()==null) {
                System.err.println("Invalid status for tax");
                isInvalid = true;
            }

            else if (surveyDTO.getLoansAndAssetsDetails().getIsDisabled()==null) {
                System.err.println("Invalid status for disability");
                isInvalid = true;
            }

            else if (surveyDTO.getFinanceDetails().getShareHolding()==null||surveyDTO.getFinanceDetails().getShareHolding().length()<4) {
                System.err.println("Invalid Share Holding entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFinanceDetails().getLandInAcres()<0||surveyDTO.getFinanceDetails().getLandInAcres()>999999999) {
                System.err.println("Invalid Land In Acres entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFinanceDetails().getTotalSites()<0||surveyDTO.getFinanceDetails().getTotalSites()>999999999) {
                System.err.println("Invalid Total Sites entered");
                isInvalid = true;
            }

            else if (surveyDTO.getFinanceDetails().getRtcNo()==null||surveyDTO.getFinanceDetails().getRtcNo().length()<3) {
                System.err.println("Invalid RTC Number entered");
                isInvalid = true;
            }
            else if (surveyDTO.getFinanceDetails().getBuildingOwner()==null||surveyDTO.getFinanceDetails().getBuildingOwner().length()<3) {
                System.err.println("Invalid Builder/Owner entered");
                isInvalid = true;
            }
            else if (surveyDTO.getFinanceDetails().getElectricityBillNo() == null || surveyDTO.getFinanceDetails().getElectricityBillNo().length() < 3) {
                System.err.println("Invalid Electricity Bill Number entered");
                isInvalid = true;
            }
            else if (surveyDTO.getFinanceDetails().getWaterBillNo() == null || surveyDTO.getFinanceDetails().getWaterBillNo().length() < 3) {
                System.err.println("Invalid Water Bill Number entered");
                isInvalid = true;
            }


            else if (surveyDTO.getVehiclesAndAppliances().getBikeNo() == null || surveyDTO.getVehiclesAndAppliances().getBikeNo().length() < 3) {
                System.err.println("Invalid Bike Number entered");
                isInvalid = true;
            }

            else if (surveyDTO.getVehiclesAndAppliances().getCarNo() == null || surveyDTO.getVehiclesAndAppliances().getCarNo().length() < 3) {
                System.err.println("Invalid Car Number entered");
                isInvalid = true;
            }
            else if (surveyDTO.getVehiclesAndAppliances().getNoOfCycles() < 0 || surveyDTO.getVehiclesAndAppliances().getNoOfCycles() > 999999999) {
                System.err.println("Invalid Number Of Cycles entered");
                isInvalid = true;
            }
            else if (surveyDTO.getVehiclesAndAppliances().getShoeSize() < 0 || surveyDTO.getVehiclesAndAppliances().getShoeSize() > 999999999) {
                System.err.println("Invalid Shoe Size entered");
                isInvalid = true;
            }
            else if (surveyDTO.getVehiclesAndAppliances().getNoOfShoes() < 0 || surveyDTO.getVehiclesAndAppliances().getNoOfShoes() > 999999999) {
                System.err.println("Invalid Number Of Shoes entered");
                isInvalid = true;
            }
            else if (surveyDTO.getVehiclesAndAppliances().getLaptopModel() == null || surveyDTO.getVehiclesAndAppliances().getLaptopModel().length() < 3) {
                System.err.println("Invalid Laptop Model entered");
                isInvalid = true;
            }
            else if (surveyDTO.getVehiclesAndAppliances().getTvModel() == null || surveyDTO.getVehiclesAndAppliances().getTvModel().length() < 3) {
                System.err.println("Invalid TV Model entered");
                isInvalid = true;
            }


            else if (surveyDTO.getLoansAndAssetsDetails().getCrop() == null || surveyDTO.getLoansAndAssetsDetails().getCrop().length() < 3) {
                System.err.println("Invalid Crop entered");
                isInvalid = true;
            }
            else if (surveyDTO.getLoansAndAssetsDetails().getLoanNo() == null || surveyDTO.getLoansAndAssetsDetails().getLoanNo().length() < 3) {
                System.err.println("Invalid Loan Number entered");
                isInvalid = true;
            }
            else if (surveyDTO.getLoansAndAssetsDetails().getLoanBalance() < 0 || surveyDTO.getLoansAndAssetsDetails().getLoanBalance() > 999999999) {
                System.err.println("Invalid Loan Balance entered");
                isInvalid = true;
            }
            else if (surveyDTO.getLoansAndAssetsDetails().getLoanType() == null || surveyDTO.getLoansAndAssetsDetails().getLoanType().length() < 3) {
                System.err.println("Invalid Loan Type entered");
                isInvalid = true;
            }
            else if (surveyDTO.getLoansAndAssetsDetails().getGoldInGms() < 0 || surveyDTO.getLoansAndAssetsDetails().getGoldInGms() > 999999999) {
                System.err.println("Invalid Gold In Grams entered");
                isInvalid = true;
            }
            else if (surveyDTO.getLoansAndAssetsDetails().getSilverInGms() < 0 || surveyDTO.getLoansAndAssetsDetails().getSilverInGms() > 999999999) {
                System.err.println("Invalid Silver In Grams entered");
                isInvalid = true;
            }
            else if (surveyDTO.getLoansAndAssetsDetails().getNoOfCows() < 0 || surveyDTO.getLoansAndAssetsDetails().getNoOfCows() > 999999999) {
                System.err.println("Invalid Number Of Cows entered");
                isInvalid = true;
            }

            else if (surveyDTO.getLoansAndAssetsDetails().getPetName() == null || surveyDTO.getLoansAndAssetsDetails().getPetName().length() < 3) {
                System.err.println("Invalid Pet Name entered");
                isInvalid = true;
            }

            else if (surveyDTO.getLoansAndAssetsDetails().getKnownDiseases() == null || surveyDTO.getLoansAndAssetsDetails().getKnownDiseases().length() < 3) {
                System.err.println("Invalid Known Diseases entered");
                isInvalid = true;
            }

            else if (surveyDTO.getLoansAndAssetsDetails().getIsGovernmentEmployee()==null) {
                System.err.println("Invalid data entered for govt emp");
                isInvalid = true;
            }
            else if (surveyDTO.getLoansAndAssetsDetails().getOccupation()==null||surveyDTO.getLoansAndAssetsDetails().getOccupation().length()<3) {
                System.err.println("Invalid Occupation entered");
                isInvalid = true;
            }
            else if(surveyDTO.getLoansAndAssetsDetails().getEducation()==null||surveyDTO.getLoansAndAssetsDetails().getEducation().length()<3) {
                System.err.println("Invalid Education entered");
                isInvalid = true;
            }
            else {
                System.out.println("All data is valid");
            }


            if (isInvalid) {
                throw new DataInvalidException("Data must be valid");
            } else {
                System.out.println("Data is valid");
                System.out.println(surveyDTO);

            }
        }
    }
}
