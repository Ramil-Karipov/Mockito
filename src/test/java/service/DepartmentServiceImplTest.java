package service;

import model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class DepartmentServiceImplTest {

    @Mock
    EmployeeService employeeService;

    @InjectMocks
    DepartmentServiceImpl departmentService;

    @BeforeEach
    void init() {
        when(employeeService.getAllEmployees()).thenReturn(
                List.of(
                        new Employee("TEST1", 10, 1),
                        new Employee("TEST2", 20, 2),
                        new Employee("TEST3", 30, 3)
                )

        );
    }

    @Test
    void getEmployeesByDepartmentIdTest() {
        assertEquals(1, departmentService.getEmployeesByDepartmentId(10).size());
    }

    @Test
    void getSalarySumByDepartmentIdTest() {
        assertEquals(2, departmentService.getSalarySumByDepartmentId(20));
    }

    @Test
    void getMaxSalaryByDepartmentId() {
        assertEquals(3, departmentService.getMaxSalaryByDepartmentId(30));
    }

    @Test
    void getMinSalaryByDepartmentId() {
        assertEquals(3, departmentService.getMinSalaryByDepartmentId(30));
    }

    @Test
    void getAllEmployeesByDepartment() {
        assertEquals(3, departmentService.getAllEmployeesByDepartment().size());
    }
    }
