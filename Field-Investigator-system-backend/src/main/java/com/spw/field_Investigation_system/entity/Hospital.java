package com.spw.field_Investigation_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Table(name = "Hospital")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Hospital {

    @Id
    @GeneratedValue
    @Column(name = "hospitalId")
    private UUID hospitalId;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "hospital_address")
    private String hospitalAddress;

    @Column(name = "email_id", unique = true)
    private String emailId;

    @Column(name = "hospital_contact", unique = true)
    private String hospitalContact;

    @Column(name = "hospital_type")
    private Enum hospitalType;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "pincode")
    private String pincode;


}
