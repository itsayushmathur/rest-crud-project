package com.itayushmathur.springboot.cruddemo.dao;

import com.itayushmathur.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
