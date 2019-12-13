package cigi.microservice.employeeservice.service;

import cigi.microservice.employeeservice.client.AuthServiceFeignClient;
import cigi.microservice.employeeservice.dto.EmployeeDto;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final AuthServiceFeignClient authServiceFeignClient;

    public EmployeeServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public EmployeeDto create(EmployeeDto employee) {
        return authServiceFeignClient.createEmployee(employee);
    }
}
