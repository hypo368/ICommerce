package org.example.ic_composant.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "DISCOUNT")
@NamedQuery(name = "Discount.findAll", query = "SELECT d FROM Discount d")
public class Discount implements Serializable {
    @Id
    @Column(name = "CODE", length = 1)
    private String code;

    @Column(name = "RATE", precision = 4, scale = 2)
    private double rate;

    public Discount() {
        // Default constructor
    }

    public Discount(String code, double rate) {
        this.code = code;
        this.rate = rate;
    }

    // Getters and setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
