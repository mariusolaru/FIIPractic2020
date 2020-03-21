package fii.practic.fiipractic;

import fii.practic.fiipractic.entity.Doctor;
import fii.practic.fiipractic.repository.DoctorJdbcRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FiipracticApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FiipracticApplication.class, args);
    }

    @Autowired
    private DoctorJdbcRepository repository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) throws Exception {
       /* Doctor doctor = new Doctor();
        doctor.setId(1L);
        doctor.setFirstName("Bogdan");
        doctor.setLastName("Boca");
        doctor.setSpeciality("medic");

        repository.insert(doctor);

        logger.info("All doctors -> {}", repository.findAll());*/

    }
}
