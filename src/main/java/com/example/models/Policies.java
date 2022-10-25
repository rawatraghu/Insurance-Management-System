package com.example.models;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class Policies
{
    @NotBlank
    private int PolicyTerm;
    @NotBlank
    private int TotalAmount;

    @NotBlank
    private Date StartDate;
    @NotBlank
    private Date EndDate;

    private Insurance insurance;

}
