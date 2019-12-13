package cigi.microservice.authservice.repository;

import cigi.microservice.authservice.domain.Employee;
import cigi.microservice.authservice.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
