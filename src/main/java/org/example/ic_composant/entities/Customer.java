package org.example.ic_composant.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private Long CUSTOMER_ID;
    @Column(name = "DISCOUNT_CODE")
    private String DISCOUNT_CODE;
    @Column(name = "ZIP")
    private String ZIP;
    @Column(name = "NAME")
    private String NAME;
    @Column(name = "ADDRESSLINE1")
    private String ADDRESSLINE1;
    @Column(name = "ADDRESSLINE2")
    private String ADDRESSLINE2;
    @Column(name = "CITY")
    private String CITY;
    @Column(name = "STATE")
    private String STATE;
    @Column(name = "PHONE")
    private String PHONE;
    @Column(name = "FAX")
    private String FAX;
    @Column(name = "EMAIL")
    private String EMAIL;
    @Column(name = "CREDIT_LIMIT")

    private int CREDIT_LIMIT;


    public Customer() {
        // ??????
    }

    public void setId(Long id) {
        this.CUSTOMER_ID = id;
    }
}