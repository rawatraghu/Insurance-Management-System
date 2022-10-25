package com.example.models;

import java.sql.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class Employee {
    @NotBlank
    private String employeeId;
    private Date joinDate;
    private Date endDate;

    @NotBlank
    private String FirstName;
    private  String MiddleName;
    private  String LastName;

    @NotBlank
    private String email;

    private String employeeAddress;

    @Valid
    private Admin admin;

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", joinDate=" + joinDate +
                ", endDate=" + endDate +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                '}';
    }
}
