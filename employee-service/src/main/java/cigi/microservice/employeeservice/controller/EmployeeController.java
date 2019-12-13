package cigi.microservice.employeeservice.controller;

import cigi.microservice.employeeservice.dto.EmployeeDto;
import cigi.microservice.employeeservice.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public EmployeeDto createNewEmployee(@RequestBody EmployeeDto employee){
        return employeeService.create(employee);
    }

}
