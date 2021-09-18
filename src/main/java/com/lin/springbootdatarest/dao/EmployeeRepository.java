package com.lin.springbootdatarest.dao;

import com.lin.springbootdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
