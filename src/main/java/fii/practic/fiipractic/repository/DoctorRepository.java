package fii.practic.fiipractic.repository;

import fii.practic.fiipractic.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Doctor findDoctorByPatientsFirstName(String firstName);

}
