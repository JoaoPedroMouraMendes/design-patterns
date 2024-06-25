package strategyPattern;

public class EmployeeCLT extends Employee implements SalaryAdjustment {

    public EmployeeCLT(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void salaryAdjustment() {
        salary += salary * 0.1f;
    }
}
