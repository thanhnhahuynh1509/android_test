package com.huynhthanhnha.androidtest;

import java.io.Serializable;

public class Student implements Serializable {
    private String fullName;
    private String identity;
    private String phoneNumber;
    private String dob;
    private int yearStart;
    private int image;

    public Student() {

    }

    public Student(String fullName, String identity, String phoneNumber, String dob, int yearStart, int image) {
        this.fullName = fullName;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.yearStart = yearStart;
        this.image = image;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }
}
