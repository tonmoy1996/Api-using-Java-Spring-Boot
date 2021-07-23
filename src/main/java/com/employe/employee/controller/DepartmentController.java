package com.employe.employee.controller;

import com.employe.employee.models.Department;
import com.employe.employee.models.Employee;
import com.employe.employee.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> fetchDepartment() {
        return departmentService.fetchDepartment();
    }

    @GetMapping("/department/{id}")
    public List<Employee> fetchEmployeeByDeptId(@PathVariable("id") Long deptId) {
        return departmentService.fetchEmployeeByDeptId(deptId);
    }
}
