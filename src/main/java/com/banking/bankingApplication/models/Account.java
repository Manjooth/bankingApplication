package com.banking.bankingApplication.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String acnumber;
    private String custid;
    private String bid;
    private int opening_balance;
    private Date aod;
    private String atype;
    private String astatus;

    public Account(){}

    public Account(String acnumber, String custid, String bid, int opening_balance, Date aod, String atype, String astatus) {
        this.acnumber = acnumber;
        this.custid = custid;
        this.bid = bid;
        this.opening_balance = opening_balance;
        this.aod = aod;
        this.atype = atype;
        this.astatus = astatus;
    }

    public String getAcnumber() {
        return acnumber;
    }

    public void setAcnumber(String acnumber) {
        this.acnumber = acnumber;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public int getOpening_balance() {
        return opening_balance;
    }

    public void setOpening_balance(int opening_balance) {
        this.opening_balance = opening_balance;
    }

    public Date getAod() {
        return aod;
    }

    public void setAod(Date aod) {
        this.aod = aod;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public String getAstatus() {
        return astatus;
    }

    public void setAstatus(String astatus) {
        this.astatus = astatus;
    }
}
