package com.company.homeworkdriver.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@JmixEntity
@Embeddable
public class LicenseInfo {

    @Column(name = "LICENSE_NUMBER")
    private String number;

    @Column(name = "EXPIRY_DATE")
    private LocalDate expiryDate;

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String licenseNumber) {
        this.number = licenseNumber;
    }
}