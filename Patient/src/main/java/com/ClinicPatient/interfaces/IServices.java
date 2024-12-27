package com.ClinicPatient.interfaces;

import java.util.List;
import java.util.UUID;

public interface IServices<T> {
  T getById(UUID id);
  List<T> getAll();
  void update(T value);
  void delete(T value);
  void save(T value);
}
