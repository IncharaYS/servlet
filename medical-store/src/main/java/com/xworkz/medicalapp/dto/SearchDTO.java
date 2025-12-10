package com.xworkz.medicalapp.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class SearchDTO implements Serializable,Comparable<SearchDTO> {

    private String email;

    @Override
    public int compareTo(SearchDTO o) {
        return this.email.compareTo(o.email);
    }
}
