public class Employee extends Person  {

    public Employee(String name, HireDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    public String printBadge(){

        return "Name: " + this.getName() + "\n" +
                "Type of employee: " + this.getClass().getSimpleName() + "\n" +
                "HireDate: " + this.getHireDate().getMonth() + "/" + this.getHireDate().getDay() + "/" + this.getHireDate().getYear();


    }
    public HireDate hireDate;



}
