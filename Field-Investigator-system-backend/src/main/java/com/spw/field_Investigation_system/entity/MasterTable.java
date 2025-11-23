package com.spw.field_Investigation_system.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;


@Entity
@Data
@Table(name = "MasterTable")
public class MasterTable {
    @Id
    @Column(name ="pmjay_id")
    private UUID pmJayId;

    @Column(name = "registration_id")
    private String registrationId;

    @Column(name = "benificiary_name")
    private String benificiaryName;

    @Column(name = "case_type")
    private String caseType;

    @Column(name = "preauth_initiated_date")
    private String preAuthInitiatedDate;

    @Column(name = "specialty_code")
    private String specialtyCode;

    @Column(name = "category_details")
    private String categoryDetails;

    @Column(name = "procedure_code")
    private String procedureCode;

    @Column(name = "procedure_details")
    private String procedureDetails;

    // ----------------------------
    //     MAPPPED WITH HOSPITAL ENTITY
    // ----------------------------
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id", referencedColumnName = "hospitalId")
    private Hospital hospital;

    @Column(name = "preauth_approved_amount")
    private Double preAuthApprovedAmount;

    @Column(name = "document_status")
    private String documentStatus;

    @Column(name = "submitted_date")
    private Timestamp submittedDate;


    @Column(name = "assigned_date")
    private Timestamp assignedDate;

    @Column(name = "assigned_doctor_id")
    private String assignedDoctorId;
}
