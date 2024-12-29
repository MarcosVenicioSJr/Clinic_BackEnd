package com.ClinicPatient.models.requests;

import java.util.Date;

import com.ClinicPatient.models.Address;
import com.ClinicPatient.models.Enums.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientRequest {
  private String name;
  private Integer age;
  private String taxNumber;
  private Date birthDate;
  private Address address;
  private String phoneNumber;
  private String email;
  private Gender gender;
}
