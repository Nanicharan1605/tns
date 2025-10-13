package com.example.certificates.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "certificates")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int year;
    private String college; // lowercase field name for convention

    // Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
}

