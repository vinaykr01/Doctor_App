// PatientService.java
package com.Doctor.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    // Add this method
    public Patient getPatientById(Long patientId) {
        return patientRepository.findById(patientId).orElse(null);
    }
}
