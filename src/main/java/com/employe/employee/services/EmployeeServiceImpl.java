package com.employe.employee.services;

import com.employe.employee.models.Department;
import com.employe.employee.models.Employee;
import com.employe.employee.repositories.DepartmentRepository;
import com.employe.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        Department dept = departmentRepository.findById(employee.getDepartment().getDeptId()).orElse(null);

        employee.setDepartment(dept);

        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByID(Long empId) {
        Optional<Employee> empOptional = employeeRepository.findById(empId);
        if (!empOptional.isPresent()) {
            //
        }
        return empOptional.get();
    }

    @Override
    public void deleteEmployee(Long empId) {
        employeeRepository.deleteById(empId);
    }

    @Override
    public Employee updateEmployee(Employee employee, Long empId) {

        Employee existingEmp = employeeRepository.findById(empId).get();
        if (Objects.nonNull(employee.getEmpName()) && !"".equalsIgnoreCase(employee.getEmpName())) {
            existingEmp.setEmpName(employee.getEmpName());
        }
        if (employee.getEmpSalary() > 0) {
            existingEmp.setEmpSalary(employee.getEmpSalary());
        }
        return employeeRepository.save(existingEmp);
    }

    @Override
    public List<Employee> fetchEmployeeByEmpName(String empName) {
        return employeeRepository.findEmployeeByNameContain(empName);
    }

}
