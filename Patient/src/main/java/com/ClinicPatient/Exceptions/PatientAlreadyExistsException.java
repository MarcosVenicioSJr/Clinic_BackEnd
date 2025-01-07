package com.ClinicPatient.Exceptions;

public class PatientAlreadyExistsException extends RuntimeException {
  public PatientAlreadyExistsException(String message) {
    super(message);
  }
}