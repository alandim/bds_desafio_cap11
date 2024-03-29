package com.devsuperior.bds11.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds11.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
