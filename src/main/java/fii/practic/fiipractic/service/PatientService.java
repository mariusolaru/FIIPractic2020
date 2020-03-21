package fii.practic.fiipractic.service;

import fii.practic.fiipractic.entity.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> getAll();

    Patient getById(Long id);

    Patient save(Patient doctor);

}
