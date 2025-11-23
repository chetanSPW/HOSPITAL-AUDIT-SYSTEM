package com.spw.field_Investigation_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import jakarta.persistence.Column;
import java.sql.Timestamp;
import java.util.UUID;
import com.spw.field_Investigation_system.enums.InvestigationStatus;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.EnumType;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FieldInvestigation {

    @Id
    @GeneratedValue
    @Column(name = "investigation_id", columnDefinition = "BINARY(16)")
    private UUID investigationId;

    @Column(name = "date_of_investigation", nullable = false)
    private Timestamp dateOfInvestigation;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private InvestigationStatus status;  // PENDING, IN_PROGRESS, COMPLETED

    @Column(length = 500)  
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "investigator_id", nullable = false)
    private Investigator investigator;

    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    // One FieldInvestigation → Many AuditQuestions
    @OneToMany(mappedBy = "fieldInvestigation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AuditQuestion> questions;
}
