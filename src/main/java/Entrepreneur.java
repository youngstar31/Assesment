public class Entrepreneur extends Person implements IPayable {
    private double income;

    public Entrepreneur(String name, double income) {
        super(name);
        this.income = income;
    }

    public double getIncome() {

        return income;
    }

    @Override
    public double calculatePay() {
        return income;
    }

    @Override
    public String toString() {
        return "Entrepreneur{" +
                "income=" + income +
                "} " + super.toString();
    }
}
