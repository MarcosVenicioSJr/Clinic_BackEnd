package com.ClinicPatient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ClinicPatient.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
  
}
