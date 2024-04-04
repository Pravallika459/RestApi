package com.employee.boot.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Employee_table")
public class EmployeeBean {
	
@Id
@GeneratedValue
 private int  employeeId;
 private String employeeName;
 private String employeeFirstName;
 private String employeeLastName;
 private String employeeEmail;
 private long   employeephoneNumber;
 private List<String> phoneNumbers;
@DateTimeFormat(pattern="dd/MM/yyyy")
 private Date   employeeJoinDate;
 private double employeeSalary;
 

}
