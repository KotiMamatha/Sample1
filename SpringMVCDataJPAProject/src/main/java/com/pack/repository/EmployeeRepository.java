package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.pack.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// We can extend CrudRepository<Employee, Integer> also but
	// JpaRepository<Employee, Integer> has everything and also some extra methods.

}
