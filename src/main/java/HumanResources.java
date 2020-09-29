import java.util.ArrayList;
import java.util.Collections;

public class HumanResources {

    public void issueBadge(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee instanceof SalariedEmployee) {
                System.out.println(employee.printBadge());
            } else if (employee instanceof HourlyEmployee) {
                System.out.println(employee.printBadge());
            } else {
                System.out.println("You do not work here");
            }
        }

    }

    private void printPaymentInfo(IPayable person) {
        System.out.println(person.getClass().getSimpleName() + " should be paid $" + person.calculatePay());
    }

    public void payPerson(IPayable[] people) {
        for (IPayable person : people) {
            printPaymentInfo(person);

        }

    }

    public void sortPeopleByIncome(ArrayList<IPayable> people) {
        Collections.sort(people, new SortPeople());
        for (IPayable person : people) {
            System.out.println(person.getClass().getSimpleName() + " should be paid $" + person.calculatePay());

        }




    }

}
