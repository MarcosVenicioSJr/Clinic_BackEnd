package com.ClinicPatient.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ClinicPatient.Exceptions.PatientAlreadyExistsException;
import com.ClinicPatient.interfaces.IServices;
import com.ClinicPatient.models.Patient;
import com.ClinicPatient.repository.PatientRepository;
import com.ClinicPatient.validators.CreatePatientValidator;

import jakarta.transaction.Transactional;

@Service
public class PatientServices implements IServices<Patient> {

  @Autowired
  private PatientRepository repository;

  @Autowired
  private CreatePatientValidator createPatientValidator;

  public Patient getById(Integer id) {
    Optional<Patient> entity = this.repository.findById(id);
    return entity.orElse(new Patient());
  }

  public List<Patient> getAll() {
    List<Patient> patientList = this.repository.findAll();
    return patientList;
  }

  @Transactional
  public void update(Patient entity) {
    Patient updatable = getById(entity.getId());

    if (updatable.equals(new Patient()))
      return;

    updatable.setAddress(entity.getAddress());
    updatable.setAge(entity.getAge());
    updatable.setBirthDate(entity.getBirthDate());
    updatable.setEmail(entity.getEmail());
    updatable.setGender(entity.getGender());
    updatable.setName(entity.getName());
    updatable.setPhoneNumber(entity.getPhoneNumber());
    updatable.setTaxNumber(entity.getTaxNumber());

    this.repository.save(updatable);
  }

  @Transactional
  public void delete(Integer id) {
    Patient patient = getById(id);
    this.repository.delete(patient);
  }

  @Transactional
  public void save(Patient entity) {

    if (createPatientValidator.userExists(entity, repository))
      throw new PatientAlreadyExistsException("Patient already exists. Please, check TaxNumber, Email or PhoneNumber");

    entity.setId(null);
    entity.getAddress().setId(null);
    this.repository.save(entity);
  }
}