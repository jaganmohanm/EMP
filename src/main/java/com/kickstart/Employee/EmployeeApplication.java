package com.kickstart.Employee;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {
	EmployeeDAOImplementation d= new EmployeeDAOImplementation() ;
	
	@Autowired
	
	public static void main(String[] args) {
		
		SpringApplication.run(EmployeeApplication.class, args);
		EmployeeDAOImplementation d=new EmployeeDAOImplementation();
		EmpPojo ep=new EmpPojo();
		
//		ep.setId(10);
//		ep.setName("Megh");
//		ep.setId(9);
//		ep.setName("JaGaN");
//		System.out.println(ep);
		//d.save(ep);
		
		List<EmpPojo> l= d.select();
		for(EmpPojo e:l)
		{
			System.out.println("JaganYadav");
			System.out.println(e.name +""+ e.id+ "");
			
		}
		
	}

	
	
	//@Override
	
}
