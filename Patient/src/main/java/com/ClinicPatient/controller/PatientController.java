package com.ClinicPatient.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ClinicPatient.mapper.PatientMapper;
import com.ClinicPatient.models.Patient;
import com.ClinicPatient.models.responses.GetResponse;
import com.ClinicPatient.services.PatientServices;

@RestController
@RequestMapping("/patient")
public class PatientController {
  @Autowired
  private PatientServices services;

  @Autowired
  private PatientMapper mapper;

  @GetMapping("/{id}")
  public ResponseEntity<GetResponse> getById(@PathVariable UUID id){
    GetResponse response = mapper.mapperGetByIdResponse(services.getById(id));
    return ResponseEntity.ok().body(response);
  }
}