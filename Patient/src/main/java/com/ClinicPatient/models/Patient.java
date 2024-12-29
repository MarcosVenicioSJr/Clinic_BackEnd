package com.ClinicPatient.models;

import java.util.Date;

import com.ClinicPatient.models.Enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "patient")
@Getter
@Setter
public class Patient {

  public Patient() {
  }

  public Patient(String name, String taxNumber, Integer age, Date birthDate, String phoneNumber, String email, Gender gender, Address address) {
    this.name = name;
    this.taxNumber = taxNumber;
    this.age = age;
    this.birthDate = birthDate;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.gender = gender;
    this.address = address;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(length = 20, nullable = false)
  private String name;

  @Column(nullable = false)
  private Integer age;

  @Column(length = 20, nullable = false)
  private String taxNumber;

  @Column(length = 20, nullable = false)
  private Date birthDate;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id", referencedColumnName = "id")
  private Address address;

  @Column(length = 15, nullable = false)
  private String phoneNumber;

  @Column(length = 50, nullable = false, unique = true)
  private String email;

  @Column(nullable = false)
  private Gender gender;
}

