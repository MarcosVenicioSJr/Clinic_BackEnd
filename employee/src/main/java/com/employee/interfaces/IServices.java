package com.employee.interfaces;

public interface IServices<T> {
  void Create(T entity);
  void Delete(T entity);
  void Update(T entity);
  void GetById(T entity);
}
