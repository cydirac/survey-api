package com.vgc.itp.miniprogramdemo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_SURVEY")
public class Survey{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;    
    private String uid;
    private String staffnum;
    private String mobilenum;
    private String gender;
    private String sourceIp;

    public Survey() {
        
    }

    public Survey(String uid, String staffnum, String mobilenum, String gender, String sourceIp){
        this.uid=uid;
        this.staffnum=staffnum;
        this.mobilenum=mobilenum;
        this.gender=gender;
        this.sourceIp=sourceIp;
    }

    

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getStaffnum() {
        return staffnum;
    }

    public void setStaffnum(String staffnum) {
        this.staffnum = staffnum;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    
}