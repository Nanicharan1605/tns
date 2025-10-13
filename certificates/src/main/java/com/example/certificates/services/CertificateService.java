
package com.example.certificates.services;

import com.example.certificates.entity.Certificate;
import com.example.certificates.repo.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository repo;

    // Create certificate
    public Certificate createCertificate(Certificate certificate) {
        return repo.save(certificate);
    }

    // Get certificate by ID
    public Certificate getCertificate(long id) {
        return repo.findById(id).orElse(null);
    }

    // Get all certificates
    public List<Certificate> getAllCertificates() {
        return repo.findAll();
    }

    // Delete certificate by ID
    public void deleteCertificate(long id) {
        repo.deleteById(id);
    }
}
