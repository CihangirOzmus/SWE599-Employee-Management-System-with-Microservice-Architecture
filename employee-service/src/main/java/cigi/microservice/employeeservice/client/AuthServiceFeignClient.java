package cigi.microservice.employeeservice.client;

import cigi.microservice.employeeservice.dto.EmployeeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "auth-service")
public interface AuthServiceFeignClient {

    @PostMapping(value = "/uaa/employee")
    EmployeeDto createEmployee(@RequestBody EmployeeDto employee);

}
