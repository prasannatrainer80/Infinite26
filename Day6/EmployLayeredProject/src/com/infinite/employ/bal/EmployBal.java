package com.infinite.employ.bal;

import com.infinite.employ.dao.EmployDao;
import com.infinite.employ.dao.EmployDaoImpl;
import com.infinite.employ.exception.EmployException;
import com.infinite.employ.model.Employ;

import java.util.List;

public class EmployBal {

    static EmployDao employDao;
    static StringBuilder sb;
    static {
        employDao = new EmployDaoImpl();
        sb = new StringBuilder();
    }

    public List<Employ> showEmployBal() {
        return employDao.showEmployDao();
    }

    public String addEmployBal(Employ employ) throws EmployException {
        if (validateEmploy(employ)==false) {
            throw new EmployException(sb.toString());
        }
        return employDao.addEmployDao(employ);
    }
    public static boolean validateEmploy(Employ employ) {
        boolean flag = true;
        if (employ.getEmpno() <= 0) {
            sb.append("Employ No Cannot be -ve or Zero\r\n");
            flag =false;
        }
        if (employ.getName().length() < 5) {
            sb.append("Employ Name Contains min 5 chars...\r\n");
            flag =false;
        }
        if (employ.getBasic() < 10000 || employ.getBasic() > 80000) {
            sb.append("Basic Must be between 10000 and 80000\r\n");
            flag =false;
        }
        return flag;
    }
}
