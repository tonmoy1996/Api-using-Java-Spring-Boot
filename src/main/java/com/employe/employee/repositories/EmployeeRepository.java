package com.employe.employee.repositories;

import com.employe.employee.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmpName(String empName);

    Employee findByEmpNameIgnoreCase(String empName);

    @Query(value = "SELECT * from employee  where emp_name like %?1%", nativeQuery = true)
    List<Employee> findEmployeeByNameContain(String empName);
}
