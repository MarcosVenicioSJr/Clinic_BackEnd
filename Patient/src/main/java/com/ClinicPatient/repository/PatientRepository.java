package com.ClinicPatient.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ClinicPatient.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {
  
}
