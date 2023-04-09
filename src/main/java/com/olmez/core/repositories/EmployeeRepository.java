package com.olmez.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.olmez.core.model.Employee;

@Repository
public interface EmployeeRepository extends BaseObjectRepository<Employee> {

    @Query("SELECT u FROM Employee u WHERE u.name = ?1 AND u.deleted = false")
    List<Employee> findByName(String name);

}
