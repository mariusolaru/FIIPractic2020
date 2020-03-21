package fii.practic.fiipractic.config;

import fii.practic.fiipractic.dto.PatientDTO;
import fii.practic.fiipractic.entity.Patient;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {

        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setSkipNullEnabled(true);

        modelMapper.typeMap(PatientDTO.class, Patient.class).addMappings(m ->{
            m.<Long>map(PatientDTO::getDoctorId, (Patient, v) -> Patient.getDoctor().setId(v));
            m.<String>map(PatientDTO::getEmailAddress, (Patient, v) -> Patient.getEmail().setEmailAddress(v));
        });

        return modelMapper;
    }
}
