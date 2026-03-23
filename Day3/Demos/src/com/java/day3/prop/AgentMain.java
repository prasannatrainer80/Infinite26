package com.java.day3.prop;

public class AgentMain {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setAgentId(1);
        agent.setAgentName("Swiggy");
        agent.setGender("MALE");
        agent.setPremium(88234.11);
        System.out.println(agent);
    }
}
