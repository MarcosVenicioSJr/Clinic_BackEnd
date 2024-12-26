package com.ClinicPatient.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "address")
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Column(length = 20, nullable = false)
  private String street;
  @Column(length = 20, nullable = false)
  private String city;
  @Column(length = 20, nullable = false)
  private String state;
  @Column(length = 20, nullable = false)
  private String zipCode;
  @Column(length = 20, nullable = false)
  private String country;
  @OneToOne(mappedBy = "address")
  private Patient patient;
}