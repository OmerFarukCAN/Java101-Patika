public class EmployeeManager {
    double tax, bonusFee = 0;
    double raise;

    public void tax(Employee employee) {
        if (employee.getSalary() > 1000) {
            tax = employee.getSalary() * 0.03;
            System.out.println("Tax withheld: " + tax);
        } else {
            System.out.println("Tax withheld: " + tax);
        }
    }

    public void bonus(Employee employee) {
        if (employee.getWorkHours() > 40) {
            bonusFee = (employee.getWorkHours() - 40) * 30;
            System.out.println("Bonus fee: " + bonusFee);
        }
    }

    public void raiseSalary(Employee employee) {
        if (2021 - employee.getHireYear() < 10) {
            raise = employee.getSalary() * 0.05;
        } else if (2021 - employee.getHireYear() < 20) {
            raise = employee.getSalary() * 0.1;
        } else {
            raise = employee.getSalary() * 0.15;
        }
        System.out.println("Salary increase: " + raise);
    }

    public void totalSalary(Employee employee) {
        employee.setSalary(employee.getSalary() + raise + bonusFee - tax);
    }
}
