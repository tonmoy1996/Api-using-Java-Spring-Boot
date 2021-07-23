package com.employe.employee.services;

import com.employe.employee.models.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);

    List<Employee> fetchEmployee();

    Employee getEmployeeByID(Long empId);

    void deleteEmployee(Long empId);

    Employee updateEmployee(Employee employee, Long empId);

    List<Employee> fetchEmployeeByEmpName(String empName);
}
