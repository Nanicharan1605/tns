package com.example.certificates.controls;

import com.example.certificates.entity.Certificate;
import com.example.certificates.services.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    @Autowired
    private CertificateService service;

    // Create certificate
    @PostMapping("/add")
    public Certificate createCertificate(@RequestBody Certificate certificate) {
        return service.createCertificate(certificate);
    }

    // Get certificate by ID
    @GetMapping("/{id}")
    public Certificate getCertificate(@PathVariable long id) {
        return service.getCertificate(id);
    }

    // Get all certificates
    @GetMapping("/all")
    public List<Certificate> getAllCertificates() {
        return service.getAllCertificates();
    }

    // Delete certificate by ID
    @DeleteMapping("/{id}")
    public String deleteCertificate(@PathVariable long id) {
        service.deleteCertificate(id);
        return "Deleted certificate with ID: " + id;
    }
}

