package com.ClinicPatient.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ClinicPatient.interfaces.IServices;
import com.ClinicPatient.models.Patient;
import com.ClinicPatient.repository.PatientRepository;

import jakarta.transaction.Transactional;

@Service
public class PatientServices implements IServices<Patient> {

  @Autowired
  private PatientRepository repository;

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
  public void delete(Patient entity) {
    Patient patient = getById(entity.getId());
    this.repository.delete(patient);
  }

  @Transactional
  public void save(Patient entity) {
    entity.setId(null);
    entity.getAddress().setId(null);
    this.repository.save(entity);
  }
}