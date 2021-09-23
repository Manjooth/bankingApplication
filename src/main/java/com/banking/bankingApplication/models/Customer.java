package com.banking.bankingApplication.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String custid;
    private String fname;
    private String mname;
    private String ltname;
    private String city;
    private String mobileno;
    private String occupation;
    private Date dob;

    public Customer(){}

    public Customer(String custid, String fname, String mname, String ltname, String city, String mobileno, String occupation, Date dob) {
        this.custid = custid;
        this.fname = fname;
        this.mname = mname;
        this.ltname = ltname;
        this.city = city;
        this.mobileno = mobileno;
        this.occupation = occupation;
        this.dob = dob;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLtname() {
        return ltname;
    }

    public void setLtname(String ltname) {
        this.ltname = ltname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
