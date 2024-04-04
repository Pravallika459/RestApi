package com.employee.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.boot.entity.EmployeeBean;


public interface EmployeeRepository extends JpaRepository<EmployeeBean,Integer> {

}
