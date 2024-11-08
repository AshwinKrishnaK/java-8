package streams;

import model.Employee;

import java.util.List;
import java.util.function.Predicate;

public class FilterExamples {

    public static void main(String[] args) {
        Employee employee = new Employee();
        List<Employee> employees = employee.getAllEmployees();

        //Male Employees
        Predicate<Employee> isMale = employee1 -> employee1.getGender().equals("Male");
        var maleEmployee = employees.stream().filter(isMale).toList();
        maleEmployee.forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------------------------------");

        //IT Department model.Employee
        var ItEmployees = employees.stream().filter(employee1 -> employee1.getDepartment().equals("IT")).toList();
        ItEmployees.forEach(System.out::println);

    }
}
