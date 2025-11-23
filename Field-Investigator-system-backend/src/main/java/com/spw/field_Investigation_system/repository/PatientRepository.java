package com.spw.field_Investigation_system.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spw.field_Investigation_system.entity.Patient;


public interface PatientRepository extends JpaRepository<Patient,UUID> {

	
	
}
