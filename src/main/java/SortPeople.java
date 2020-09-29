import java.util.Comparator;

public class SortPeople implements Comparator<IPayable> {


    @Override
    public int compare(IPayable p1, IPayable p2) {
        if (p1.calculatePay() > p2.calculatePay()) {
            return 1;
        } else {
            return -1;

        }

    }





}
