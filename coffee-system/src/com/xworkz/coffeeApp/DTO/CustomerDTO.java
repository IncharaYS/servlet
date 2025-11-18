package com.xworkz.coffeeApp.DTO;

import java.io.Serializable;
import java.util.Objects;

public class CustomerDTO implements Serializable,Comparable<CustomerDTO> {


    private String name;
    private long contactNo;
    private String flavor;
    private int quantity;
    private String paymentMode;

    public CustomerDTO(String name,long contactNo,String flavor, int quantity, String paymentMode) {
        this.contactNo = contactNo;
        this.quantity = quantity;
        this.paymentMode = paymentMode;
        this.name = name;
        this.flavor = flavor;
    }

    public CustomerDTO(){}

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "contactNo=" + contactNo +
                ", name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                ", quantity=" + quantity +
                ", paymentMode='" + paymentMode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDTO that = (CustomerDTO) o;
        return contactNo == that.contactNo && quantity == that.quantity && Objects.equals(name, that.name) && Objects.equals(flavor, that.flavor) && Objects.equals(paymentMode, that.paymentMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contactNo, flavor, quantity, paymentMode);
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }


    @Override
    public int compareTo(CustomerDTO o) {
        return this.getName().compareTo(o.getName());
    }
}
