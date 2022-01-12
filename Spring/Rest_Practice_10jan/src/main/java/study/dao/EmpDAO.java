package study.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepository;
import study.entity.EmployeeEntity;

@Service
public class EmpDAO {

	@Autowired
	MyRepository repo;
	
	
	public void addEmp(String name,String job,int salary)
	{
		EmployeeEntity emp=new EmployeeEntity(name,job,salary);
		repo.save(emp);	
	}


	public List<EmployeeEntity> showAllEmp() {
		
		return repo.findAll() ;
		
		
	}
	
	public EmployeeEntity findByID(int id)
	{
		Optional<EmployeeEntity> e=  repo.findById(id);
		EmployeeEntity emp=e.get();
		//EmployeeEntity emp=  repo.findById(id).get();  //optional methods
		//return repo.findById(id).get();
		return emp;
	}
	
	public List<EmployeeEntity> findbyName(String name)
	{
		
		return repo.findByName(name);
	}
	
	public List<EmployeeEntity> findbyJob(String job)
	{
		
		return repo.findByJob(job);
	}
	public List<EmployeeEntity> findbySalary(int salary)
	{
		
		return repo.findBySalary(salary);
	}
	public void deletebyID(int id)
	{
		repo.deleteById(id);
	}
	public void deletebyObject(int id)
	{
		EmployeeEntity emp=repo.findById(id).get();
		repo.delete(emp);
	}


	public void update(String name, String job) {
		List<EmployeeEntity> list=repo.findByName(name);
		EmployeeEntity emp=list.get(0);
		emp.setJob(job);
		repo.save(emp);
		
	}
	
}
