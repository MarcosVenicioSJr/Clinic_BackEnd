package com.ClinicPatient.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.ClinicPatient.models.Patient;
import com.ClinicPatient.models.responses.GetResponse;

public class PatientMapper {

  @Autowired
  private ModelMapper mapper;

  public GetResponse mapperGetByIdResponse(Patient entity) {
    return mapper.map(entity, GetResponse.class);
  }
}
