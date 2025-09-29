package com.pm.patientservice.controller;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patients") // http://localhost:4000/patients
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    //to handle get requests
    @GetMapping
    public ResponseEntity<List<PatientResponseDTO>> getPatients(){
        List<PatientResponseDTO> patients = patientService.getPatients();
        return ResponseEntity.ok(patients); //.ok() = status 200
    }
}
