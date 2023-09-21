import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
          new Employee(12, "Saif", "Dev", 155.5),
          new Employee(13, "Mohamed", "Support", 166.5),
          new Employee(14, "Khaled", "Dev", 177.5),
          new Employee(15, "Arwa", "Support", 188.1),
          new Employee(16, "Eyad", "Dev", 199.2),
          new Employee(17, "Yousef", "Support", 222.2),
          new Employee(18, "Rahma", "Dev", 333.3),
          new Employee(19, "Ziyad", "Support", 444.4)
        );

        EmployeeProcessor employeeProcessor = new EmployeeProcessor();

        //By Department
        List<Employee> devEmployees = employeeProcessor.getEmployeesInDepartment(employees, "Dev");
        devEmployees.forEach(System.out::println);

        //
        System.out.println();

        //Get Names
        List<String> employeeNames = employeeProcessor.getEmployeesNames(employees);
        employeeNames.forEach(System.out::println);

        //
        System.out.println();

        //Get salary sum
        double salarySum = employeeProcessor.getSalarySum(employees);
        System.out.println(salarySum);

        //Increment Employees salaries
        List<Employee> incrementedSalaries = employeeProcessor.
                getIncrementedEmployeesSalaries(employees, 0.5);
        incrementedSalaries.forEach(System.out::println);


    }
}