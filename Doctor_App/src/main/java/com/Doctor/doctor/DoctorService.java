// DoctorService.java
package com.Doctor.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    // Corrected method for suggesting doctors based on symptom and city
    public List<Doctor> getSuggestedDoctors(String symptom, String city) {
        return doctorRepository.findBySpecialityAndCity(symptom, city);
    }
}
