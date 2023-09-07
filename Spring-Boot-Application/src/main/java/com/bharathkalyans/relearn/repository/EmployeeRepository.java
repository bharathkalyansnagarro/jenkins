package com.bharathkalyans.relearn.repository;

import com.bharathkalyans.relearn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long > {
}
