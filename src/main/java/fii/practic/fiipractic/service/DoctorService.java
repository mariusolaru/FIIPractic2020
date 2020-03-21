package fii.practic.fiipractic.service;

import fii.practic.fiipractic.entity.Doctor;

import java.util.List;

public interface DoctorService {

    List<Doctor> getAll();

    Doctor getById(Long id);

    Doctor save(Doctor doctor);

    Doctor findDoctorByPatientsFirstName(String firstName);

}
