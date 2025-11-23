package com.spw.field_Investigation_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import jakarta.persistence.Column;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Investigator {

    @Id
    @GeneratedValue
    @Column(name = "investigator_id",  columnDefinition = "BINARY(16)")
    private UUID investigatorId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "contact", nullable = false)
    private String contact;

    @OneToMany(mappedBy = "investigator", cascade = CascadeType.ALL)
    private List<FieldInvestigation> investigations;
}
