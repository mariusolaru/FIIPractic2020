package fii.practic.fiipractic.controller;

import fii.practic.fiipractic.dto.PatientDTO;
import fii.practic.fiipractic.entity.Doctor;
import fii.practic.fiipractic.entity.Email;
import fii.practic.fiipractic.entity.Patient;
import fii.practic.fiipractic.service.DoctorService;
import fii.practic.fiipractic.service.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/patients")
public class PatientController {

    private PatientService patientService;
    private DoctorService doctorService;
    private ModelMapper modelMapper;

    @Autowired
    public PatientController(PatientService patientService, DoctorService doctorService, ModelMapper modelMapper) {
        this.patientService = patientService;
        this.doctorService = doctorService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<Patient> getAll(){
        return patientService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Patient getById(@PathVariable Long id){
        return patientService.getById(id);
    }

    @PostMapping
    public Patient save(@RequestBody PatientDTO patientDTO){
        /*Doctor doctorDb = doctorService.getById(patientDTO.getDoctorId());


        Email newEmail = new Email();
        newEmail.setEmailAddress(patientDTO.getEmailAddress());

        Patient newPatient = new Patient();
        newPatient.setDoctor(doctorDb);
        newPatient.setEmail(newEmail);
        newPatient.setAge(patientDTO.getAge());
        newPatient.setFirstName(patientDTO.getFirstName());
        newPatient.setLastName(patientDTO.getLastName());*/
        //return patientService.save(newPatient);
        return patientService.save(modelMapper.map(patientDTO, Patient.class));
    }
}
