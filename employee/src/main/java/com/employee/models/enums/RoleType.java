package com.employee.models.enums;

public enum RoleType {
  ADMINISTRATOR("ADMINISTRATOR"),
  DOCTOR("DOCTOR"),
  NURSE("NURSE"),
  RECEPTIONIST("RECEPTIONIST"),
  LAB_TECHNICIAN("LAB_TECHNICIAN"),
  PHARMACIST("PHARMACIST"),
  JANITOR("JANITOR"),
  ASSISTANT("ASSISTANT"),
  PATIENT("PATIENT"),
  IT_SUPPORT("IT_SUPPORT");

  private final String description;

  RoleType(String description){
    this.description = description;
  }

  private String getDescription(){
    return description;
  }
}
