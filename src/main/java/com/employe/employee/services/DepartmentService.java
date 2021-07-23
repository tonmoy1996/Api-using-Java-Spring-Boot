package com.employe.employee.services;

import com.employe.employee.models.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartment();
}
