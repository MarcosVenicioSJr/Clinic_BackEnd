package com.ClinicPatient.models.Enums;

public enum Gender {
  MALE("MALE"),
  FEMALE("FEMALE"),
  NOT_DEFINED("NOT_DEFINED");

  private final String description;

  Gender(String description) {
      this.description = description;
  }

  public String getDescription() {
      return description;
  }
}
