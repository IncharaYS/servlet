package com.xworkz.surveyApp.DTO;

import java.io.Serializable;
import java.util.Objects;

public class SurveyDTO implements Serializable,Comparable<SurveyDTO> {
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


    private String fathersName;
    private String mothersName;
    private String maritalStatus;
    private String spouseName;
    private int noOfChildren;
    private int noOfFamilyMembers;
    private String friendsName;
    private String nativePlace;


    private long mobileNo;
    private String aadhaarNo;
    private String panNo;
    private String voterId;
    private String passportNo;
    private String rationCardNo;


    private double income;
    private String bankAccount;
    private String insuranceCompany;
    private String insuranceNo;
    private String taxesPaid;
    private String shareHolding;
    private double landInAcres;
    private int totalSites;
    private String rtcNo;
    private String builderOwner;
    private String electricityBillNo;
    private String waterBillNo;


    private String bikeNo;
    private String carNo;
    private int noOfCycles;
    private int shoeSize;
    private int noOfShoes;
    private String laptopModel;
    private String tvModel;



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



    public SurveyDTO(
            String name,
            int age,
            String dateOfBirth,
            String bloodGroup,
            double height,
            double weight,
            String complexion,
            String motherTongue,
            String religion,
            String caste,

            String fathersName,
            String mothersName,
            String maritalStatus,
            String spouseName,
            int noOfChildren,
            int noOfFamilyMembers,
            String friendsName,
            String nativePlace,

            long mobileNo,
            String aadhaarNo,
            String panNo,
            String voterId,
            String passportNo,
            String rationCardNo,

            double income,
            String bankAccount,
            String insuranceCompany,
            String insuranceNo,
            String taxesPaid,
            String shareHolding,
            double landInAcres,
            int totalSites,
            String rtcNo,
            String builderOwner,
            String electricityBillNo,
            String waterBillNo,

            String bikeNo,
            String carNo,
            int noOfCycles,
            int shoeSize,
            int noOfShoes,
            String laptopModel,
            String tvModel,
            String crop,
            String loanNo,
            double loanBalance,
            String loanType,
            double goldInGms,
            double silverInGms,
            int noOfCows,
            String petName,
            String knownDiseases,
            String isDisabled,
            String isGovernmentEmployee,
            String occupation,
            String education
    ){
        this.name=name;
        this.age=age;
        this.dateOfBirth=dateOfBirth;
        this.bloodGroup=bloodGroup;
        this.height=height;
        this.weight=weight;
        this.complexion=complexion;
        this.motherTongue=motherTongue;
        this.religion=religion;
        this.caste = caste;

        this.fathersName=fathersName;
        this.mothersName=mothersName;
        this.maritalStatus=maritalStatus;
        this.spouseName=spouseName;
        this.noOfChildren=noOfChildren;
        this.noOfFamilyMembers=noOfFamilyMembers;
        this.friendsName = friendsName;
        this.nativePlace=nativePlace;

        this.mobileNo=mobileNo;
        this.aadhaarNo=aadhaarNo;
        this.panNo=panNo;
        this.voterId=voterId;
        this.passportNo=passportNo;
        this.rationCardNo=rationCardNo;

        this.income=income;
        this.bankAccount=bankAccount;
        this.insuranceCompany=insuranceCompany;
        this.insuranceNo=insuranceNo;
        this.taxesPaid=taxesPaid;
        this.shareHolding=shareHolding;
        this.landInAcres=landInAcres;
        this.totalSites=totalSites;
        this.rtcNo=rtcNo;
        this.builderOwner=builderOwner;
        this.electricityBillNo=electricityBillNo;
        this.waterBillNo=waterBillNo;

        this.bikeNo=bikeNo;
        this.carNo=carNo;
        this.noOfCycles=noOfCycles;
        this.shoeSize=shoeSize;
        this.noOfShoes=noOfShoes;
        this.laptopModel=laptopModel;
        this.tvModel=tvModel;
        this.crop=crop;
        this.loanNo=loanNo;
        this.loanBalance=loanBalance;
        this.loanType=loanType;
        this.goldInGms=goldInGms;
        this.silverInGms=silverInGms;
        this.noOfCows=noOfCows;
        this.petName=petName;
        this.knownDiseases=knownDiseases;
        this.isDisabled=isDisabled;
        this.isGovernmentEmployee=isGovernmentEmployee;
        this.occupation=occupation;
        this.education=education;
    }


    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup=bloodGroup;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBikeNo() {
        return bikeNo;
    }

    public void setBikeNo(String bikeNo) {
        this.bikeNo = bikeNo;
    }

    public String getBuilderOwner() {
        return builderOwner;
    }

    public void setBuilderOwner(String builderOwner) {
        this.builderOwner = builderOwner;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getElectricityBillNo() {
        return electricityBillNo;
    }

    public void setElectricityBillNo(String electricityBillNo) {
        this.electricityBillNo = electricityBillNo;
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

    public double getGoldInGms() {
        return goldInGms;
    }

    public void setGoldInGms(double goldInGms) {
        this.goldInGms = goldInGms;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String isDisabled() {
        return isDisabled;
    }

    public void setDisabled(String disabled) {
        isDisabled = disabled;
    }

    public String isGovernmentEmployee() {
        return isGovernmentEmployee;
    }

    public void setGovernmentEmployee(String governmentEmployee) {
        isGovernmentEmployee = governmentEmployee;
    }

    public String getKnownDiseases() {
        return knownDiseases;
    }

    public void setKnownDiseases(String knownDiseases) {
        this.knownDiseases = knownDiseases;
    }

    public double getLandInAcres() {
        return landInAcres;
    }

    public void setLandInAcres(double landInAcres) {
        this.landInAcres = landInAcres;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
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

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNoOfCows() {
        return noOfCows;
    }

    public void setNoOfCows(int noOfCows) {
        this.noOfCows = noOfCows;
    }

    public int getNoOfCycles() {
        return noOfCycles;
    }

    public void setNoOfCycles(int noOfCycles) {
        this.noOfCycles = noOfCycles;
    }

    public int getNoOfFamilyMembers() {
        return noOfFamilyMembers;
    }

    public void setNoOfFamilyMembers(int noOfFamilyMembers) {
        this.noOfFamilyMembers = noOfFamilyMembers;
    }

    public int getNoOfShoes() {
        return noOfShoes;
    }

    public void setNoOfShoes(int noOfShoes) {
        this.noOfShoes = noOfShoes;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
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

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getRationCardNo() {
        return rationCardNo;
    }

    public void setRationCardNo(String rationCardNo) {
        this.rationCardNo = rationCardNo;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getRtcNo() {
        return rtcNo;
    }

    public void setRtcNo(String rtcNo) {
        this.rtcNo = rtcNo;
    }

    public String getShareHolding() {
        return shareHolding;
    }

    public void setShareHolding(String shareHolding) {
        this.shareHolding = shareHolding;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public double getSilverInGms() {
        return silverInGms;
    }

    public void setSilverInGms(double silverInGms) {
        this.silverInGms = silverInGms;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String isTaxesPaid() {
        return taxesPaid;
    }

    public void setTaxesPaid(String taxesPaid) {
        this.taxesPaid = taxesPaid;
    }

    public int getTotalSites() {
        return totalSites;
    }

    public void setTotalSites(int totalSites) {
        this.totalSites = totalSites;
    }

    public String getTvModel() {
        return tvModel;
    }

    public void setTvModel(String tvModel) {
        this.tvModel = tvModel;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getWaterBillNo() {
        return waterBillNo;
    }

    public void setWaterBillNo(String waterBillNo) {
        this.waterBillNo = waterBillNo;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public SurveyDTO(){

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SurveyDTO surveyDTO = (SurveyDTO) o;
        return age == surveyDTO.age && Double.compare(height, surveyDTO.height) == 0 && Double.compare(weight, surveyDTO.weight) == 0 && noOfChildren == surveyDTO.noOfChildren && noOfFamilyMembers == surveyDTO.noOfFamilyMembers && mobileNo == surveyDTO.mobileNo && Double.compare(income, surveyDTO.income) == 0 && Objects.equals(taxesPaid, surveyDTO.taxesPaid) && Double.compare(landInAcres, surveyDTO.landInAcres) == 0 && totalSites == surveyDTO.totalSites && noOfCycles == surveyDTO.noOfCycles && shoeSize == surveyDTO.shoeSize && noOfShoes == surveyDTO.noOfShoes && Double.compare(loanBalance, surveyDTO.loanBalance) == 0 && Double.compare(goldInGms, surveyDTO.goldInGms) == 0 && Double.compare(silverInGms, surveyDTO.silverInGms) == 0 && noOfCows == surveyDTO.noOfCows && Objects.equals(isDisabled, surveyDTO.isDisabled)  && Objects.equals(isGovernmentEmployee, surveyDTO.isGovernmentEmployee) && Objects.equals(name, surveyDTO.name)&&Objects.equals(bloodGroup, surveyDTO.bloodGroup) && Objects.equals(dateOfBirth, surveyDTO.dateOfBirth) && Objects.equals(complexion, surveyDTO.complexion) && Objects.equals(motherTongue, surveyDTO.motherTongue) && Objects.equals(religion, surveyDTO.religion) && Objects.equals(caste, surveyDTO.caste) && Objects.equals(fathersName, surveyDTO.fathersName) && Objects.equals(mothersName, surveyDTO.mothersName) && Objects.equals(maritalStatus, surveyDTO.maritalStatus) && Objects.equals(spouseName, surveyDTO.spouseName) && Objects.equals(friendsName, surveyDTO.friendsName) && Objects.equals(nativePlace, surveyDTO.nativePlace) && Objects.equals(aadhaarNo, surveyDTO.aadhaarNo) && Objects.equals(panNo, surveyDTO.panNo) && Objects.equals(voterId, surveyDTO.voterId) && Objects.equals(passportNo, surveyDTO.passportNo) && Objects.equals(rationCardNo, surveyDTO.rationCardNo) && Objects.equals(bankAccount, surveyDTO.bankAccount) && Objects.equals(insuranceCompany, surveyDTO.insuranceCompany) && Objects.equals(insuranceNo, surveyDTO.insuranceNo) && Objects.equals(shareHolding, surveyDTO.shareHolding) && Objects.equals(rtcNo, surveyDTO.rtcNo) && Objects.equals(builderOwner, surveyDTO.builderOwner) && Objects.equals(electricityBillNo, surveyDTO.electricityBillNo) && Objects.equals(waterBillNo, surveyDTO.waterBillNo) && Objects.equals(bikeNo, surveyDTO.bikeNo) && Objects.equals(carNo, surveyDTO.carNo) && Objects.equals(laptopModel, surveyDTO.laptopModel) && Objects.equals(tvModel, surveyDTO.tvModel) && Objects.equals(crop, surveyDTO.crop) && Objects.equals(loanNo, surveyDTO.loanNo) && Objects.equals(loanType, surveyDTO.loanType) && Objects.equals(petName, surveyDTO.petName) && Objects.equals(knownDiseases, surveyDTO.knownDiseases) && Objects.equals(occupation, surveyDTO.occupation) && Objects.equals(education, surveyDTO.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dateOfBirth, bloodGroup,height, weight, complexion, motherTongue, religion, caste, fathersName, mothersName, maritalStatus, spouseName, noOfChildren, noOfFamilyMembers, friendsName, nativePlace, mobileNo, aadhaarNo, panNo, voterId, passportNo, rationCardNo, income, bankAccount, insuranceCompany, insuranceNo, taxesPaid, shareHolding, landInAcres, totalSites, rtcNo, builderOwner, electricityBillNo, waterBillNo, bikeNo, carNo, noOfCycles, shoeSize, noOfShoes, laptopModel, tvModel, crop, loanNo, loanBalance, loanType, goldInGms, silverInGms, noOfCows, petName, knownDiseases, isDisabled, isGovernmentEmployee, occupation, education);
    }

    @Override
    public String toString() {
        return "SurveyDTO{" +
                "aadhaarNo='" + aadhaarNo + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", complexion='" + complexion + '\'' +
                ", motherTongue='" + motherTongue + '\'' +
                ", religion='" + religion + '\'' +
                ", caste='" + caste + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", spouseName='" + spouseName + '\'' +
                ", noOfChildren=" + noOfChildren +
                ", noOfFamilyMembers=" + noOfFamilyMembers +
                ", friendsName='" + friendsName + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", mobileNo=" + mobileNo +
                ", panNo='" + panNo + '\'' +
                ", voterId='" + voterId + '\'' +
                ", passportNo='" + passportNo + '\'' +
                ", rationCardNo='" + rationCardNo + '\'' +
                ", income=" + income +
                ", bankAccount='" + bankAccount + '\'' +
                ", insuranceCompany='" + insuranceCompany + '\'' +
                ", insuranceNo='" + insuranceNo + '\'' +
                ", taxesPaid=" + taxesPaid +
                ", shareHolding='" + shareHolding + '\'' +
                ", landInAcres=" + landInAcres +
                ", totalSites=" + totalSites +
                ", rtcNo='" + rtcNo + '\'' +
                ", builderOwner='" + builderOwner + '\'' +
                ", electricityBillNo='" + electricityBillNo + '\'' +
                ", waterBillNo='" + waterBillNo + '\'' +
                ", bikeNo='" + bikeNo + '\'' +
                ", carNo='" + carNo + '\'' +
                ", noOfCycles=" + noOfCycles +
                ", shoeSize=" + shoeSize +
                ", noOfShoes=" + noOfShoes +
                ", laptopModel='" + laptopModel + '\'' +
                ", tvModel='" + tvModel + '\'' +
                ", crop='" + crop + '\'' +
                ", loanNo='" + loanNo + '\'' +
                ", loanBalance=" + loanBalance +
                ", loanType='" + loanType + '\'' +
                ", goldInGms=" + goldInGms +
                ", silverInGms=" + silverInGms +
                ", noOfCows=" + noOfCows +
                ", petName='" + petName + '\'' +
                ", knownDiseases='" + knownDiseases + '\'' +
                ", isDisabled=" + isDisabled +
                ", isGovernmentEmployee=" + isGovernmentEmployee +
                ", occupation='" + occupation + '\'' +
                ", education='" + education + '\'' +
                '}';
    }

    @Override
    public int compareTo(SurveyDTO o) {
        return this.getName().compareTo(o.getName());
    }
}
