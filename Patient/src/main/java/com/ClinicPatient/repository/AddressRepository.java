package com.ClinicPatient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ClinicPatient.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
  
}
