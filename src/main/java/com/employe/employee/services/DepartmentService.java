package com.employe.employee.services;

import com.employe.employee.error.DeparmentNotFoundException;
import com.employe.employee.models.Department;
import com.employe.employee.models.Employee;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartment();
    List<Employee> fetchEmployeeByDeptId(Long deptId);
    void deleteDepartment(Long id) throws DeparmentNotFoundException;
}
