package com.kickstart.Employee;

import java.util.List;

public interface EmployeeDAO {
	public void save(EmpPojo ep);
	public List<EmpPojo> select();

}