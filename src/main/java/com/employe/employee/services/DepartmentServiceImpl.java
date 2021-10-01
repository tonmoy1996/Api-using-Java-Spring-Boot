package com.employe.employee.services;

import com.employe.employee.error.DeparmentNotFoundException;
import com.employe.employee.models.Department;
import com.employe.employee.models.Employee;
import com.employe.employee.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public List<Employee> fetchEmployeeByDeptId(Long deptId) {
        Department dept = departmentRepository.findById(deptId).get();
        return dept.getEmployees();

    }

    @Override
    public void deleteDepartment(Long id) throws DeparmentNotFoundException {
        Optional<Department> department = departmentRepository.findById(id);
        if (!department.isPresent()) {
            throw new DeparmentNotFoundException("Department Not Found With The Given ID");
        }
    }


}
