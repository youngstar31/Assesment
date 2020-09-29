public class SalariedEmployee extends Employee implements IPayable{
    private int salary;

    public SalariedEmployee(String name, HireDate hireDate, int salary) {
        super(name, hireDate);
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                ", hireDate=" + hireDate +
                "} " + super.toString();
    }
}
