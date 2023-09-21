import java.util.List;
import java.util.stream.Collectors;

public class EmployeeProcessor {
    public List<Employee> getEmployeesInDepartment(List<Employee> employees, String department) {
        return employees.stream().filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

    public List<String> getEmployeesNames(List<Employee> employees) {
        return employees.stream().map(employee -> employee.getName())
                .collect(Collectors.toList());
    }

    public Double getSalarySum(List<Employee> employees) {
        return employees.stream().map(employee -> employee.getSalary())
                .reduce(0.0, (a, b) -> a +b);
    }

    public List<Employee> getIncrementedEmployeesSalaries(List<Employee> employees, double incrementPercentage){
        return  employees.stream().
                map(employee -> new Employee(employee.getId(), employee.getName(), employee.getDepartment(),
                        employee.getSalary() * (1 + incrementPercentage))).
                collect(Collectors.toList());
    }
}
