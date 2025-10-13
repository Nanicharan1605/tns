package com.example.certificates.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.certificates.entity.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long> {
    // Default CRUD methods provided by JpaRepository
}

