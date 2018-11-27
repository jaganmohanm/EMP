package com.kickstart.Employee;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class EmpServiceImpl implements EmpService{
	EmployeeDAO e;
	
	@Override
	@Transactional
	public List<EmpPojo> select(){
		
		
		return this.e.select();
		
		
	}

}
