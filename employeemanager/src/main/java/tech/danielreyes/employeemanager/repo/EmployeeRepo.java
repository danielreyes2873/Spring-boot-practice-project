package tech.danielreyes.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.danielreyes.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
