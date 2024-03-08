package service;


import model.Employee;

public class TestUtils {
    public static Employee getEmployee(String name, Integer salary, Integer dep) {
        return new Employee(name, salary, dep);
    }
}
