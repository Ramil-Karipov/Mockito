package com.mockito.Mockito;

import model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class MockitoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockitoApplication.class, args);
        interface DepartmentService {
            List<Employee> getEmployeesByDepartmentId(int departmentId);

            int getSalarySumByDepartmentId(int departmentId);

            int getMaxSalaryByDepartmentId(int departmentId);

            int getMinSalaryByDepartmentId(int departmentId);

            Map<Integer, List<Employee>> getAllEmployeesByDepartment();
        }

    }
}
