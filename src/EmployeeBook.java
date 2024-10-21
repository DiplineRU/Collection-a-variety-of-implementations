import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class EmployeeBook {
    private final Map<String, Employee> employees;

    public EmployeeBook(Map<String, Employee> employees) {
        this.employees = employees;
    }


    public void add(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname);
        if (employees.containsKey(employee.getFullName())) {
        }
        employees.put(employee.getFullName(), employee);
    }

    public Employee remove(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname);
        if (employees.containsKey(employee.getFullName())) {
        }
        return employees.remove(employee.getFullName());
    }

    public Employee find(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname);
        if (employees.containsKey(employee.getFullName())) {
        }
        return employees.get(employee.getFullName());
    }

    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employees.values());
    }

    public int size() {
        return this.employees.size();
    }
}
