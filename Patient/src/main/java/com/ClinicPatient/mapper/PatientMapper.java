package com.ClinicPatient.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ClinicPatient.models.Patient;
import com.ClinicPatient.models.responses.GetResponse;

@Component
public class PatientMapper {

  @Autowired
  private ModelMapper mapper;

  public GetResponse mapperGetByIdResponse(Patient entity) {
    return mapper.map(entity, GetResponse.class);
  }

  public List<GetResponse> mapperGetAllResponse(List<Patient> entities) {
    List<GetResponse> responses = new ArrayList<GetResponse>();

    for (Patient entity : entities) {
      responses.add(mapper.map(entity, GetResponse.class));  
    }

    return responses;
  }
}
