package com.employe.employee.controller;

import com.employe.employee.models.Employee;
import com.employe.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> fetchEmployee() {
        return employeeService.fetchEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeByID(@PathVariable("id") Long empId) {
        return employeeService.getEmployeeByID(empId);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Long empId) {
        employeeService.deleteEmployee(empId);
        return "Employee Deleted Successfully";
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") Long empId) {
        System.out.println(employee);
        return employeeService.updateEmployee(employee, empId);
    }

    @GetMapping("/employee/name/{name}")
    public List<Employee> fetchEmployeeByEmpName(@PathVariable("name") String empName) {
        return employeeService.fetchEmployeeByEmpName(empName);
    }
}
