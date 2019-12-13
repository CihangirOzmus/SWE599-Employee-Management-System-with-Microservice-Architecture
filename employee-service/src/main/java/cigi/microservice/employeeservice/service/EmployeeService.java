package cigi.microservice.employeeservice.service;

import cigi.microservice.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    /**
     * Invokes Auth Service employee creation
     *
     * @param employee
     * @return created employee
     */
    EmployeeDto create(EmployeeDto employee);
}
