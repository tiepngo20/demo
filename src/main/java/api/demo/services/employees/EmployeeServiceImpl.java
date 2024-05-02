package api.demo.services.employees;

import java.util.List;

import org.springframework.stereotype.Service;

import api.demo.domain.employees.Employee;
import api.demo.domain.employees.EmployeeService;
import api.demo.repositories.employees.EmployeeRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        return this.employeeRepository.findById(id).get();
    }

    @Override
    public boolean createEmployee(Employee param) {
        return this.employeeRepository.saveAndFlush(param) != null;
    }

    @Override
    public boolean updateEmployee(Employee param) {
        return this.employeeRepository.saveAndFlush(param) != null;
    }

    @Override
    public boolean deleteEmployee(int id) {
        this.employeeRepository.deleteById(id);

        return true;
    }

}
