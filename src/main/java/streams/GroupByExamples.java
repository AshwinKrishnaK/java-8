package streams;

import model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class GroupByExamples {


    public static void main(String[] args) {
        Employee employee = new Employee();
        List<Employee> employees = employee.getAllEmployees();

        var employeeGender = employees.stream().collect(Collectors.groupingBy(Employee::getGender));
        employeeGender.forEach((k,v)-> System.out.println(k+" "+v));

       // var employeeAvgSalary = employees.stream().collect(Collectors.averagingDouble());
        //employeeAvgSalary.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
