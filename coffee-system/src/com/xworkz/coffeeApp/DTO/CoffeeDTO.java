package com.xworkz.coffeeApp.DTO;

import java.io.Serializable;
import java.util.Objects;

public class CoffeeDTO implements Serializable,Comparable<CoffeeDTO> {


    private String coffeeType;
    private double price;
    private int quantity;
    private String farmer;
    private String location;


    public CoffeeDTO(){}

    public CoffeeDTO(String coffeeType,  double price,int quantity,  String farmer,String location) {
        this.coffeeType = coffeeType;
        this.quantity = quantity;
        this.price = price;
        this.location = location;
        this.farmer = farmer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFarmer() {
        return farmer;
    }

    public void setFarmer(String farmer) {
        this.farmer = farmer;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    @Override
    public String toString() {
        return "CoffeeDTO{" +
                "coffeeType='" + coffeeType + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", farmer='" + farmer + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeDTO coffeeDTO = (CoffeeDTO) o;
        return Double.compare(price, coffeeDTO.price) == 0 && quantity == coffeeDTO.quantity && Objects.equals(coffeeType, coffeeDTO.coffeeType) && Objects.equals(farmer, coffeeDTO.farmer) && Objects.equals(location, coffeeDTO.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coffeeType, price, quantity, farmer, location);
    }

    @Override
    public int compareTo(CoffeeDTO o) {
        return this.getCoffeeType().compareTo(o.getCoffeeType());
    }
}
