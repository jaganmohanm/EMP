package com.kickstart.Employee;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {

	
	EmpServiceImpl esi;
	@RequestMapping("/Hello")
	public String hello()
	{
		return "welcome to spring boot";
		
	}
	
	@RequestMapping(value="/emp")
	public String listEmp(Model model){
		model.addAttribute("employee", new EmpPojo());
		model.addAttribute("listEmpPojo", this.esi.select());
		return "EmpPojo";
	}
}
