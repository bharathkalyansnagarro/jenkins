package com.bharathkalyans.relearn.controller;


import com.bharathkalyans.relearn.model.Employee;
import com.bharathkalyans.relearn.service.EmployeeService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "api/v1/")
@Tag(name = "Employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    @Operation(
            description = "Retrieve details of Employees",
            summary = "All the details of employees will be fetched from the database.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Success"
                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Unable to Employees Fetch / Invalid EndPoint "
                    )
            }
    )
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    @Hidden
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployeeById(id, employee);
    }

    @DeleteMapping("/employees/{id}")
    @Hidden
    public ResponseEntity<Employee> deleteEmployeeById(@PathVariable Long id) {
        return employeeService.deleteEmployeeById(id);
    }

}
