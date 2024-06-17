package strategyPattern;

public class EmployeePJ extends Employee implements SalaryAdjustment {
    public EmployeePJ(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void salaryAdjustmen() {
        salary += salary * 0.05f;
    }
}
