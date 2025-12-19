package com.xworkz.biddingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO implements Serializable {

    private String companyName;
    private String companyEmail;
    private String password;

}
