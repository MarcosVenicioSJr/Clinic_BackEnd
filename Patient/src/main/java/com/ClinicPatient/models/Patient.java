package com.ClinicPatient.models;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "patient")
public class Patient {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(length = 20, nullable = false)
  private String name;

  @Column(length = 20, nullable = false)
  private String TaxNumber;

  @Column(length = 20, nullable = false)
  private Date BirthDate;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id", referencedColumnName = "id")
  private Address address;

  @Column(length = 15, nullable = false)
  private String phoneNumber;

  @Column(length = 50, nullable = false, unique = true)
  private String email;

  @Column(length = 10, nullable = false)
  private String gender;
}

