package com.example.models;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class Sells
{
    @Valid
    private Agent agent;

    @Valid
    private Client client;

    @Valid
    private Policies policy;

    @NotBlank
    private Date buyDate;
    @NotBlank
    private int amount;

}
