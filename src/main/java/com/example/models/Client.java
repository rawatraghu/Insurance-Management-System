package com.example.models;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.math.BigInteger;

public class Client
{
    @NotBlank
    private int clientNo;

    @NotBlank
    private String clienEmail;
    private BigInteger clientContact;

    @NotBlank
    private String FirstName;
    private String MiddleName;
    private String LastName;

    @NotBlank
    private int HouseNo;
    private String landMark;
    private String city;

    @Valid
    private Employee emp;



}
