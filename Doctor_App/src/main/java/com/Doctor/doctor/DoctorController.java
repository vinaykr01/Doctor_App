package com.Doctor.doctor;

//DoctorController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
 @Autowired
 private DoctorService doctorService;

 @Autowired
 private PatientService patientService;

 @GetMapping("/suggest-doctors")
 public List<Doctor> suggestDoctors(@RequestParam Long patientId) {
     Patient patient = patientService.getPatientById(patientId);
     if (patient != null) {
         return doctorService.getSuggestedDoctors(patient.getSymptom(), patient.getCity());
     } else {
         return null; // Handle invalid patient ID
     }
 }
}

