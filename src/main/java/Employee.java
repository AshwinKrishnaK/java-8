import java.util.ArrayList;
import java.util.List;

public class Employee {
        private int id;
        private String name;
        private int age;
        private double salary;
        private String department;
        private String gender;

        public Employee(){
        }

        public Employee(int id, String name, int age, double salary, String department, String gender) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.department = department;
            this.gender = gender;
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", 30, 50000, "HR", "Male"));
        employees.add(new Employee(2, "Jane Smith", 25, 60000, "Finance", "Female"));
        employees.add(new Employee(3, "Michael Johnson", 35, 70000, "IT", "Male"));
        employees.add(new Employee(4, "Emily Davis", 28, 55000, "Marketing", "Female"));
        employees.add(new Employee(5, "James Brown", 40, 80000, "IT", "Male"));
        employees.add(new Employee(6, "Patricia Wilson", 45, 75000, "Finance", "Female"));
        employees.add(new Employee(7, "Robert Taylor", 50, 90000, "HR", "Male"));
        employees.add(new Employee(8, "Linda Martinez", 32, 65000, "Marketing", "Female"));
        employees.add(new Employee(9, "David Anderson", 38, 72000, "IT", "Male"));
        employees.add(new Employee(10, "Mary Thomas", 27, 58000, "Finance", "Female"));
        employees.add(new Employee(11, "Andrew Harris", 29, 61000, "HR", "Male"));
        employees.add(new Employee(12, "Sarah Lee", 33, 68000, "Finance", "Female"));
        employees.add(new Employee(13, "Steven Clark", 41, 74000, "IT", "Male"));
        employees.add(new Employee(14, "Laura Scott", 26, 53000, "Marketing", "Female"));
        employees.add(new Employee(15, "Kevin Lewis", 37, 67000, "IT", "Male"));
        employees.add(new Employee(16, "Betty Walker", 48, 79000, "Finance", "Female"));
        employees.add(new Employee(17, "Joshua Hall", 34, 82000, "HR", "Male"));
        employees.add(new Employee(18, "Megan Young", 31, 64000, "Marketing", "Female"));
        employees.add(new Employee(19, "Aaron King", 45, 85000, "IT", "Male"));
        employees.add(new Employee(20, "Alice Green", 30, 59000, "Finance", "Female"));
        return employees;
    }
}
