package com.employee.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(length = 40, nullable = false)
  private String name;
  @Column(nullable = false)
  private Integer age;
  @Column(nullable = false, unique = true)
  private String taxNumber;
  @Column(nullable = false, unique = true)
  private String email;
  @Column(nullable = false, unique = true)
  private String phone;
  @Column(nullable = false)
  private String role;
  @Column(nullable = false)
  private Double salary;
  @Column(nullable = false)
  private Date hireDate;
}