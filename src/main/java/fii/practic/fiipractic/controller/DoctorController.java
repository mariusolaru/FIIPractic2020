package fii.practic.fiipractic.controller;

import fii.practic.fiipractic.entity.Doctor;
import fii.practic.fiipractic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/doctors")
public class DoctorController {

    private DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<Doctor> getAll(){
        return doctorService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Doctor getById(@PathVariable Long id){
        return doctorService.getById(id);
    }

    @GetMapping(value = "/filter")
    public List<Doctor> getDoctorByPatientsFirstName(@RequestParam(value = "firstName") String firstName){
        return doctorService.findDoctorsByPatientsFirstName(firstName);
    }

    @PostMapping
    public Doctor save(@RequestBody Doctor doctor){
        return doctorService.save(doctor);
    }
}
