package api.demo.domain.employees;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee getEmployee(int id);

    boolean createEmployee(Employee param);

    boolean updateEmployee(Employee param);

    boolean deleteEmployee(int id);
}
