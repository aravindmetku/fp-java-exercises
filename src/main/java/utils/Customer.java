package utils;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private String name;
    private int score;

    public static List<Customer> getList() {
        return List.of(
                Customer.builder().name("A").score(10).build(),
                Customer.builder().name("B").score(5).build(),
                Customer.builder().name("C").score(5).build()
        );
    }
}
