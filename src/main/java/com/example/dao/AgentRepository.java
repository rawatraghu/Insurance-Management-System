package com.example.dao;

import com.example.models.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AgentRepository {

    @Autowired
    private JdbcTemplate template;

    public void createAgent(Agent agent){
        String sql="INSERT INTO AGENT(agentID,licenceNo,firstName,middleName,lastName,houseNo,landmark,city,employeeId,admin_Id,Comission) Values(?,?,?,?,?,?,?,?,?,?,?)";
        template.update(sql, agent.getAgentId(),
                agent.getLicenceNo(),
                agent.getFirstName(),
                agent.getMidddleName(),
                agent.getLastName(),
                agent.getHouseNo(),
                agent.getLandmark(),
                agent.getCity(),
                agent.getEmp().getEmployeeId(),
                agent.getAdmin().getAdmin_id(),
                agent.getCommision());
    }
    public List<Agent> getAgentByID(int agentId){
        String sql="Select * from Agent WHERE agentId=?";
        List<Agent> o;
        return o;
    }
}
