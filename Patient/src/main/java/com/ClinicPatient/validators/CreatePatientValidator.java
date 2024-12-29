package com.ClinicPatient.validators;

import org.springframework.stereotype.Component;

import com.ClinicPatient.models.Patient;
import com.ClinicPatient.repository.PatientRepository;

@Component
public class CreatePatientValidator {

     public boolean userExists(Patient entity, PatientRepository repository) {
        return repository.existsByTaxNumber(entity.getTaxNumber()) ||
               repository.existsByEmail(entity.getEmail()) ||
               repository.existsByPhoneNumber(entity.getPhoneNumber());
    }
}
