package com.ClinicPatient.interfaces;

import java.util.List;

public interface IServices<T> {
  T getById(Integer id);
  List<T> getAll();
  void update(T value);
  void delete(Integer value);
  void save(T value);
}
