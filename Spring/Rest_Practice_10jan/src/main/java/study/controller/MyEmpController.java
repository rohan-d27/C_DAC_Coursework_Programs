package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.dao.EmpDAO;
import study.entity.EmployeeEntity;

//for first time create-drop then update
@RestController
@RequestMapping("/employee")
public class MyEmpController {

	@Autowired
	EmpDAO dao;
	
	//http://localhost:8080/employee/add/ram/clerk/30000
	@PostMapping("/add/{name}/{job}/{salary}")
	public void addEmp(@PathVariable String name,@PathVariable String job,@PathVariable int salary)
	{
		dao.addEmp(name, job, salary);
	}
	
	@GetMapping("/showall")
	public List<EmployeeEntity> showAll()
	{
		return dao.showAllEmp();
	}
	
	//http://localhost:8080/employee/findbyid/1
	@GetMapping("/findbyid/{id}")
	public EmployeeEntity findID(@PathVariable int id)
	{
		return dao.findByID(id);
	}
	//http://localhost:8080/employee/findbyname/ram
	@GetMapping("/findbyname/{name}")
	public List<EmployeeEntity> findName(@PathVariable String name)
	{
		return dao.findbyName(name);
	}
	//http://localhost:8080/employee/findbysal/30000
	@GetMapping("/findbysal/{salary}")
	public List<EmployeeEntity> findSal(@PathVariable int salary)
	{
		return dao.findbySalary(salary);
	}
	
	//http://localhost:8080/employee/findbyjob/clerk
	@GetMapping("/findbyjob/{job}")
	public List<EmployeeEntity> findJob(@PathVariable String job)
	{
		return dao.findbyJob(job);
	}

	//http://localhost:8080/employee/deleteid/4
	@DeleteMapping("/deleteid/{id}")
	public void deleteid(@PathVariable int id)
	{
	   dao.deletebyID(id);
	}
	//http://localhost:8080/employee/deleteobj/3
	@DeleteMapping("/deleteobj/{id}")
	public void deleteobj(@PathVariable int id)
	{
	   dao.deletebyObject(id);
	}
	
	//http://localhost:8080/employee/update?name=ram&job=clerk
	@PutMapping("/update")
	public  void updateEmp(@RequestParam String name,@RequestParam String job)
	{
		dao.update(name,job);
		
	}
	
	
	
}
