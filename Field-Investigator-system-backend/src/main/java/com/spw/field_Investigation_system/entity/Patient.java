package com.spw.field_Investigation_system.entity;

import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.processing.Pattern;


@Entity
@Table(name = "Patient")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient {


    @Id
    @GeneratedValue
    @Column(name = "patient_id")
    private UUID patientId;

    @Column(name = "patient_name")
    private String patientName;


    @Column(name = "father_or_husband")
    private String fatherOrHusband;

    @Column(name = "age")
    private String age;

    @Column(name = "address")
    private String address;

    @Column(name = "aadhar_no", length = 12)
    private String adharNo;

    @Temporal(TemporalType.DATE)
    private Timestamp hospitalizationDate;

    @Column(name = "procedure_name")
    private String procedureName;

    @Column(name = "assigned_doctor")
    private String assignedDoctor;

    @Column(name = "state")
    private String state;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "contact_no")
    private String contactNo;

    @Column(name = "Gender")
    private String gender;

    @ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)	
    @JoinColumn(name = "doctorId")
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    @JoinColumn(name = "hospitalId")
    private Hospital hospital;

    @Temporal(TemporalType.DATE)
    private Timestamp createdAt;

}
