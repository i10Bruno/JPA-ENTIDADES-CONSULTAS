package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDTO {



    private Long id;
    private String name;
    private Double salary;
    private Long departmentId;


    public PersonDTO(Long id, String name, Long departmentId,Double salary) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
        this.salary=salary;
    }


    public PersonDTO(Person dto) {
        id = dto.getId();
        name = dto.getName();
        salary= dto.getSalary();
       departmentId = dto.getDepartment().getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Long getDepartmentId() {
        return departmentId;
    }
}

