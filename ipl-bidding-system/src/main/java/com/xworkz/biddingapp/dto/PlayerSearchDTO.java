package com.xworkz.biddingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerSearchDTO implements Serializable {


    private String playerName;
    private String playerType;
    private double battingAverage;
    private double bowlingAverage;
    private double noOfStumps;
}
