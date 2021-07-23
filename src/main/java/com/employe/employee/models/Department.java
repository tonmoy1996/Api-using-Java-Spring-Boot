package com.employe.employee.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptId;
    @NotBlank(message = "Department Name is Required")
    private String deptName;
    private String deptCode;
    private String deptAddress;

    @JsonIgnore
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }
}
