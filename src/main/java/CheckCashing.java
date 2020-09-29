import java.util.ArrayList;
import java.util.Collections;

public class CheckCashing {


    public static void main(String[] args) {
        Entrepreneur entrepreneur = new Entrepreneur("Asher",20000.00);
        HireDate salariedEmployeeHireDate = new HireDate(7,24,2002);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Nate",salariedEmployeeHireDate,1000);
        HireDate hourlyEmployeeHireDate = new HireDate(11,19,1996);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Khairi",hourlyEmployeeHireDate,40,10);

        HumanResources humanResources = new HumanResources();

        IPayable[] people = {salariedEmployee, hourlyEmployee, entrepreneur};

        Employee[] employees = {salariedEmployee,hourlyEmployee};

        humanResources.issueBadge(employees);

        System.out.println('\n');

        System.out.println("Prior to sorting people by pay...");
        humanResources.payPerson(people);

        ArrayList<IPayable> unsortedPeople = new ArrayList<IPayable>();
        unsortedPeople.add(salariedEmployee);
        unsortedPeople.add(hourlyEmployee);
        unsortedPeople.add(entrepreneur);

        System.out.println('\n');

        System.out.println("After sorting people by pay...");
        humanResources.sortPeopleByIncome(unsortedPeople);



    }
}
