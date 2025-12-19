package com.xworkz.travel_agency_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelAgencyDTO implements Serializable,Comparable<TravelAgencyDTO> {


    private String fullName;
    private String email;
    private String password;
    private long phoneNo;
    private String country;
    private byte isDeleted;

    @Override
    public int compareTo(TravelAgencyDTO o) {
        return this.email.compareTo(o.email);
    }
}
