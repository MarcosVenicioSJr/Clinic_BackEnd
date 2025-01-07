package com.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.interfaces.IServices;
import com.employee.models.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService implements IServices<Employee> {

  @Autowired
  private EmployeeRepository repository;

  @Override
  public void Create(Employee entity) {
    this.repository.save(entity);
  }

  @Override
  public void Delete(Employee entity) {
    throw new UnsupportedOperationException("Unimplemented method 'Delete'");
  }

  @Override
  public void Update(Employee entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Update'");
  }

  @Override
  public void GetById(Employee entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'GetById'");
  }  
}
