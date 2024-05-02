package api.demo.repositories.employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.demo.domain.employees.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
