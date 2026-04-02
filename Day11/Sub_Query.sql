select max(sal) from Emp;

-- Display Name of Employ who is getting max salary

select ename from Emp where sal = max(sal);

select ename from Emp where sal = 
(select max(sal) from Emp);

-- Display the 2nd Max Salary 

select max(sal) from Emp where sal < 
(select max(sal) from Emp);

-- Displa 2nd min salary 

select min(sal) from Emp where sal > 
(select min(sal) from Emp);

-- Display Agent Details who did policies 
-- Which exist in agent and AgentPolicy Tables 

select * from Agent where agentId = ANY
(select agentId from AgentPolicy);

-- Display Idle Agents (AgentId exists in Agent Table
-- But not in AgentPolicy Table)

select * from Agent where AgentID <>
ALL(select AgentId from AgentPolicy);

-- Display Matching Policy Details as (
-- PolicyID which exists in Policy Table 
-- But Not in AgentPolicy Table)

select * from Policy WHERE PolicyID = 
ANY(select PolicyID from AgentPolicy);

-- Display Idle Policies (PolicyId exists 
-- in Policy Table/But not in AgentPolicy Table) 

select * from Policy WHERE PolicyID <>
ALL(select PolicyId from agentpolicy);

