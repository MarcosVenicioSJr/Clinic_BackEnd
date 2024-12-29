package com.ClinicPatient.models.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressResponse {
  private String street;
  private String city;
  private String state;
  private String zipCode;
  private String country;
}
