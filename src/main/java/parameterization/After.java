package parameterization;

import io.vavr.Function2;
import java.util.function.BiFunction;

public class After {

    public static int Aggregate(
            int initialVal,
            Function2<Integer, Integer, Integer> action,
            int n
    ) {
        int totalSoFar = initialVal;
        for (int i = 1; i <= n; i++) {
            totalSoFar = action.apply(totalSoFar, i);
        }
        return totalSoFar;
    }

    public static int AggregateJustJava(
            int initialVal,
            BiFunction<Integer, Integer, Integer> action,
            int n
    ) {
        int totalSoFar = initialVal;
        for (int i = 1; i <= n; i++) {
            totalSoFar = action.apply(totalSoFar, i);
        }
        return totalSoFar;
    }

    public static void main(String[] args) {
        Function2<Integer, Integer, Integer> product = (t, i) -> t * i;
        Function2<Integer, Integer, Integer> sum = (t, i) -> t + i;

        System.out.println(Aggregate(1, product, 10));
        System.out.println(AggregateJustJava(1, product, 10));

        System.out.println(Aggregate(0, sum, 10));
        System.out.println(AggregateJustJava(0, sum, 10));
    }
}
