package com.bharathkalyans.relearn.service;

import com.bharathkalyans.relearn.exception.ResourceNotFoundException;
import com.bharathkalyans.relearn.model.Employee;
import com.bharathkalyans.relearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public ResponseEntity<Employee> getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee does not Exist!"));

        return ResponseEntity.ok(employee);
    }

    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }


    public ResponseEntity<Employee> updateEmployeeById(Long id, Employee employee) {
        Employee updateEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee Not Found!"));

        updateEmployee.setFirstName(employee.getFirstName());
        updateEmployee.setLastName(employee.getLastName());
        updateEmployee.setEmailId(employee.getEmailId());
        employeeRepository.save(updateEmployee);
        return ResponseEntity.ok(updateEmployee);
    }

    public ResponseEntity<Employee> deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
        return new ResponseEntity<Employee>(HttpStatus.OK);
    }
}
