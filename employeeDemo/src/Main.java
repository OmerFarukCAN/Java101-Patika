public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Omer Faruk", 2000, 45.0, 1985);
        EmployeeManager employeeManager = new EmployeeManager();

        System.out.println(employee1);

        employeeManager.tax(employee1);
        employeeManager.bonus(employee1);
        employeeManager.raiseSalary(employee1);
        employeeManager.totalSalary(employee1);
        System.out.println("Total salary: " + employee1.getSalary());
    }
}