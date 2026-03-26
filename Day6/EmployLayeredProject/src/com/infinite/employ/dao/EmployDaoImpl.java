package com.infinite.employ.dao;

import com.infinite.employ.model.Employ;
import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

    static List<Employ> employList;

    static {
        employList = new ArrayList<Employ>();
    }
    @Override
    public String addEmployDao(Employ employ) {
        employList.add(employ);
        return "Employ Record Inserted...";
    }

    @Override
    public List<Employ> showEmployDao() {
        return employList;
    }

    @Override
    public Employ searchEmployDao(int empno) {
        return employList.stream().filter(employ ->
                employ.getEmpno()==empno).findFirst().orElse(null);
    }

    @Override
    public String updateEmployDao(Employ employUpdated) {
        Employ employFound =  searchEmployDao(employUpdated.getEmpno());
        if (employFound==null){
            return "Employ Record Not Found...";
        }
        employFound.setEmpno(employUpdated.getEmpno());
        employFound.setName(employUpdated.getName());
        employFound.setGender(employUpdated.getGender());
        employFound.setDept(employUpdated.getDept());
        employFound.setDesig(employUpdated.getDesig());
        employFound.setBasic(employUpdated.getBasic());
        return "Employ Record Updated...";
    }

    @Override
    public String deleteEmployDao(int empno) {
        Employ employ = searchEmployDao(empno);
        if (employ!=null){
            employList.remove(employ);
            return "Employ Record Deleted...";
        }
        return "Employ Record Not Found...";
    }
}
