package com.codingshuttle.youtube.hospitalManagement;

import com.codingshuttle.youtube.hospitalManagement.entity.Patient;
import com.codingshuttle.youtube.hospitalManagement.repository.PatientRepository;
import com.codingshuttle.youtube.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository() {
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList + "checks");
    }

    @Test
    public void testTransactionMethod() {
//        Patient patient = patientService.getPatientById(1L);

//        Patient patient = patientRepository.findByName("Diya Patel");
//        System.out.println(patient);

        Page<Patient> patientsList = patientRepository.findAllPatients(PageRequest.of(  4, 3));

        for(Patient p : patientsList) {
            System.out.println(p);
        }
    }




}
