package com.xworkz.travel_agency_app.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SearchDTO implements Serializable,Comparable<SearchDTO> {
    private String email;
    private String name;
    private String phoneNo;
    private String country;

    @Override
    public int compareTo(SearchDTO o) {
        return this.email.compareTo(o.email);
    }
}
