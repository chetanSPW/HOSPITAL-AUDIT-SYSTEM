package com.spw.field_Investigation_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;
import com.spw.field_Investigation_system.enums.AuditFormType;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditQuestion {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "audit_que_id", columnDefinition = "BINARY(16)")
    private UUID auditQueId;

    private String questionText;

    @Column(length = 50)  
    private String answer;   

    @Enumerated(EnumType.STRING)
    @Column(name = "audit_form_type", nullable = false)
    private AuditFormType formType;  // DESK_AUDIT, MEDICAL_AUDIT, FACT_SHEET, BENEFICIARY_AUDIT

    @ManyToOne
    @JoinColumn(name = "investigation_id", nullable = true)
    private FieldInvestigation fieldInvestigation;
}

