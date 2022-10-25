package com.example.models;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class Agent
{
    @NotBlank
    private int agentId;
    @NotBlank
    private String licenceNo;

    @NotBlank
    private String firstName;
    private String midddleName;
    private String lastName;

    @NotBlank
    private int houseNo;
    private String landmark;
    private String city;

    @Valid
    private Employee emp;

    @Valid
    private Admin admin;

    @NotBlank
    private int Commision;

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public  String getLicenceNo(){
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidddleName() {
        return midddleName;
    }

    public void setMidddleName(String midddleName) {
        this.midddleName = midddleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getCommision() {
        return Commision;
    }

    public void setCommision(int commision) {
        Commision = commision;
    }
}
