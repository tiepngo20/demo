package api.demo.controllers.employees;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.demo.controllers.base.ResponseModel;
import api.demo.domain.constant.ApiConstant;
import api.demo.domain.employees.Employee;
import api.demo.domain.employees.EmployeeService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(ApiConstant.API_PREFIX + "/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping()
    public ResponseModel<List<Employee>> getEmployees() {
        List<Employee> result = this.employeeService.getEmployees();

        return new ResponseModel<List<Employee>>(true, result);
    }
}
