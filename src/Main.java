import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Employee> employees = new HashMap<>();
        employees.put("Gulyan", new Employee("Artem", "Gulyan"));

        EmployeeBook employeeBook = new EmployeeBook(employees);
        employeeBook.add("Pavel", "Komarov");
        employeeBook.add("Alex", "Novikov");

        System.out.println(employeeBook.size());
        employeeBook.remove("Alex", "Novikov");
        System.out.println(employeeBook.size());
        employeeBook.find("Pavel", "Komarov");
    }
}