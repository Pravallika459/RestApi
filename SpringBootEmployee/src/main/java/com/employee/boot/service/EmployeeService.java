package com.employee.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.boot.entity.EmployeeBean;
import com.employee.boot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public EmployeeBean saveEmployee(EmployeeBean employee) {
		return repository.save(employee);
		}
		
		public List<EmployeeBean> saveEmployee(List<EmployeeBean> employee) {
			return repository.saveAll(employee);
				}
		
		public List<EmployeeBean> getEmployees(){
			return repository.findAll();
		}
		
		public EmployeeBean getEmployeesById(int id){
			return repository.findById(id).orElse(null);
		}
		
		 public double calculateTax(EmployeeBean employee) {
		        double yearlySalary = employee.getEmployeeSalary() * 12;
		        double taxAmount = 0.0;

		        if (yearlySalary <= 250000) {
		            taxAmount = 0;
		        } else if (yearlySalary > 250000 && yearlySalary <= 500000) {
		            taxAmount = (yearlySalary - 250000) * 0.05;
		        } else if (yearlySalary > 500000 && yearlySalary <= 1000000) {
		            taxAmount = 250000 * 0.05 + (yearlySalary - 500000) * 0.10;
		        } else if (yearlySalary > 1000000) {
		            taxAmount = 250000 * 0.05 + 500000 * 0.10 + (yearlySalary - 1000000) * 0.20;
		        }

		        return taxAmount;
		    }
		public String deleteEmployee(int id) {
			 repository.deleteById(id);
			 return "Employee removed" +id;
		 }
		 public EmployeeBean updateEmployee(EmployeeBean employee) {
			 EmployeeBean existingEmployee= repository.findById(employee.getEmployeeId()).orElse(null);
			 existingEmployee.setEmployeeName(employee.getEmployeeName());
			 existingEmployee.setEmployeephoneNumber(employee.getEmployeephoneNumber());
			 existingEmployee.setEmployeeSalary(employee.getEmployeeSalary());
			 existingEmployee.setEmployeeLastName(employee.getEmployeeLastName());
			 existingEmployee.setEmployeeLastName(employee.getEmployeeFirstName());
			 return repository.save( existingEmployee);
			
		 }
}
