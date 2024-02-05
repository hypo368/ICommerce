package org.example.ic_composant;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
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

    public Long getId() {
        return CUSTOMER_ID;
    }


    public String getDISCOUNT_CODE() {
        return DISCOUNT_CODE;
    }

    public void setDISCOUNT_CODE(String DISCOUNT_CODE) {
        this.DISCOUNT_CODE = DISCOUNT_CODE;
    }

    public String getZIP() {
        return ZIP;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getADDRESSLINE1() {
        return ADDRESSLINE1;
    }

    public void setADDRESSLINE1(String ADDRESSLINE1) {
        this.ADDRESSLINE1 = ADDRESSLINE1;
    }

    public String getADDRESSLINE2() {
        return ADDRESSLINE2;
    }

    public void setADDRESSLINE2(String ADDRESSLINE2) {
        this.ADDRESSLINE2 = ADDRESSLINE2;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getFAX() {
        return FAX;
    }

    public void setFAX(String FAX) {
        this.FAX = FAX;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public int getCREDIT_LIMIT() {
        return CREDIT_LIMIT;
    }

    public void setCREDIT_LIMIT(int CREDIT_LIMIT) {
        this.CREDIT_LIMIT = CREDIT_LIMIT;
    }
}
