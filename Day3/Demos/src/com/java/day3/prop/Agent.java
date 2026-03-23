package com.java.day3.prop;

/**
 * Example for Write Only Property
 */
public class Agent {

    private int agentId;
    private String agentName;
    private String gender;
    private double premium;

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentId=" + agentId +
                ", agentName='" + agentName + '\'' +
                ", gender='" + gender + '\'' +
                ", premium=" + premium +
                '}';
    }
}
