package com.xworkz.biddingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO implements Serializable {

    private String playerName;
    private String password;
    private int age;
    private String playerType;
    private String state;
    private double battingAverage;
    private double bowlingAverage;
    private int noOfStumps;
    private double bidAmount;
    private String company;
    private int bidCount;

}
