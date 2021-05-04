package monoid;

import java.util.List;
import utils.Customer;

public class Associativity {

    public static Integer getTotalScore(List<Customer> list) {
        // map reduce
        return list.parallelStream().map(Customer::getScore).reduce(0, Integer::sum, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(getTotalScore(Customer.getList()));
    }
}
