package com.xworkz.medicalapp.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CustomerDTO implements Serializable,Comparable<CustomerDTO> {

    private String fullName;
    private String email;
    private String password;
    private long phoneNo;
    private int age;

    @Override
    public int compareTo(CustomerDTO o) {
        return this.fullName.compareTo(o.fullName);
    }
}
