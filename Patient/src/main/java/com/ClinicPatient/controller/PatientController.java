package com.ClinicPatient.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ClinicPatient.mapper.PatientMapper;
import com.ClinicPatient.models.Patient;
import com.ClinicPatient.models.requests.CreatePatientRequest;
import com.ClinicPatient.models.responses.GetResponse;
import com.ClinicPatient.services.PatientServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/patient")
public class PatientController {
  @Autowired
  private PatientServices services;
  @Autowired
  private PatientMapper mapper;

  @GetMapping("/{id}")
  public ResponseEntity<GetResponse> getById(@PathVariable Integer id) {
    GetResponse response = this.mapper.mapperGetByIdResponse(services.getById(id));
    return ResponseEntity.ok().body(response);
  }

  @GetMapping()
  public ResponseEntity<List<GetResponse>> get() {
    List<GetResponse> response = this.mapper.mapperGetAllResponse(services.getAll());
    return ResponseEntity.ok().body(response);
  }

  @PostMapping
  public ResponseEntity<Patient> postMethodName(@RequestBody CreatePatientRequest entity) {
    Patient patient = this.mapper.mapperCreateRequestToPatient(entity);

    services.save(patient);

    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
        .buildAndExpand(patient.getId()).toUri();

    return ResponseEntity.created(uri).body(patient);
  }

}