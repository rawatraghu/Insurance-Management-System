package com.example.dao;

import com.example.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeRepositary
{
    @Autowired
    private JdbcTemplate template;

    public void createEmployee(Employee employee)
    {
        //String query = "CREATE TABLE IF NOT EXISTS Employee(INT employeeId, DATE joinDate, DATE endDate, STRING FirstName, STRING MiddleName, STRING LastName, STRING email, STRING employeeAddress)";
        String query = "INSERT INTO Employee(employeeId,joinDate,endDate,FirstName,MiddleName,LastName,email,employeeAddress,admin_id) VALUES (?,?,?,?,?,?,?,?,?)";
        template.update(query, employee.getEmployeeId(),
                employee.getJoinDate(),
                employee.getEndDate(),
                employee.getFirstName(),
                employee.getMiddleName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getEmployeeAddress());
    }

    public void getEmployeebyId(String employeeId)
    {
        String
    }
}
