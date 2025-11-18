package com.xworkz.coffeeApp.DTO;

import java.io.Serializable;
import java.util.Objects;

public class CoffeeLandDTO implements Serializable,Comparable<CoffeeLandDTO> {
    private double size;
    private long totalPlants;
    private double yield;
    private double expenditure;
    private double profit;
    private double fertilizerQuantity;

    public CoffeeLandDTO(double size,long totalPlants,double yield,double expenditure,double profit,double fertilizerQuantity) {
        this.expenditure = expenditure;
        this.yield = yield;
        this.totalPlants = totalPlants;
        this.size = size;
        this.profit = profit;
        this.fertilizerQuantity = fertilizerQuantity;
    }

    public CoffeeLandDTO(){}

    @Override
    public String toString() {
        return "CoffeeLandDTO{" +
                "expenditure=" + expenditure +
                ", size=" + size +
                ", totalPlants=" + totalPlants +
                ", yield=" + yield +
                ", profit=" + profit +
                ", fertilizerQuantity=" + fertilizerQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeLandDTO that = (CoffeeLandDTO) o;
        return Double.compare(size, that.size) == 0 && totalPlants == that.totalPlants && Double.compare(yield, that.yield) == 0 && Double.compare(expenditure, that.expenditure) == 0 && Double.compare(profit, that.profit) == 0 && Double.compare(fertilizerQuantity, that.fertilizerQuantity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, totalPlants, yield, expenditure, profit, fertilizerQuantity);
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    public long getTotalPlants() {
        return totalPlants;
    }

    public void setTotalPlants(long totalPlants) {
        this.totalPlants = totalPlants;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getFertilizerQuantity() {
        return fertilizerQuantity;
    }

    public void setFertilizerQuantity(double fertilizerQuantity) {
        this.fertilizerQuantity = fertilizerQuantity;
    }

    public double getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(double expenditure) {
        this.expenditure = expenditure;
    }

    @Override
    public int compareTo(CoffeeLandDTO o) {
        return (int)(this.getSize()-o.getSize());
    }
}
