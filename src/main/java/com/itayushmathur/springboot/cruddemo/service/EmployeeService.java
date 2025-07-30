package com.itayushmathur.springboot.cruddemo.service;

import com.itayushmathur.springboot.cruddemo.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
